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
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Converter de Reais a Dólar", "Converter de Reais a Euro", "Converter de Reais a Libras Esterlinas", 
				"Converter de Reais a Peso Argentino", "Converter de Reais a Peso Chileno", "Converter de Dólar a Reais", "Converter de Euro a Reais", "Converter de Libras Esterlinas a Reais", 
				"Converter de Peso argentino a  Reais", "Converter de Peso Chileno a Reais"}));
		comboBox.setBounds(120, 102, 182, 22);
		contentPane.add(comboBox);
		
		JButton btnNewButton = new JButton("Ok");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String seleciona = comboBox.getSelectedItem().toString();
				  if(seleciona == "Converter de Reais a Dólar") {
					 ConversorController rd = new ConversorController();
					 rd.Convert(5.2,"Dolar", "maior");
				  } else if (seleciona == "Converter de Reais a Euro") {
					  ConversorController re = new ConversorController();
					  re.Convert(5.5, "Euro", "maior");
				  } else if (seleciona == "Converter de Reais a Libras Esterlinas" ) {
					  ConversorController rl = new ConversorController();
					  rl.Convert(6.2,"Libras", "maior");
				  } else if (seleciona == "Converter de Reais a Peso Argentino") {
					  ConversorController rpa = new ConversorController();
					  rpa.Convert(37.46, "Peso Argentino", "menor");
				  } else if (seleciona == "Converter de Reais a Peso Chileno") {
					  ConversorController rpc = new ConversorController();
					  rpc.Convert(158.61, "Peso Chileno", "menor");
				  } else if (seleciona == "Converter de Dólar a Reais") {
					  ConversorController dr = new ConversorController();
					  dr.Convert(5.2, "Reais", "menor");
				  } else if (seleciona == "Converter de Euro a Reais") {
					  ConversorController er = new ConversorController();
					  er.Convert(5.5, "Reais", "menor");
				  } else if (seleciona == "Converter de Libras Esterlinas a Reais") {
					  ConversorController ler = new ConversorController();
					  ler.Convert(6.2, "Reais", "menor");
				  } else if (seleciona == "Converter de Peso argentino a  Reais") {
					  ConversorController par = new ConversorController();
					  par.Convert(37.46, "Reais", "maior");
				  } else if (seleciona == "Converter de Peso Chileno a Reais") {
					  ConversorController pcr = new ConversorController();
					  pcr.Convert(158.61, "Reais", "maior");
				  }
			}
		});
		btnNewButton.setBounds(120, 135, 89, 23);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Menu");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new Menu().setVisible(true);
				dispose();
			}
		});
		btnNewButton_1.setBounds(213, 135, 89, 23);
		contentPane.add(btnNewButton_1);
		
		JLabel lblNewLabel = new JLabel("Escolha uma moeda para converter");
		lblNewLabel.setBounds(120, 77, 182, 14);
		contentPane.add(lblNewLabel);
	}

}
