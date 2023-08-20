package com.one.entradaApp.ar;

import javax.swing.JOptionPane;
import com.one.conversorMoneda.ar.ConversorEntradaInterfaz;
import com.one.conversorTemperatura.ar.ConversorTemperatura;
import com.one.conversorTemperatura.ar.TemperaturaEntradaInterfaz;

public class EntradaApp {

	// Metodo para validar input del usuario
	public static boolean validarNumero(String input) {
		try {
			double numero = Double.parseDouble(input);
			if (numero >= 0 || numero < 0)
				;
			return true;
		} catch (NumberFormatException e) {
			return false;
		}
	}

	public static void main(String[] args) {
		
		try {
			ConversorEntradaInterfaz monedas=new ConversorEntradaInterfaz();
			TemperaturaEntradaInterfaz temperatura=new TemperaturaEntradaInterfaz();
			
			boolean continuarCiclo=true;
			
			while(continuarCiclo) {
				// Cuadro de dialogo-menu principal
				Object[] opciones = { "Conversor de monedas", "Conversor de temperatura"};
				String tipos = (JOptionPane.showInputDialog(null, "Selecciona el tipo de conversión que deseas", "Menu",
						JOptionPane.QUESTION_MESSAGE, null, opciones, "Seleccion")).toString();
				if(tipos==null) {
					System.exit(0);
					}
				switch (tipos) {
				case "Conversor de monedas":
					String input = JOptionPane.showInputDialog("Ingresa la cantidad de dinero que deseas convertir: ");
					if (validarNumero(input) == true) {
						double cantidad=Double.parseDouble(input);
						monedas.ConversorDeMonedas(cantidad);
						int respuesta=JOptionPane.showConfirmDialog(null, "¿Deseas realizar otra conversión?");
						if(JOptionPane.OK_OPTION!=respuesta) {
							JOptionPane.showMessageDialog(null, "Programa finalizado, gracias por utilizar la app");
							continuarCiclo=false;
							System.exit(0);
						}
					}else {
					
						JOptionPane.showMessageDialog(null,"Entrada invalida");
					}
					break;
				case "Conversor de temperatura":
					input = JOptionPane.showInputDialog("Ingresa el valor de temperatura: ");
					if (validarNumero(input) == true) {
						double cantidad=Double.parseDouble(input);
						temperatura.convertirTemperatura(cantidad);;
						int respuesta=JOptionPane.showConfirmDialog(null, "¿Deseas realizar otra conversión de temperatura?");
						if(JOptionPane.OK_OPTION!=respuesta) {
							JOptionPane.showMessageDialog(null, "Programa finalizado, gracias por utilizar la app");
							continuarCiclo=false;
							System.exit(0);
						}
					}else {
					
						JOptionPane.showMessageDialog(null,"Entrada invalida");
					}
					break;
					
				}
			}
		}
			
		catch(Exception e) {
		e.printStackTrace();
	}
		
		

		
	}
	
}