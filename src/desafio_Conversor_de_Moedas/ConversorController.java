package desafio_Conversor_de_Moedas;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import java.text.DecimalFormat;

public class ConversorController {

	public double valor;
	public double resultado;
		

	public static boolean isNumeric(String str) {
		try {
			Double.parseDouble(str);
			return true;
		} catch (NumberFormatException e) {
			return false;
		}
	}

	private void confirmDialog() {
		// TODO Auto-generated method stub
		ImageIcon icon = new ImageIcon("src/images/dialog006.png");
		int input = JOptionPane.showConfirmDialog(null, "Deseja continuar?", "Selecione uma opção",
				JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, icon);
		if (input == 0) {
			String msg = "Voltando a tela de moedas";
			JOptionPane.showMessageDialog(null, msg);
						
		} else if (input == 1) {
			String msg = "Programa finalizado";
			JOptionPane.showMessageDialog(null, msg);
			 System. exit(0);
		} else if (input == 2) {
			String msg = "Programa concluido";
			JOptionPane.showMessageDialog(null, msg);
			
		}
	}

	public void Convert(double taxa, String moeda, String balanca) {
		// TODO Auto-generated method stub
		String inputValue = JOptionPane.showInputDialog("Digite um valor:");
		if (isNumeric(inputValue) && balanca == "maior") {

			double valor = Double.parseDouble(inputValue);
			this.valor = valor;
			double calc = valor / taxa;
			DecimalFormat df = new DecimalFormat("#,###.00");
			df.format(calc);
			this.resultado = calc;
			String msg = "O valor convertido para " + moeda + "R$" + calc;
			JOptionPane.showMessageDialog(null, msg);
			confirmDialog();
			

		} else if (isNumeric(inputValue) && balanca == "menor") {
			double valor = Double.parseDouble(inputValue);
			this.valor = valor;
			double calc = valor * taxa;
			DecimalFormat df = new DecimalFormat("#,###.00");
			df.format(calc);
			this.resultado = calc;
			String msg = "O valor convertido para  " + moeda + "R$" + calc;
			JOptionPane.showMessageDialog(null, msg);
			confirmDialog();
			
		} else {
			String msg = "Digite apenas numeros!";
			JOptionPane.showMessageDialog(null, msg);
		}

	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	public double getValor() {
		return valor;
	}

	public void setResultado(double resultado) {
		this.resultado = resultado;
	}

	public double getResultado() {
		return resultado;
	}

}
