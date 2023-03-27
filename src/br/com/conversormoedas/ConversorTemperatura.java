package br.com.conversormoedas;

import java.math.BigDecimal;

import javax.swing.JOptionPane;

public class ConversorTemperatura {
	
	 private BigDecimal valorConvertido;

	    public void converterCelsiusParaFahrenheit(){
	    	String inputValue = JOptionPane.showInputDialog("Digite um valor:");
			double valor = Double.parseDouble(inputValue);   
			valorConvertido = BigDecimal.valueOf(valor * 1.8 + 32);
			String msg = "Valor convertido de Celsius para Fahrenheit: " + valorConvertido;
			JOptionPane.showMessageDialog(null, msg);
	    }

	    public void converterFahrenheitParaCelsius(){
	    	String inputValue = JOptionPane.showInputDialog("Digite um valor:");
			double valor = Double.parseDouble(inputValue); 
	        valorConvertido = BigDecimal.valueOf((valor - 32) /1.8);
	        String msg = "Valor convertido de Fahrenheit para Celsius: " + valorConvertido;
			JOptionPane.showMessageDialog(null, msg);
	    }

	    public void converterCelsiusParaKelvin(){
	    	String inputValue = JOptionPane.showInputDialog("Digite um valor:");
			double valor = Double.parseDouble(inputValue);
	        valorConvertido = BigDecimal.valueOf(valor + 273);
	        String msg = "Valor convertido de Celsius para Kelvin: " + valorConvertido;
			JOptionPane.showMessageDialog(null, msg);
	    }

	    public void converterKelvinParaCelsius(){
	    	String inputValue = JOptionPane.showInputDialog("Digite um valor:");
			double valor = Double.parseDouble(inputValue);
	        valorConvertido = BigDecimal.valueOf(valor - 273);
	        String msg = "Valor convertido Kelvin para Celsius: " + valorConvertido;
			JOptionPane.showMessageDialog(null, msg);
	    }

	    public void converterKelvinParaFahrenheit(){
	    	String inputValue = JOptionPane.showInputDialog("Digite um valor:");
			double valor = Double.parseDouble(inputValue);
	        valorConvertido = BigDecimal.valueOf(1.8*(valor-273)+32);
	        String msg = "Valor convertido de Kelvin para Fahrenheit: " + valorConvertido;
			JOptionPane.showMessageDialog(null, msg);
	    }

	    public void converterFahrenheitParaKelvin(){
	    	String inputValue = JOptionPane.showInputDialog("Digite um valor:");
			double valor = Double.parseDouble(inputValue);
	        valorConvertido = BigDecimal.valueOf((valor + 459.67) *5/9);
	        String msg = "Valor convertido Fahrenheit para Kelvin: " + valorConvertido;
			JOptionPane.showMessageDialog(null, msg);
	    }
	    
	   
	    

}
