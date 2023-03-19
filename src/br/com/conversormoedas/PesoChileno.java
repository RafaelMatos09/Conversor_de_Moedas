package br.com.conversormoedas;

import java.text.DecimalFormat;

import javax.swing.JOptionPane;

public class PesoChileno extends Moeda {
	public PesoChileno() {
		super("Peso Chileno", "$", 158.61);
	}

	public void convertPCR(Moeda moeda) {

		double valorC = moeda.getValorConvertido();
		moeda.formatOutVR(valorC);

	}

	public void convertRPC(Moeda moeda) {

		double valorC = moeda.getValorConvertido();
		moeda.formatOutRV(valorC);

	}
}
