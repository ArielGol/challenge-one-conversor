package com.one.conversorTemperatura.ar;

import javax.swing.JOptionPane;

public class ConversorTemperatura {
	public double convertirCelsiusAFahrenheit(double temperatura) {
		double fahrenheit=(temperatura*1.8)+32;
		fahrenheit=(double)Math.round(fahrenheit*100d)/100;
		JOptionPane.showMessageDialog(null,temperatura+"°C"+" grados Celsius son "+fahrenheit+" °F"+ " grados Fahrenheit");
		return fahrenheit;
	}
	public double convertirCelsiusAKelvin(double temperatura) {
		double kelvin=temperatura+273.15;
		kelvin=(double)Math.round(kelvin*100d)/100;
		JOptionPane.showMessageDialog(null,temperatura+"°C"+" grados Celsius son "+kelvin+"K"+" grados Kelvin");
		return kelvin;
	}
	public double convertirCelsiusARankine(double temperatura) {
		double rankine=(temperatura*1.8)+491.67;
		rankine=(double)Math.round(rankine*100d)/100;
		JOptionPane.showMessageDialog(null,temperatura+"°C"+" grados Celsius son "+rankine+"R"+" grados Rankine");
		return rankine;
	}
	public double convertirFahrenheitACelsius(double temperatura) {
		double celsius=(temperatura-32)/1.8;
		celsius=(double)Math.round(celsius*100d)/100;
		JOptionPane.showMessageDialog(null,temperatura+"°F"+" grados Fahrenheit son "+celsius+"°C"+" grados Celsius");
		return celsius;
	}
	public double convertirKelvinACelsius(double temperatura) {
		double celsius=(temperatura-273.15);
		celsius=(double)Math.round(celsius*100d)/100;
		JOptionPane.showMessageDialog(null,temperatura+"K"+" grados Kelvin son "+celsius+"°C"+" grados Celsius");
		return celsius;
	}
	public double convertirRankineACelsius(double temperatura) {
		double celsius=(temperatura-491.67)/1.8;
		celsius=(double)Math.round(celsius*100d)/100;
		JOptionPane.showMessageDialog(null,temperatura+"R"+" grados Rankine son "+celsius+"°C"+" grados Celsius");
		return celsius;
	}



}
