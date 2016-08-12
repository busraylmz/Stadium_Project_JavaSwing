package formlar;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Color;
import javax.swing.ImageIcon;
import java.awt.Component;
import java.awt.Rectangle;
import javax.swing.border.BevelBorder;
import javax.swing.border.CompoundBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class BiletYazdir extends JFrame {

	private JPanel contentPane;
	JLabel lblNewLabel_3 = new JLabel("New label");
	JLabel lblNewLabel_1 = new JLabel("New label");
	JLabel lblNewLabel_2 = new JLabel("New label");
	JLabel lblNewLabel_5 = new JLabel("New label");
	JLabel lblNewLabel_6 = new JLabel("New label");
	JLabel lblAdSoyad = new JLabel("Ad & Soyad");

	int mac_id;
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public BiletYazdir(int mac_id) {
		this.mac_id= mac_id;
		initComponent();
	}
	void initComponent()
	{
		System.out.println(mac_id +" yaz");
		Giris takim1=new Giris(mac_id);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 716, 365);
		contentPane = new JPanel();
		contentPane.setBackground(Color.PINK);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblTakim = new JLabel("");
		lblTakim.setHorizontalAlignment(SwingConstants.CENTER);
		lblTakim.setIcon(takim1.lblNewLabel_7.getIcon());
		JLabel lblTakim_1 = new JLabel("takim2");
		lblTakim_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblTakim_1.setIcon(takim1.label_1.getIcon());
		
		
		lblTakim_1.setBounds(346, 25, 146, 139);
		lblTakim_1.setText(takim1.lblTakim.getText());
		contentPane.add(lblTakim_1);
		lblTakim.setBounds(33, 25, 146, 139);
		contentPane.add(lblTakim);
		
		JLabel lblNewLabel = new JLabel("VS.");
		lblNewLabel.setHorizontalTextPosition(SwingConstants.CENTER);
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(230, 54, 46, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblKategori = new JLabel("Kategori :");
		lblKategori.setBounds(37, 225, 80, 14);
		contentPane.add(lblKategori);
		
		lblNewLabel_1.setBounds(127, 225, 172, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblBlok = new JLabel("Blok :");
		lblBlok.setBounds(37, 262, 46, 14);
		contentPane.add(lblBlok);
		
		lblNewLabel_2.setBounds(127, 262, 172, 14);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblKoltuk = new JLabel("Koltuk :");
		lblKoltuk.setBounds(37, 302, 46, 14);
		contentPane.add(lblKoltuk);
		
		lblNewLabel_3.setBounds(127, 302, 350, 14);
		contentPane.add(lblNewLabel_3);

		JLabel lblYer = new JLabel("Yer");
		lblYer.setText(takim1.lblYer.getText());
		lblYer.setBounds(199, 96, 128, 14);
		contentPane.add(lblYer);
		
		JLabel lblTarih = new JLabel("Tarih");
		lblTarih.setText(takim1.lblTarih.getText());
		lblTarih.setBounds(208, 125, 128, 14);
		contentPane.add(lblTarih);
		
		JLabel lblSaat = new JLabel("Saat");
		lblSaat.setText(takim1.lblSaat.getText());
		lblSaat.setBounds(230, 150, 128, 14);
		contentPane.add(lblSaat);
		
		JLabel lblTakimad = new JLabel("takim1ad");	
		lblTakimad.setText(takim1.lblNewLabel_6.getText());
		lblTakimad.setBounds(37, 123, 107, 14);
		contentPane.add(lblTakimad);
		
		JLabel lblTakimad_1 = new JLabel("takim2ad");
		lblTakimad_1.setText(takim1.label.getText());
		lblTakimad_1.setBounds(403, 123, 80, 14);
		contentPane.add(lblTakimad_1);
		
		JPanel panel = new JPanel();
		panel.setBorder(new CompoundBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null), null));
		panel.setBounds(new Rectangle(0, 0, 1, 1));
		panel.setFocusTraversalKeysEnabled(false);
		panel.setFocusCycleRoot(true);
		panel.setBackground(new Color(255, 255, 204));
		panel.setBounds(502, 0, 198, 326);
		contentPane.add(panel);
		panel.setLayout(null);
				
		lblAdSoyad.setBounds(10, 70, 161, 52);
		panel.add(lblAdSoyad);
		lblAdSoyad.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_5.setHorizontalAlignment(SwingConstants.CENTER);
		
		lblNewLabel_5.setBounds(117, 148, 71, 24);
		panel.add(lblNewLabel_5);
		
		JLabel lblBiletNumaras = new JLabel("Bilet Numaras\u0131 :");
		lblBiletNumaras.setBounds(10, 154, 89, 24);
		panel.add(lblBiletNumaras);
		lblNewLabel_6.setHorizontalAlignment(SwingConstants.CENTER);
				
		lblNewLabel_6.setBounds(117, 259, 71, 24);
		panel.add(lblNewLabel_6);
		
		JLabel lblNewLabel_4 = new JLabel("Bilet Fiyat\u0131 :");
		
		lblNewLabel_4.setBounds(0, 264, 89, 14);
		panel.add(lblNewLabel_4);
		
		JButton btnNewButton = new JButton("");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(1);
			}
		});
		btnNewButton.setIcon(new ImageIcon("C:\\Users\\busra yilmaz\\workspace\\stadyum_project\\bin\\onay.png"));
		btnNewButton.setBounds(454, 285, 46, 41);
		contentPane.add(btnNewButton);
	}

}
