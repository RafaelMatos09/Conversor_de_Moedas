package desafio_Conversor_de_Moedas;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.HashMap;
import java.util.Map;

public class ConversorController {

	private Map<String, Double> conversoes;
	private static final String MAIOR = "maior";
	private static final String MENOR = "menor";

	public ConversorController() {
		this.conversoes = new HashMap<>();
		this.conversoes.put("Dolar", 5.2);
		this.conversoes.put("Euro", 5.5);
		this.conversoes.put("Libra Esterlina", 6.2);
		this.conversoes.put("Peso Argentino", 37.46);
		this.conversoes.put("Peso Chileno", 158.61);

	}

	public void Convert(String moeda, String moedaC, String balanca) {

		double taxa = this.conversoes.get(moeda);
		String inputValue = JOptionPane.showInputDialog("Digite um valor:");
		try {
			if (balanca.equals(MAIOR)) {
				double valor = Double.parseDouble(inputValue);
				double calc = valor / taxa;
				
				String valorFormatado = new DecimalFormat("#,##0.0000").format(toBigDecimal(calc));
				String msg = "O valor convertido para " + moedaC + " $ " + valorFormatado;
				JOptionPane.showMessageDialog(null, msg);
				confirmDialog();

			} else if (balanca.equals(MENOR)) {
				double valor = Double.parseDouble(inputValue);
				double calc = valor * taxa;
				
				String valorFormatado = new DecimalFormat("#,##0.0000").format(toBigDecimal(calc));

				String msg = "O valor convertido para  " + moedaC + " $ " + valorFormatado;
				JOptionPane.showMessageDialog(null, msg);
				confirmDialog();

			}

		} catch (NumberFormatException e) {
			String msg = "Digite apenas números!";
			JOptionPane.showMessageDialog(null, msg);
		}

	}

	private void confirmDialog() {

		ImageIcon icon = new ImageIcon("src/images/dialog006.png");
		int input = JOptionPane.showConfirmDialog(null, "Deseja continuar?", "Selecione uma opção",
				JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, icon);
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

	private BigDecimal toBigDecimal(double valor) {
		try {
			return new BigDecimal(valor).setScale(4, RoundingMode.HALF_EVEN);
		} catch (Exception ex) {
			return BigDecimal.ZERO;
		}
	}

}
