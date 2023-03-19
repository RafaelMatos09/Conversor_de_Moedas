package br.com.conversormoedas;

import java.text.DecimalFormat;

import javax.swing.JOptionPane;

public class LibrasEsterlinas extends Moeda {
	public LibrasEsterlinas() {
		super("Libras Esterlinas", "£", 6.2);
	}

	public void convertLR(Moeda moeda) {

		double valorC = moeda.getValorConvertido();
		moeda.formatOutVR(valorC);

	}

	public void convertRL(Moeda moeda) {

		double valorC = moeda.getValorConvertido();
		moeda.formatOutRV(valorC);

	}
}
