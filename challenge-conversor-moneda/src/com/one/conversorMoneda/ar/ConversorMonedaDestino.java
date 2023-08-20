package com.one.conversorMoneda.ar;

import javax.swing.JOptionPane;

public class ConversorMonedaDestino {
	
	public void convertirOrigenADolares(double cantidad) {
		double tasa=ConsumirAPIMonedas.solicitarTasaConversion("USD", "ARS");
		double monedaDolar=cantidad/tasa;
		monedaDolar = (double) Math.round(monedaDolar *100d)/100;
		JOptionPane.showInternalMessageDialog(null, "Tienes US$ "+monedaDolar+" Dolares");
	}
	public void convertirOrigenAEuros(double cantidad) {
		double tasa=ConsumirAPIMonedas.solicitarTasaConversion("EUR", "ARS");
		double monedaEuro=cantidad/tasa;
		monedaEuro = (double) Math.round(monedaEuro *100d)/100;
		JOptionPane.showInternalMessageDialog(null, "Tienes € "+monedaEuro+" Euros");
	}
	public void convertirOrigenALibrasEsterlinas(double cantidad) {
		double tasa=ConsumirAPIMonedas.solicitarTasaConversion("GBP", "ARS");
		double monedaLibras=cantidad/tasa;
		monedaLibras = (double) Math.round(monedaLibras *100d)/100;
		JOptionPane.showInternalMessageDialog(null, "Tienes £ "+monedaLibras+" Libras Esterlinas");
	}
	public void convertirOrigenAYenJapones(double cantidad) {
		double tasa=ConsumirAPIMonedas.solicitarTasaConversion("JPY", "ARS");
		double monedaYen=cantidad/tasa;
		monedaYen = (double) Math.round(monedaYen *100d)/100;
		JOptionPane.showInternalMessageDialog(null, "Tienes ¥ "+monedaYen+" Yen Japones");
	}
	public void convertirOrigenAWonSurCoreano(double cantidad) {
		double tasa=ConsumirAPIMonedas.solicitarTasaConversion("KRW", "ARS");
		double monedaWon=cantidad/tasa;
		monedaWon = (double) Math.round(monedaWon *100d)/100;
		JOptionPane.showInternalMessageDialog(null, "Tienes ₩ "+monedaWon+" Won Sur Coreano");
	}
}
