package com.one.conversorMoneda.ar;

import javax.swing.JOptionPane;

public class ConversorMonedaOrigen {
	public void convertirDolaresAOrigen(double cantidad) {
		double tasa=ConsumirAPIMonedas.solicitarTasaConversion("USD", "ARS");
		double monedaDolar=cantidad*tasa;
		monedaDolar = (double) Math.round(monedaDolar *100d)/100;
		JOptionPane.showInternalMessageDialog(null, "Tienes $ "+monedaDolar+" Pesos Argentinos");
	}
	public void convertirEurosAOrigen(double cantidad) {
		double tasa=ConsumirAPIMonedas.solicitarTasaConversion("EUR", "ARS");
		double monedaEuro=cantidad*tasa;
		monedaEuro = (double) Math.round(monedaEuro *100d)/100;
		JOptionPane.showInternalMessageDialog(null, "Tienes $ "+monedaEuro+" Pesos Argentinos");
	}
	public void convertirLibrasEsterlinasAOrigen(double cantidad) {
		double tasa=ConsumirAPIMonedas.solicitarTasaConversion("GBP", "ARS");
		double monedaLibras=cantidad*tasa;
		monedaLibras = (double) Math.round(monedaLibras *100d)/100;
		JOptionPane.showInternalMessageDialog(null, "Tienes $ "+monedaLibras+" Pesos Argentinos");
	}
	public void convertirYenJaponesAOrigen(double cantidad) {
		double tasa=ConsumirAPIMonedas.solicitarTasaConversion("JPY", "ARS");
		double monedaYen=cantidad*tasa;
		monedaYen = (double) Math.round(monedaYen *100d)/100;
		JOptionPane.showInternalMessageDialog(null, "Tienes $ "+monedaYen+" Pesos Argentinos");
	}
	public void convertirWonSurCoreanoAOrigen(double cantidad) {
		double tasa=ConsumirAPIMonedas.solicitarTasaConversion("KRW", "ARS");
		double monedaWon=cantidad*tasa;
		monedaWon = (double) Math.round(monedaWon *100d)/100;
		JOptionPane.showInternalMessageDialog(null, "Tienes $ "+monedaWon+" Pesos Argentinos");
	}
}
