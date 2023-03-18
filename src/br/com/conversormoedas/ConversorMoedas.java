package br.com.conversormoedas;

import java.text.DecimalFormat;

import javax.swing.JOptionPane;

public class ConversorMoedas {

	private static final String MAIOR = "maior";
	private static final String MENOR = "menor";
	public double valorFinal;

	public ConversorMoedas() {

	}

	public void convert(Moeda moeda, String balanca, String moedac) {

		String inputValue = JOptionPane.showInputDialog("Digite um valor:");

		try {
			if (balanca.equals(MAIOR)) {

				double valor = Double.parseDouble(inputValue);
				double calc = valor / moeda.getCambio();

				String valorFormatado = new DecimalFormat("#,##0.0000").format(calc);
				String msg = "O valor convertido de " + moeda.getNome() + "para " + moedac + moeda.getSimbolo()
						+ valorFormatado;
				JOptionPane.showMessageDialog(null, msg);

			} else if (balanca.equals(MENOR)) {
				double valor = Double.parseDouble(inputValue);
				double calc = valor * moeda.getCambio();

				String valorFormatado = new DecimalFormat("#,##0.0000").format(calc);

				String msg = "O valor convertido para  " + "Reais" + "$" + valorFormatado;
				JOptionPane.showMessageDialog(null, msg);

			}

		} catch (NumberFormatException e) {
			String msg = "Digite apenas números!";
			JOptionPane.showMessageDialog(null, msg);
		}

	}

	public double getValorFinal() {
		return valorFinal;
	}
}
