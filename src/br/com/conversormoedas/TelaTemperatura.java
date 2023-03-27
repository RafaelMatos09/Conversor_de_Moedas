package br.com.conversormoedas;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JComboBox;
import javax.swing.JButton;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class TelaTemperatura extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaTemperatura frame = new TelaTemperatura();
					frame.setVisible(true);
					frame.setLocationRelativeTo(null);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public TelaTemperatura() {
		setTitle("Temperatura");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Converter Celsius para Fahrenheit", "Converter Fahrenheit para Celsius", "Converter Celsius para Kelvin", "Converter Kelvin para Celsius", "Converter Kelvin para Fahrenheit", "Converter Fahrenheit para Kelvin"}));
		comboBox.setBounds(124, 114, 188, 22);
		contentPane.add(comboBox);
		
		JButton btnNewButton = new JButton("Selecionar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String seleciona = comboBox.getSelectedItem().toString();
				if(seleciona.equals("Converter Celsius para Fahrenheit")) {
					ConversorTemperatura cf = new ConversorTemperatura();
					cf.converterCelsiusParaFahrenheit();
					
				} else if (seleciona.equals("Converter Fahrenheit para Celsius")) {
					ConversorTemperatura fc = new ConversorTemperatura();
					fc.converterFahrenheitParaCelsius();
				
				} else if (seleciona.equals("Converter Celsius para Kelvin")) {
					ConversorTemperatura ck = new ConversorTemperatura();
					ck.converterCelsiusParaKelvin();
				} else if (seleciona.equals("Converter Kelvin para Celsius")) {
					ConversorTemperatura kc = new ConversorTemperatura();
					kc.converterKelvinParaCelsius();
				} else if (seleciona.equals("Converter Kelvin para Fahrenheit")) {
					ConversorTemperatura kf = new ConversorTemperatura();
					kf.converterKelvinParaFahrenheit();
				} else if (seleciona.equals("Converter Fahrenheit para Kelvin")) {
					ConversorTemperatura fk = new ConversorTemperatura();
					fk.converterFahrenheitParaKelvin();
				}
			}
		});
		btnNewButton.setBounds(124, 147, 89, 23);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Menu");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				TelaMenu frame2 = new TelaMenu();
				frame2.setVisible(true);
				frame2.setLocationRelativeTo(null);
				dispose();
			}
		});
		btnNewButton_1.setBounds(223, 147, 89, 23);
		contentPane.add(btnNewButton_1);
	}
}
