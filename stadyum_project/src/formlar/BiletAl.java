package formlar;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import core.Test;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.Color;
import java.awt.Font;
import java.util.ArrayList;
import java.util.Arrays;

import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.awt.event.ActionEvent;

public class BiletAl extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	// JLabel lblYer = new JLabel("New label");
	JLabel lblTarih = new JLabel("New label");
	JLabel lblSaat = new JLabel("New label");
	JLabel lblKategori_1 = new JLabel("KATEGOR\u0130:");
	JLabel label_1 = new JLabel("");
	JLabel label_2 = new JLabel("");
	JLabel label_3 = new JLabel("");
	JLabel lblYer = new JLabel("yer");
	public String[] dolu_koltuklar;
	int toplam_fiyat = 0;

	int mac_id;
	String blok = "";
	public int fiyat = 0;
	public ArrayList<String> koltuklar;
	Color yesil = new Color(46, 139, 87);
	Color turuncu = new Color(255, 153, 0);
	Color kirmizi = new Color(139, 0, 0);

	public JLabel lblKategori = new JLabel("");
	public JLabel lblFiyat = new JLabel("");

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {

					// biletal.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public BiletAl(int mac_id, String Blok) {
		this.mac_id = mac_id;
		this.blok = Blok;
		initComponent();
	}

	void initComponent() {
		ArrayList<String> liste = new ArrayList<String>();
		try {
			liste = Test.Sorgula_dolukoltuk(mac_id, lblKategori.getText(), blok);
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		dolu_koltuklar = new String[liste.size()];
		dolu_koltuklar = liste.toArray(dolu_koltuklar);

		// System.out.println(dolu_koltuklar[0]+ " "+ dolu_koltuklar[1]);

		koltuklar = new ArrayList<String>();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 695, 397);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(176, 196, 222));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);

		JButton btnNewButton = new JButton("");
		btnNewButton.setBounds(10, 46, 36, 23);
		if (Arrays.asList(dolu_koltuklar).contains("E1")) {
			btnNewButton.setBackground(kirmizi);
			btnNewButton.setEnabled(false);
		} else {
			btnNewButton.setBackground(yesil);
		}
		contentPane.setLayout(null);
		contentPane.add(btnNewButton);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				butonGuncelle(btnNewButton, "E1");
			}
		});
		JButton button = new JButton("");
		button.setBounds(56, 46, 36, 23);
		if (Arrays.asList(dolu_koltuklar).contains("E2")) {
			button.setBackground(kirmizi);
			button.setEnabled(false);
		} else {
			button.setBackground(yesil);
		}
		contentPane.add(button);
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				butonGuncelle(button, "E2");
			}
		});

		JButton button_1 = new JButton("");
		button_1.setBounds(102, 46, 36, 23);
		if (Arrays.asList(dolu_koltuklar).contains("E3")) {
			button_1.setBackground(kirmizi);
			button_1.setEnabled(false);
		} else {
			button_1.setBackground(yesil);
		}
		contentPane.add(button_1);
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				butonGuncelle(button_1, "E3");
			}
		});

		JButton button_2 = new JButton("");
		button_2.setBounds(148, 46, 36, 23);
		if (Arrays.asList(dolu_koltuklar).contains("E4")) {
			button_2.setBackground(kirmizi);
			button_2.setEnabled(false);
		} else {
			button_2.setBackground(yesil);
		}
		contentPane.add(button_2);
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				butonGuncelle(button_2, "E4");
			}
		});

		JButton button_3 = new JButton("");
		button_3.setBounds(194, 46, 36, 23);
		if (Arrays.asList(dolu_koltuklar).contains("E5")) {
			button_3.setBackground(kirmizi);
			button_3.setEnabled(false);
		} else {
			button_3.setBackground(yesil);
		}
		contentPane.add(button_3);
		button_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				butonGuncelle(button_3, "E5");
			}
		});

		JButton button_4 = new JButton("");
		button_4.setBounds(240, 46, 36, 23);
		if (Arrays.asList(dolu_koltuklar).contains("E6")) {
			button_4.setBackground(kirmizi);
			button_4.setEnabled(false);
		} else {
			button_4.setBackground(yesil);
		}
		contentPane.add(button_4);
		button_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				butonGuncelle(button_4, "E6");
			}
		});

		JButton button_5 = new JButton("");
		button_5.setBounds(10, 80, 36, 23);
		if (Arrays.asList(dolu_koltuklar).contains("D1")) {
			button_5.setBackground(kirmizi);
			button_5.setEnabled(false);
		} else {
			button_5.setBackground(yesil);
		}
		contentPane.add(button_5);
		button_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				butonGuncelle(button_5, "D1");
			}
		});

		JButton button_6 = new JButton("");
		button_6.setBounds(56, 80, 36, 23);
		if (Arrays.asList(dolu_koltuklar).contains("D2")) {
			button_6.setBackground(kirmizi);
			button_6.setEnabled(false);
		} else {
			button_6.setBackground(yesil);
		}
		contentPane.add(button_6);
		button_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				butonGuncelle(button_6, "D2");
			}
		});

		JButton button_7 = new JButton("");
		button_7.setBounds(102, 80, 36, 23);
		if (Arrays.asList(dolu_koltuklar).contains("D3")) {
			button_7.setBackground(kirmizi);
			button_7.setEnabled(false);
		} else {
			button_7.setBackground(yesil);
		}
		contentPane.add(button_7);
		button_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				butonGuncelle(button_7, "D3");
			}
		});

		JButton button_8 = new JButton("");
		button_8.setBounds(148, 80, 36, 23);
		if (Arrays.asList(dolu_koltuklar).contains("D4")) {
			button_8.setBackground(kirmizi);
			button_8.setEnabled(false);
		} else {
			button_8.setBackground(yesil);
		}
		contentPane.add(button_8);
		button_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				butonGuncelle(button_8, "D4");
			}
		});

		JButton button_9 = new JButton("");
		button_9.setBounds(194, 80, 36, 23);
		if (Arrays.asList(dolu_koltuklar).contains("D5")) {
			button_9.setBackground(kirmizi);
			button_9.setEnabled(false);
		} else {
			button_9.setBackground(yesil);
		}
		contentPane.add(button_9);
		button_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				butonGuncelle(button_9, "D5");
			}
		});

		JButton button_10 = new JButton("");
		button_10.setBounds(240, 80, 36, 23);
		if (Arrays.asList(dolu_koltuklar).contains("D6")) {
			button_10.setBackground(kirmizi);
			button_10.setEnabled(false);
		} else {
			button_10.setBackground(yesil);
		}
		contentPane.add(button_10);
		button_10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				butonGuncelle(button_10, "D6");
			}
		});

		JButton button_11 = new JButton("");
		button_11.setBounds(10, 114, 36, 23);
		if (Arrays.asList(dolu_koltuklar).contains("C1")) {
			button_11.setBackground(kirmizi);
			button_11.setEnabled(false);
		} else {
			button_11.setBackground(yesil);
		}
		contentPane.add(button_11);
		button_11.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				butonGuncelle(button_11, "C1");
			}
		});

		JButton button_12 = new JButton("");
		button_12.setBounds(56, 114, 36, 23);
		if (Arrays.asList(dolu_koltuklar).contains("C2")) {
			button_12.setBackground(kirmizi);
			button_12.setEnabled(false);
		} else {
			button_12.setBackground(yesil);
		}
		contentPane.add(button_12);
		button_12.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				butonGuncelle(button_12, "C2");
			}
		});

		JButton button_13 = new JButton("");
		button_13.setBounds(102, 114, 36, 23);
		if (Arrays.asList(dolu_koltuklar).contains("C3")) {
			button_13.setBackground(kirmizi);
			button_13.setEnabled(false);
		} else {
			button_13.setBackground(yesil);
		}
		contentPane.add(button_13);
		button_13.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				butonGuncelle(button_13, "C3");
			}
		});

		JButton button_14 = new JButton("");
		button_14.setBounds(148, 114, 36, 23);
		if (Arrays.asList(dolu_koltuklar).contains("C4")) {
			button_14.setBackground(kirmizi);
			button_14.setEnabled(false);
		} else {
			button_14.setBackground(yesil);
		}
		contentPane.add(button_14);
		button_14.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				butonGuncelle(button_14, "C4");
			}
		});

		JButton button_15 = new JButton("");
		button_15.setBounds(194, 114, 36, 23);
		if (Arrays.asList(dolu_koltuklar).contains("C5")) {
			button_15.setBackground(kirmizi);
			button_15.setEnabled(false);
		} else {
			button_15.setBackground(yesil);
		}
		contentPane.add(button_15);
		button_15.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				butonGuncelle(button_15, "C5");
			}
		});

		JButton button_16 = new JButton("");
		button_16.setBounds(240, 114, 36, 23);
		if (Arrays.asList(dolu_koltuklar).contains("C6")) {
			button_16.setBackground(kirmizi);
			button_16.setEnabled(false);
		} else {
			button_16.setBackground(yesil);
		}
		contentPane.add(button_16);
		button_16.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				butonGuncelle(button_16, "C6");
			}
		});

		JButton button_17 = new JButton("");
		button_17.setBounds(10, 148, 36, 23);
		if (Arrays.asList(dolu_koltuklar).contains("B1")) {
			button_17.setBackground(kirmizi);
			button_17.setEnabled(false);
		} else {
			button_17.setBackground(yesil);
		}
		contentPane.add(button_17);
		button_17.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				butonGuncelle(button_17, "B1");
			}
		});

		JButton button_18 = new JButton("");
		button_18.setBounds(56, 148, 36, 23);
		if (Arrays.asList(dolu_koltuklar).contains("B2")) {
			button_18.setBackground(kirmizi);
			button_18.setEnabled(false);
		} else {
			button_18.setBackground(yesil);
		}
		contentPane.add(button_18);
		button_18.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				butonGuncelle(button_18, "B2");
			}
		});

		JButton button_19 = new JButton("");
		button_19.setBounds(102, 148, 36, 23);
		if (Arrays.asList(dolu_koltuklar).contains("B3")) {
			button_19.setBackground(kirmizi);
			button_19.setEnabled(false);
		} else {
			button_19.setBackground(yesil);
		}
		contentPane.add(button_19);
		button_19.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				butonGuncelle(button_19, "B3");
			}
		});

		JButton button_20 = new JButton("");
		button_20.setBounds(148, 148, 36, 23);
		if (Arrays.asList(dolu_koltuklar).contains("B4")) {
			button_20.setBackground(kirmizi);
			button_20.setEnabled(false);
		} else {
			button_20.setBackground(yesil);
		}
		contentPane.add(button_20);
		button_20.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				butonGuncelle(button_20, "B4");
			}
		});

		JButton button_21 = new JButton("");
		button_21.setBounds(194, 148, 36, 23);
		if (Arrays.asList(dolu_koltuklar).contains("B5")) {
			button_21.setBackground(kirmizi);
			button_21.setEnabled(false);
		} else {
			button_21.setBackground(yesil);
		}
		button_21.setBackground(kirmizi);
		button_21.setBackground(yesil);
		contentPane.add(button_21);
		button_21.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				butonGuncelle(button_21, "B5");
			}
		});

		JButton button_22 = new JButton("");
		button_22.setBounds(240, 148, 36, 23);
		if (Arrays.asList(dolu_koltuklar).contains("B6")) {
			button_22.setBackground(kirmizi);
			button_22.setEnabled(false);
		} else {
			button_22.setBackground(yesil);
		}
		contentPane.add(button_22);
		button_22.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				butonGuncelle(button_22, "B6");
			}
		});

		JButton button_23 = new JButton("");
		button_23.setBounds(10, 182, 36, 23);
		if (Arrays.asList(dolu_koltuklar).contains("A1")) {
			button_23.setBackground(kirmizi);
			button_23.setEnabled(false);
		} else {
			button_23.setBackground(yesil);
		}
		contentPane.add(button_23);
		button_23.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				butonGuncelle(button_23, "A1");
			}
		});

		JButton button_24 = new JButton("");
		button_24.setBounds(56, 182, 36, 23);
		if (Arrays.asList(dolu_koltuklar).contains("A2")) {
			button_24.setBackground(kirmizi);
			button_24.setEnabled(false);
		} else {
			button_24.setBackground(yesil);
		}
		contentPane.add(button_24);
		button_24.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				butonGuncelle(button_24, "A2");
			}
		});

		JButton button_25 = new JButton("");
		button_25.setBounds(102, 182, 36, 23);
		if (Arrays.asList(dolu_koltuklar).contains("A3")) {
			button_25.setBackground(kirmizi);
			button_25.setEnabled(false);
		} else {
			button_25.setBackground(yesil);
		}
		contentPane.add(button_25);
		button_25.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				butonGuncelle(button_25, "A3");
			}
		});

		JButton button_26 = new JButton("");
		button_26.setBounds(148, 182, 36, 23);
		if (Arrays.asList(dolu_koltuklar).contains("A4")) {
			button_26.setBackground(kirmizi);
			button_26.setEnabled(false);
		} else {
			button_26.setBackground(yesil);
		}
		contentPane.add(button_26);
		button_26.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				butonGuncelle(button_26, "A4");
			}
		});

		JButton button_27 = new JButton("");
		button_27.setBounds(194, 182, 36, 23);
		if (Arrays.asList(dolu_koltuklar).contains("A5")) {
			button_27.setBackground(kirmizi);
			button_27.setEnabled(false);
		} else {
			button_27.setBackground(yesil);
		}
		contentPane.add(button_27);
		button_27.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				butonGuncelle(button_27, "A5");
			}
		});

		JButton button_28 = new JButton("");
		button_28.setBounds(240, 182, 36, 23);
		if (Arrays.asList(dolu_koltuklar).contains("A6")) {
			button_28.setBackground(kirmizi);
			button_28.setEnabled(false);
		} else {
			button_28.setBackground(yesil);
		}
		contentPane.add(button_28);
		button_28.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				butonGuncelle(button_28, "A6");
			}
		});
		Giris ornek2 = new Giris(mac_id);

		JLabel lblTarih = new JLabel("TAR\u0130H :");
		lblTarih.setBounds(92, 281, 138, 14);
		lblTarih.setText(ornek2.lblTarih.getText());
		contentPane.add(lblTarih);

		JLabel lblSaat = new JLabel("SAAT :");
		lblSaat.setBounds(92, 306, 138, 14);
		lblSaat.setText(ornek2.lblSaat.getText());
		contentPane.add(lblSaat);
		lblYer.setBounds(92, 256, 138, 14);

		lblYer.setText(ornek2.lblYer.getText());
		lblYer.setBackground(new Color(255, 153, 0));
		contentPane.add(lblYer);

		JPanel panel = new JPanel();
		panel.setBackground(new Color(255, 250, 205));
		panel.setBounds(370, 46, 308, 133);
		contentPane.add(panel);
		panel.setLayout(null);

		JLabel lblAd = new JLabel("ADI : ");
		lblAd.setBounds(10, 31, 46, 14);
		panel.add(lblAd);

		JLabel lblSoyad = new JLabel("SOYADI : ");
		lblSoyad.setBounds(10, 70, 71, 14);
		panel.add(lblSoyad);

		textField = new JTextField();
		textField.setBounds(79, 28, 219, 20);
		panel.add(textField);
		textField.setColumns(10);

		textField_1 = new JTextField();
		textField_1.setBounds(79, 67, 219, 20);
		panel.add(textField_1);
		textField_1.setColumns(10);

		JLabel lblTc = new JLabel("TC : ");
		lblTc.setBounds(10, 108, 60, 14);
		panel.add(lblTc);

		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(79, 105, 219, 20);
		panel.add(textField_2);

		JLabel lblNewLabel = new JLabel("*Gerekli Alanlar\u0131 Dolurman\u0131z Gerekmektedir.");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 9));
		lblNewLabel.setForeground(new Color(255, 51, 0));
		lblNewLabel.setBounds(10, 0, 288, 14);
		panel.add(lblNewLabel);
		lblKategori.setBounds(487, 231, 95, 14);

		lblKategori.setForeground(new Color(0, 0, 0));
		contentPane.add(lblKategori);

		JLabel lblBlok = new JLabel("BLOK :");
		lblBlok.setBounds(370, 256, 87, 14);
		contentPane.add(lblBlok);

		JLabel lblKoltuklar = new JLabel("KOLTUKLAR :");
		lblKoltuklar.setBounds(370, 281, 87, 14);
		contentPane.add(lblKoltuklar);
		lblFiyat.setBounds(487, 306, 56, 14);
		contentPane.add(lblFiyat);

		JLabel lblE_1 = new JLabel("E");
		lblE_1.setBounds(286, 46, 36, 23);
		lblE_1.setHorizontalAlignment(SwingConstants.CENTER);
		contentPane.add(lblE_1);

		JLabel lblD_1 = new JLabel("D");
		lblD_1.setBounds(286, 80, 36, 23);
		lblD_1.setHorizontalAlignment(SwingConstants.CENTER);
		contentPane.add(lblD_1);

		JLabel lblC_1 = new JLabel("C");
		lblC_1.setBounds(286, 114, 36, 23);
		lblC_1.setHorizontalAlignment(SwingConstants.CENTER);
		contentPane.add(lblC_1);

		JLabel lblB_1 = new JLabel("B");
		lblB_1.setBounds(286, 148, 36, 23);
		lblB_1.setHorizontalAlignment(SwingConstants.CENTER);
		contentPane.add(lblB_1);

		JLabel lblA_1 = new JLabel("A");
		lblA_1.setBounds(286, 182, 36, 23);
		lblA_1.setHorizontalAlignment(SwingConstants.CENTER);
		contentPane.add(lblA_1);

		JLabel lblF = new JLabel("6");
		lblF.setBounds(240, 21, 36, 23);
		lblF.setHorizontalAlignment(SwingConstants.CENTER);
		contentPane.add(lblF);

		JLabel lblE = new JLabel("5");
		lblE.setBounds(194, 21, 36, 23);
		lblE.setHorizontalAlignment(SwingConstants.CENTER);
		contentPane.add(lblE);

		JLabel lblD = new JLabel("4");
		lblD.setBounds(148, 21, 36, 23);
		lblD.setHorizontalAlignment(SwingConstants.CENTER);
		contentPane.add(lblD);

		JLabel lblC = new JLabel("3");
		lblC.setBounds(102, 21, 36, 23);
		lblC.setHorizontalAlignment(SwingConstants.CENTER);
		contentPane.add(lblC);

		JLabel lblB = new JLabel("2");
		lblB.setBounds(56, 21, 36, 23);
		lblB.setHorizontalAlignment(SwingConstants.CENTER);
		contentPane.add(lblB);

		JLabel lblA = new JLabel("1");
		lblA.setBounds(10, 21, 36, 23);
		lblA.setHorizontalAlignment(SwingConstants.CENTER);
		contentPane.add(lblA);

		JButton btnSatnAl = new JButton("Sat\u0131n Al >>");
		btnSatnAl.setFocusPainted(false);
		btnSatnAl.setBounds(575, 336, 103, 23);
		btnSatnAl.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (textField.getText().length() == 0 || textField_1.getText().length() == 0
						|| textField_2.getText().length() == 0) {
					JOptionPane.showMessageDialog(null, "Gerekli bilgilerin doldurulduðundan emin olun!!");
					return;
				} else if (koltuklar.isEmpty()) {
					JOptionPane.showMessageDialog(null, "Lutfen koltuk seçimi yapýnýz!!");
					return;
				}

				else {
					dispose();
					BiletYazdir ornek = new BiletYazdir(mac_id);
					for (int i = 0; i < koltuklar.size(); i++) {
						try {
							int bilet =Test.ekle(textField.getText(), textField_1.getText(),
									textField_2.getText(), mac_id, label_1.getText(), koltuklar.size(), fiyat,
									koltuklar.get(i));
							ornek.lblNewLabel_5.setText("\n"+ Integer.toString(bilet));
							Test.ekle_koltuk(mac_id,label_1.getText(),koltuklar.get(i));
						} catch (ClassNotFoundException | SQLException e1) {
							// TODO Auto-generated catch block
							e1.printStackTrace();
						}
					}
					
					ornek.lblNewLabel_1.setText(lblKategori.getText());
					ornek.lblNewLabel_2.setText(label_1.getText());
					ornek.lblNewLabel_3.setText(label_2.getText());
					ornek.lblNewLabel_6.setText(label_3.getText());
					ornek.lblAdSoyad.setText(textField.getText().toUpperCase() + " " + textField_1.getText().toUpperCase());
					
					ornek.setVisible(true);
				}
			}
		});
		contentPane.add(btnSatnAl);

		JButton btnNewButton_1 = new JButton("Anasayfa");
		btnNewButton_1.setFocusPainted(false);
		btnNewButton_1.setBounds(3, 336, 114, 23);
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				AnaSayfa ornek = new AnaSayfa();
				ornek.setVisible(true);
			}
		});
		contentPane.add(btnNewButton_1);
		contentPane.add(lblTarih);
		contentPane.add(lblSaat);
		lblKategori_1.setBounds(370, 231, 66, 14);
		contentPane.add(lblKategori_1);
		label_1.setBounds(487, 256, 186, 14);
		contentPane.add(label_1);
		label_2.setBounds(487, 281, 191, 14);
		contentPane.add(label_2);
		label_3.setBounds(487, 320, 63, 28);
		label_3.setText(Integer.toString(toplam_fiyat) + " tl");
		contentPane.add(label_3);

		JLabel lblTarih_1 = new JLabel("TAR\u0130H:");
		lblTarih_1.setBounds(26, 281, 46, 14);
		contentPane.add(lblTarih_1);

		JLabel lblSaat_1 = new JLabel("SAAT:");
		lblSaat_1.setBounds(26, 306, 46, 14);
		contentPane.add(lblSaat_1);

		JLabel lblNewLabel_1 = new JLabel("YER:");
		lblNewLabel_1.setBounds(26, 256, 56, 14);
		contentPane.add(lblNewLabel_1);

		JLabel lblFiyat_1 = new JLabel("F\u0130YAT:");
		lblFiyat_1.setBounds(370, 306, 46, 14);
		contentPane.add(lblFiyat_1);

		JLabel lblNewLabel_2 = new JLabel("TOPLAM F\u0130YAT :");
		lblNewLabel_2.setBounds(370, 320, 110, 27);
		contentPane.add(lblNewLabel_2);

	}

	public void koltukYazdir() {
		label_2.setText(koltuklar.toString().substring(1, koltuklar.toString().length() - 1));
		label_3.setText(toplam_fiyat + " tl");
	}

	public void butonGuncelle(JButton btn, String adi) {
		if (btn.getBackground() == yesil) {
			btn.setBackground(turuncu);
			toplam_fiyat += fiyat;
			koltuklar.add(adi);
			koltukYazdir();
		} else {
			btn.setBackground(yesil);
			toplam_fiyat -= fiyat;
			koltuklar.remove(adi);
			koltukYazdir();
		}
	}
}
