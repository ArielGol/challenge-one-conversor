package com.one.conversorMoneda.ar;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Scanner;

import org.json.JSONObject;

public class ConsumirAPIMonedas {
	public static double solicitarTasaConversion(String origen,String destino) {
		double conversionRate = 0;
		//SIEMPRE QUE SOLICITAMOS UNA INFO QUE PODRIA DEVOLVERNOS CUALQUIER TIPO DE ERROR DENERIAMOS UTILIZAR TRY CATCH
		try { 
		// Solicitar una petición
		//EndPoint de exchangerate
		//https://v6.exchangerate-api.com/v6/e4df7d2f6384c73c7b1c71b6/pair/USD/ARS
		String monedaOrigen=origen;
		String monedaDestino=destino;
		//Get nos permite realizar perticiones no sensibles como una busqueda
		URL url=new URL("https://v6.exchangerate-api.com/v6/e4df7d2f6384c73c7b1c71b6/pair/"+monedaOrigen+"/"+monedaDestino);
		//conectarlo a la url con este objeto HttpURLConnection
		HttpURLConnection conn=(HttpURLConnection) url.openConnection();
		conn.setRequestMethod("GET");
		conn.connect();
		
		//¿Petición correcta?
		//lectura del dicho codigo responseCode
		int responseCode=conn.getResponseCode();
		if(responseCode!=200) {
			throw new RuntimeException("Ocurrio un ERROR "+responseCode);
		}else {
			
			//Lectura de info de la API.Abrir un scanner que lea el flujo de datos
			StringBuilder informationString =new StringBuilder();
			Scanner scanner=new Scanner(url.openStream());
			while(scanner.hasNext()) {
				informationString.append(scanner.nextLine());
			}
			
			scanner.close();
			
			//Filtrar la informacion obtenida por consola
			
			JSONObject jsonObject=new JSONObject(informationString.toString());
			conversionRate=jsonObject.getDouble("conversion_rate");
			return conversionRate;

		}
		
		
	
	} catch(Exception e) {
		e.printStackTrace();
	}
		return conversionRate;

	}


}
