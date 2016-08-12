package formlar;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import core.Test;
import formlar.BiletIptal;
import formlar.BiletSorgu;
import formlar.Giris;

import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Color;

import javax.swing.ComboBoxModel;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;

public class AnaSayfa extends JFrame {

	private JPanel contentPane;
	private int mac_id;

	public int getMac_id() {
		return mac_id;
	}

	public void setMac_id(int mac_id) {
		this.mac_id = mac_id;
	}

	final JLabel label = new JLabel("Ma\u00E7lar :");

	String a;
	final JComboBox comboBox = new JComboBox();

	static String[] liste = null;
	static String[] liste2 = null;
	static ArrayList<String> k = new ArrayList<String>();
	static String[] m = new String[k.size()];

	static AnaSayfa frame = new AnaSayfa();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {

					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public AnaSayfa(String[] a, String[] b) {
		a = liste;
		b = liste2;

	}

	public AnaSayfa() {
		setTitle("Anasayfa");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 607, 377);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblMalar = new JLabel("MA\u00C7LAR:");

		lblMalar.setBackground(new Color(0, 0, 0));
		lblMalar.setHorizontalAlignment(SwingConstants.CENTER);
		lblMalar.setForeground(new Color(0, 0, 255));
		lblMalar.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblMalar.setBounds(75, 100, 139, 14);
		contentPane.add(lblMalar);

		JButton btnNewButton = new JButton("B\u0130LET \u0130PTAL");
		btnNewButton.setFocusPainted(false);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (comboBox.getSelectedItem().toString() == "Seçiniz") {
					JOptionPane.showMessageDialog(null, "Lütfen bir maç seçiniz!!");
					return;
				} else {
					BiletIptal ornek = new BiletIptal();

					frame.dispose();
					ornek.setVisible(true);
				}
			}
		});

		btnNewButton.setBounds(90, 204, 109, 23);
		contentPane.add(btnNewButton);

		JButton btnNewButton_1 = new JButton("B\u0130LET AL");
		btnNewButton_1.setFocusPainted(false);
		btnNewButton_1.addActionListener(new ActionListener() {

			@SuppressWarnings("deprecation")
			public void actionPerformed(ActionEvent arg0)
			{
				if (comboBox.getSelectedItem().toString() == "Seçiniz") {
					JOptionPane.showMessageDialog(null, "Lütfen bir maç seçiniz!!");
					return;
				} else {
					String[] h = getComboBox().split(" - ");
					try {
						setMac_id(Test.takimMacId(h[0], h[1]));
					} catch (SQLException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
					Giris ornek = new Giris(getMac_id());
					frame.dispose();

					try {
						String foto1 = Test.takimAdiSorgula(h[0]);
						String foto2 = Test.takimAdiSorgula(h[1]);
						ornek.resimyukle(foto1, foto2);
						ornek.lblNewLabel_6.setText(h[0]);
						ornek.label.setText(h[1]);
						System.out.println();
						String k;

						k = Test.takimSahaSorgula(h[0]);

						ornek.lblYer.setText(k);

						String s;
						s = Test.takimSaatSorgula(h[0], h[1]);
						ornek.lblSaat.setText(s);

						String w;
						w = Test.takimZamanSorgula(h[0], h[1]);
						ornek.lblTarih.setText(w);

					} catch (SQLException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					ornek.setVisible(true);
				}
			}
		});
		btnNewButton_1.setBounds(267, 204, 93, 23);
		contentPane.add(btnNewButton_1);

		JButton btnNewButton_2 = new JButton("B\u0130LET SORGULA");
		btnNewButton_2.setFocusPainted(false);
		btnNewButton_2.setIcon(null);
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (comboBox.getSelectedItem().toString() == "Seçiniz") {
					JOptionPane.showMessageDialog(null, "Lütfen bir maç seçiniz!!");
					return;
				} else {
					BiletSorgu ornek = new BiletSorgu();
					ornek.setVisible(true);
				}
			}
		});
		btnNewButton_2.setBounds(403, 204, 131, 23);
		contentPane.add(btnNewButton_2);

		Test test = new Test();

		try {
			liste = test.Listele("takim1_id");

		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}

		try {
			liste2 = test.Listele("takim2_id");
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		k.add(liste[0]);
		for (int i = 1; i < liste.length; i++) {
			k.add(liste[i] + " - " + liste2[i]);
		}
		m = k.toArray(m);

		@SuppressWarnings("rawtypes")
		ComboBoxModel<String> illermodel = new DefaultComboBoxModel(m);
		comboBox.setModel(illermodel);
		comboBox.setBounds(259, 99, 220, 20);
		contentPane.add(comboBox);
		
		JButton btnNewButton_3 = new JButton("");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) 
			{
				System.exit(1);
			}
		});
		btnNewButton_3.setBackground(new Color(255, 0, 0));
		btnNewButton_3.setIcon(new ImageIcon("C:\\Users\\busra yilmaz\\workspace\\stadyum_project\\bin\\\u00E7\u0131k\u0131\u015F.png"));
		btnNewButton_3.setBounds(517, 262, 49, 44);
		contentPane.add(btnNewButton_3);

		JLabel lblNewLabel = new JLabel(new ImageIcon("C:\\Users\\busra yilmaz\\workspace\\stadyum_project\\bin\\anasayfa.jpg"));
		lblNewLabel.setText("");
		lblNewLabel.setBackground(Color.DARK_GRAY);
		lblNewLabel.setBounds(0, 2, 591, 336);
		contentPane.add(lblNewLabel);

	}

	public String getComboBox() {
		a = comboBox.getSelectedItem().toString();
		return a;
	}

	public static String[] getM() {
		return m;
	}

	public static void setM(String[] m) {
		AnaSayfa.m = m;
	}

	public static String[] getListe() {
		return liste;
	}

	public static void setListe(String[] liste) {
		AnaSayfa.liste = liste;
	}

	public static String[] getListe2() {
		return liste2;
	}

	public static void setListe2(String[] liste2) {
		AnaSayfa.liste2 = liste2;
	}
}
