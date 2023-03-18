package br.com.conversormoedas;


import javax.swing.JOptionPane;

public abstract class Moeda {
	private String nome;
	private String simbolo;
	private double cambio;
	private static double valorConvertido;

	private static final String MAIOR = "maior";
	private static final String MENOR = "menor";

	public Moeda(String nome, String simbolo, double cambio) {
		this.nome = nome;
		this.simbolo = simbolo;
		this.cambio = cambio;

	}

	public String getNome() {
		return nome;
	}

	public String getSimbolo() {
		return simbolo;
	}

	public double getCambio() {
		return cambio;
	}

	public double getValorConvertido() {
		return valorConvertido;
	}

	public void convert(Moeda moeda, String balanca) {

		String inputValue = JOptionPane.showInputDialog("Digite um valor:");

		try {
			if (balanca.equals(MAIOR)) {

				double valor = Double.parseDouble(inputValue);
				double calc = valor / moeda.getCambio();
				this.valorConvertido = calc;


			} else if (balanca.equals(MENOR)) {
				double valor = Double.parseDouble(inputValue);
				double calc = valor * moeda.getCambio();
				this.valorConvertido = calc;

			}

		} catch (NumberFormatException e) {
			String msg = "Digite apenas números!";
			JOptionPane.showMessageDialog(null, msg);
		}

	}
	
	public void confirmDialog() {


		int input = JOptionPane.showConfirmDialog(null, "Deseja continuar?", "Selecione uma opção",
				JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE);
		if (input == 0) {
			String msg = "Voltando a tela de moedas";
			JOptionPane.showMessageDialog(null, msg);

		} else if (input == 1) {
			String msg = "Programa finalizado";
			JOptionPane.showMessageDialog(null, msg);
			System.exit(0);

		} else if (input == 2) {
			String msg = "Programa concluido";
			JOptionPane.showMessageDialog(null, msg);

		}
	}

}
