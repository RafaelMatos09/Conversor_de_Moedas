package desafio_Conversor_de_Moedas;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import java.text.DecimalFormat;

public class ConversorController {

	public void Convert(double taxa, String moeda, String balanca) {
		
		String inputValue = JOptionPane.showInputDialog("Digite um valor:");
		try {
			if (balanca == "maior") {

				double valor = Double.parseDouble(inputValue);

				double calc = valor / taxa;
				DecimalFormat df = new DecimalFormat("#,###.00");
				df.format(calc);

				String msg = "O valor convertido para " + moeda + "$ " + calc;
				JOptionPane.showMessageDialog(null, msg);
				confirmDialog();

			} else if (balanca == "menor") {
				double valor = Double.parseDouble(inputValue);

				double calc = valor * taxa;
				DecimalFormat df = new DecimalFormat("#,###.00");
				df.format(calc);

				String msg = "O valor convertido para  " + moeda + "$ " + calc;
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

}
