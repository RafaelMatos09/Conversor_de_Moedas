package br.com.conversormoedas;

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

public class TelaMoeda extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {

					TelaMoeda frame = new TelaMoeda();
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
	public TelaMoeda() {
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
					Moeda rd = new Dolar();
					rd.convert(rd, "maior");
					Dolar rds = new Dolar();
					rds.convertRD(rds);
				} else if (seleciona == "Converter de Reais a Euro") {
					Moeda re = new Euro();
					re.convert(re, "maior");
					Euro res = new Euro();
					res.convertRE(res);
				} else if (seleciona == "Converter de Reais a Libras Esterlinas") {
					Moeda rl = new LibrasEsterlinas();
					rl.convert(rl, "maior");
					LibrasEsterlinas rls = new LibrasEsterlinas();
					rls.convertRL(rls);
				} else if (seleciona == "Converter de Reais a Peso Argentino") {
					Moeda rpa = new PesoArgentino();
					rpa.convert(rpa, "menor");
					PesoArgentino rpas = new PesoArgentino();
					rpas.convertRPA(rpas);
				} else if (seleciona == "Converter de Reais a Peso Chileno") {
					Moeda rpc = new PesoChileno();
					rpc.convert(rpc, "menor");
					PesoChileno rpcs = new PesoChileno();
					rpcs.convertRPC(rpcs);
				} else if (seleciona == "Converter de Dólar a Reais") {
					Moeda dr = new Dolar();
					dr.convert(dr, "menor");
					Dolar drs = new Dolar();
					drs.convertDR(drs);
				} else if (seleciona == "Converter de Euro a Reais") {
					Moeda er = new Euro();
					er.convert(er, "menor");
					Euro ers = new Euro();
					ers.convertER(ers);
				} else if (seleciona == "Converter de Libras Esterlinas a Reais") {
					Moeda ler = new LibrasEsterlinas();
					ler.convert(ler, "menor");
					LibrasEsterlinas lers = new LibrasEsterlinas();
					lers.convertLR(lers);
				} else if (seleciona == "Converter de Peso argentino a  Reais") {
					Moeda par = new PesoArgentino();
					par.convert(par, "maior");
					PesoArgentino pars = new PesoArgentino();
					pars.convertPAR(pars);
				} else if (seleciona == "Converter de Peso Chileno a Reais") {
					Moeda pcr = new PesoChileno();
					pcr.convert(pcr, "maior");
					PesoChileno pcrs = new PesoChileno();
					pcrs.convertPCR(pcrs);
				}
			}
		});
		btnNewButton.setBounds(95, 135, 89, 23);
		contentPane.add(btnNewButton);

		JButton btnNewButton_1 = new JButton("Menu");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new TelaMenu().setVisible(true);
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