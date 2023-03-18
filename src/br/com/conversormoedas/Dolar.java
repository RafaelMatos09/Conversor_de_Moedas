package br.com.conversormoedas;

import java.text.DecimalFormat;

import javax.swing.JOptionPane;

public class Dolar extends Moeda {
	public Dolar() {
		super("Dolar Americano", "$", 5.2);
	}

	public void convertDR(Moeda moeda) {
		double valorC = moeda.getValorConvertido();

		String valorFormatado = new DecimalFormat("#,##0.00").format(valorC);
		String msg = "O valor convertido de " + moeda.getNome() + " " + moeda.getSimbolo() + " a Reais $ "
				+ valorFormatado;
		JOptionPane.showMessageDialog(null, msg);
		moeda.confirmDialog();
	}

	public void convertRD(Moeda moeda) {

		double valorC = moeda.getValorConvertido();

		String valorFormatado = new DecimalFormat("#,##0.00").format(valorC);
		String msg = "O valor convertido de Reais a " + moeda.getNome() + " " + moeda.getSimbolo() + " "
				+ valorFormatado;
		JOptionPane.showMessageDialog(null, msg);
		moeda.confirmDialog();
	}
}
