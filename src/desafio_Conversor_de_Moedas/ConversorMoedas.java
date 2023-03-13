package desafio_Conversor_de_Moedas;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JComboBox;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ConversorMoedas extends JFrame {

	private JPanel contentPane;

	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {

					ConversorMoedas frame = new ConversorMoedas();
					frame.setVisible(true);
					

				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public ConversorMoedas() {
		setTitle("Moedas");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);

		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] { "Converter de Reais a Dólar",
				"Converter de Reais a Euro", "Converter de Reais a Libras Esterlinas",
				"Converter de Reais a Peso Argentino", "Converter de Reais a Peso Chileno",
				"Converter de Dólar a Reais", "Converter de Euro a Reais", "Converter de Libras Esterlinas a Reais",
				"Converter de Peso argentino a  Reais", "Converter de Peso Chileno a Reais" }));
		comboBox.setBounds(72, 102, 256, 22);
		contentPane.add(comboBox);

		JButton btnNewButton = new JButton("Ok");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String seleciona = comboBox.getSelectedItem().toString();
				if (seleciona == "Converter de Reais a Dólar") {
					ConversorController rd = new ConversorController();
					rd.Convert("Dolar", "Dolar ", "maior");
				} else if (seleciona == "Converter de Reais a Euro") {
					ConversorController re = new ConversorController();
					re.Convert("Euro", "Euro ", "maior");
				} else if (seleciona == "Converter de Reais a Libras Esterlinas") {
					ConversorController rl = new ConversorController();
					rl.Convert("Libra Esterlina", "Libras Esterlinas ", "maior");
				} else if (seleciona == "Converter de Reais a Peso Argentino") {
					ConversorController rpa = new ConversorController();
					rpa.Convert("Peso Argentino", "Peso Argentino ", "menor");
				} else if (seleciona == "Converter de Reais a Peso Chileno") {
					ConversorController rpc = new ConversorController();
					rpc.Convert("Peso Chileno","Peso Chileno ", "menor");
				} else if (seleciona == "Converter de Dólar a Reais") {
					ConversorController dr = new ConversorController();
					dr.Convert("Dolar", "Reais ", "menor");
				} else if (seleciona == "Converter de Euro a Reais") {
					ConversorController er = new ConversorController();
					er.Convert("Euro", "Reais ", "menor");
				} else if (seleciona == "Converter de Libras Esterlinas a Reais") {
					ConversorController ler = new ConversorController();
					ler.Convert("Libra Esterlina", "Reais ", "menor");
				} else if (seleciona == "Converter de Peso argentino a  Reais") {
					ConversorController par = new ConversorController();
					par.Convert("Peso Argentino", "Reais ", "maior");
				} else if (seleciona == "Converter de Peso Chileno a Reais") {
					ConversorController pcr = new ConversorController();
					pcr.Convert("Peso Chileno", "Reais ", "maior");
				}
			}
		});
		btnNewButton.setBounds(95, 135, 89, 23);
		contentPane.add(btnNewButton);

		JButton btnNewButton_1 = new JButton("Menu");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new Menu().setVisible(true);
				dispose();
			}
		});
		btnNewButton_1.setBounds(214, 135, 89, 23);
		contentPane.add(btnNewButton_1);

		JLabel lblNewLabel = new JLabel("Escolha uma moeda para converter");
		lblNewLabel.setBounds(72, 77, 256, 14);
		contentPane.add(lblNewLabel);
	}

}
