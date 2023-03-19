package br.com.conversormoedas;

public class NumeroZeroException extends RuntimeException {
	public NumeroZeroException() {
		super("O número não pode ser igual a zero.");
	}
}
