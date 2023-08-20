package com.one.conversorTemperatura.ar;

import javax.swing.JOptionPane;

public class TemperaturaEntradaInterfaz {
		ConversorTemperatura temperatura=new ConversorTemperatura();
		
		public void convertirTemperatura(double valorTemperatura) {
			Object[] operaciones= {"De grados celsius a grados fahrenheit","De grados celsius a grados kelvin","De grados celsius a rankine","De grados fahrenheit a grados celsius","De grados kelvin a grados celsius","De grados rankine a grados celsius"};
			String opcion=(JOptionPane.showInputDialog(null, "Elige el tipo de temperatura para convertir","Temperatura",JOptionPane.PLAIN_MESSAGE,null,operaciones,"Selección")).toString();
			
			switch(opcion) {
			case "De grados celsius a grados fahrenheit":
				temperatura.convertirCelsiusAFahrenheit(valorTemperatura);
				break;
			case "De grados celsius a grados kelvin":
				temperatura.convertirCelsiusAKelvin(valorTemperatura);
				break;
			case "De grados celsius a rankine":
				temperatura.convertirCelsiusARankine(valorTemperatura);
				break;
			case "De grados fahrenheit a grados celsius":
				temperatura.convertirFahrenheitACelsius(valorTemperatura);
				break;
			case "De grados kelvin a grados celsius":
				temperatura.convertirKelvinACelsius(valorTemperatura);
				break;
			case "De grados rankine a grados celsius":
				temperatura.convertirRankineACelsius(valorTemperatura);
				break;
			}
		}
}
