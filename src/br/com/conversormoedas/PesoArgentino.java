package br.com.conversormoedas;

import java.text.DecimalFormat;

import javax.swing.JOptionPane;

public class PesoArgentino extends Moeda {
	public PesoArgentino() {
		super("Peso Argentino", "$", 37.46);
	}

	public void convertPAR(Moeda moeda) {

		double valorC = moeda.getValorConvertido();
		moeda.formatOutVR(valorC);

	}

	public void convertRPA(Moeda moeda) {

		double valorC = moeda.getValorConvertido();
		moeda.formatOutRV(valorC);

	}
}
