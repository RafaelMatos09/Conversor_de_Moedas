package br.com.conversormoedas;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JComboBox;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JLabel;

public class TelaMenu extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaMenu frame = new TelaMenu();
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
	public TelaMenu() {
		setTitle("Menu");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);

		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] { "Conversor de moedas", "Conversor de temperatura" }));
		comboBox.setBounds(116, 110, 186, 22);
		contentPane.add(comboBox);

		JButton btnNewButton = new JButton("Ok");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String seleciona = comboBox.getSelectedItem().toString();
				if (seleciona == "Conversor de moedas") {
					/* new TelaMoeda().setVisible(true); */
					TelaMoeda frame2 = new TelaMoeda();
					frame2.setVisible(true);
					frame2.setLocationRelativeTo(null);
					dispose();

				}
				if (seleciona == "Conversor de temperatura") {
					TelaTemperatura frame3 = new TelaTemperatura();
					frame3.setVisible(true);
					frame3.setLocationRelativeTo(null);
				}
			}
		});
		btnNewButton.setBounds(114, 140, 89, 23);
		contentPane.add(btnNewButton);

		JButton btnNewButton_1 = new JButton("Cancel");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();

			}
		});
		btnNewButton_1.setBounds(213, 140, 89, 23);
		contentPane.add(btnNewButton_1);

		JLabel lblNewLabel = new JLabel("Escolha uma opção");
		lblNewLabel.setBounds(116, 90, 186, 14);
		contentPane.add(lblNewLabel);
	}

}
