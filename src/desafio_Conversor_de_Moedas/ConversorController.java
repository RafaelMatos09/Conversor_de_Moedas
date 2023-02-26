package desafio_Conversor_de_Moedas;

import javax.swing.JOptionPane;
import java.text.DecimalFormat;

public class ConversorController {
	
	public double valor;
	public double resultado;
	
	public static boolean isNumeric(String str) { 
		  try {  
		    Double.parseDouble(str);  
		    return true;
		  } catch(NumberFormatException e){  
		    return false;  
		  }  
		}
	
	public void Convert(double taxa, String moeda, String balanca) {
		// TODO Auto-generated method stub
		  String inputValue = JOptionPane.showInputDialog("Digite um valor:");
		  if(isNumeric(inputValue) && balanca == "maior") {
			  
			  double valor = Double.parseDouble(inputValue);
			  this.valor = valor;
			  double calc = valor / taxa;
			  DecimalFormat df = new DecimalFormat("#,###.00");
			  df.format(calc);
			  this.resultado = calc;
			  String msg = "O valor convertido para " + moeda + "R$" + calc;
			  JOptionPane.showMessageDialog(null, msg);
			  	  
			  
		  } else if (isNumeric(inputValue) && balanca == "menor") {
			  double valor = Double.parseDouble(inputValue);
			  this.valor = valor;
			  double calc = valor * taxa;
			  DecimalFormat df = new DecimalFormat("#,###.00");
			  df.format(calc);
			  this.resultado = calc;
			  String msg = "O valor convertido para  " + moeda + "R$" + calc;
			  JOptionPane.showMessageDialog(null, msg);
			  	  
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
