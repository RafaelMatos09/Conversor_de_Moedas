package br.com.conversormoedas;

public class Main {

	public static void main(String[] args) {
		try {
			TelaMenu frame = new TelaMenu();
			frame.setVisible(true);
			frame.setLocationRelativeTo(null);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
