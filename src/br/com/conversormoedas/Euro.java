package br.com.conversormoedas;

import java.text.DecimalFormat;

import javax.swing.JOptionPane;

public class Euro extends Moeda {
	public Euro() {
		super("Euro", "€", 5.5);
	}

	public void convertER(Moeda moeda) {
		double valorC = moeda.getValorConvertido();

		String valorFormatado = new DecimalFormat("#,##0.00").format(valorC);
		String msg = "O valor convertido de " + moeda.getNome() + " " + moeda.getSimbolo() + " a Reais $ "
				+ valorFormatado;
		JOptionPane.showMessageDialog(null, msg);
		moeda.confirmDialog();
	}

	public void convertRE(Moeda moeda) {

		double valorC = moeda.getValorConvertido();

		String valorFormatado = new DecimalFormat("#,##0.00").format(valorC);
		String msg = "O valor convertido de Reais a " + moeda.getNome() + " " + moeda.getSimbolo() + " "
				+ valorFormatado;
		JOptionPane.showMessageDialog(null, msg);
		moeda.confirmDialog();
	}
}
