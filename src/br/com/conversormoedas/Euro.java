package br.com.conversormoedas;

import java.text.DecimalFormat;

import javax.swing.JOptionPane;

public class Euro extends Moeda {
	public Euro() {
		super("Euro", "€", 5.5);
	}

	public void convertER(Moeda moeda) {
		double valorC = moeda.getValorConvertido();
		moeda.formatOutVR(valorC);

	}

	public void convertRE(Moeda moeda) {

		double valorC = moeda.getValorConvertido();
		moeda.formatOutRV(valorC);
	}
}
