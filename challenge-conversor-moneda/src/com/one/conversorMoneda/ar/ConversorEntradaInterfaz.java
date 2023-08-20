package com.one.conversorMoneda.ar;

import javax.swing.JOptionPane;

public class ConversorEntradaInterfaz {
	ConversorMonedaDestino moneda = new ConversorMonedaDestino();
	ConversorMonedaOrigen origen = new ConversorMonedaOrigen();

	public void ConversorDeMonedas(double cantidad) {
		Object[] operaciones = { "De Pesos Argentinos a Dolares", "De Pesos Argentinos a Euros",
				"De Pesos Argentinos a Libras Esterlinas", "De Pesos Argentinos a Yen Japones",
				"De Pesos Argentinos a Won Sur Coreano", "De Dolares a Pesos Argentinos", "De Euros a Pesos Argentinos",
				"De Libras Esterlinas a Pesos Argentinos", "De Yen Japones a Pesos Argentinos",
				"De Won Sur Coreano a Pesos Argentinos" };
		String opcion = (JOptionPane.showInputDialog(null, "Selecciona el tipo de moneda a la cual deseas convertir",
				"Monedas", JOptionPane.PLAIN_MESSAGE, null, operaciones, "Selección")).toString();

		switch (opcion) {
		case "De Pesos Argentinos a Dolares":
			moneda.convertirOrigenADolares(cantidad);
			break;
		case "De Pesos Argentinos a Euros":
			moneda.convertirOrigenAEuros(cantidad);
			break;
		case "De Pesos Argentinos a Libras Esterlinas":
			moneda.convertirOrigenALibrasEsterlinas(cantidad);
			break;
		case "De Pesos Argentinos a Yen Japones":
			moneda.convertirOrigenAYenJapones(cantidad);
			break;
		case "De Pesos Argentinos a Won Sur Coreano":
			moneda.convertirOrigenAWonSurCoreano(cantidad);
			break;

		case "De Dolares a Pesos Argentinos":
			origen.convertirDolaresAOrigen(cantidad);
			break;
		case "De Euros a Pesos Argentinos":
			origen.convertirEurosAOrigen(cantidad);
			break;
		case "De Libras Esterlinas a Pesos Argentinos":
			origen.convertirLibrasEsterlinasAOrigen(cantidad);
			break;
		case "De Yen Japones a Pesos Argentinos":
			origen.convertirYenJaponesAOrigen(cantidad);
			break;
		case "De Won Sur Coreano a Pesos Argentinos":
			origen.convertirWonSurCoreanoAOrigen(cantidad);
			break;
		}
	}
}
