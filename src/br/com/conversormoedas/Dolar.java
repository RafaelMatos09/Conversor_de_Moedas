package br.com.conversormoedas;

import java.text.DecimalFormat;

import javax.swing.JOptionPane;

public class Dolar extends Moeda {
	public Dolar() {
		super("Dolar Americano", "$", 5.2);
	}

	public void convertDR(Moeda moeda) {

		double valorC = moeda.getValorConvertido();
		moeda.formatOutVR(valorC);

	}

	public void convertRD(Moeda moeda) {

		double valorC = moeda.getValorConvertido();
		moeda.formatOutRV(valorC);

	}
}
