package formlar;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Image;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.ComboBoxModel;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;
import javax.swing.JComboBox;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.Font;
import java.awt.HeadlessException;

import javax.swing.JLayeredPane;
import javax.swing.border.LineBorder;

import core.Test;

import java.awt.SystemColor;
import javax.swing.JTable;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.util.ArrayList;
import java.awt.event.ActionEvent;

public class KategoriSec extends JFrame {
	int mac_id;
	private JPanel contentPane;
	static JLabel lblTakim = new JLabel("Takim1");
	static JLabel lblTakim_1 = new JLabel("Takim2");
	final JComboBox comboBox = new JComboBox();
	static String[] liste =null;
	static  ArrayList<String> k=new ArrayList<String>();   
	static String[] m=new String[k.size()];

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					
					//frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}



	public KategoriSec(int mac_id) {
		this.mac_id=mac_id;
		initComponent();
	}
	void initComponent()
	{
	System.out.println(mac_id+" kate");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 912, 504);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 204, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\busra yilmaz\\workspace\\stadyum_project\\bin\\sta.png"));
		lblNewLabel.setBounds(0, 16, 532, 411);
		contentPane.add(lblNewLabel);
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setEnabled(false);
		comboBox_1.setBounds(686, 360, 165, 20);
		contentPane.add(comboBox_1);
		
		try {
			ComboBoxModel<String> kategori=new DefaultComboBoxModel<>(Test.kategoriSorgula(mac_id));
			comboBox.setModel(kategori);
		} catch (SQLException e2) {
			// TODO Auto-generated catch block
			e2.printStackTrace();
		}
		comboBox.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(getComboBox()== "Seçiniz")
					return;
				else
				{
					try {
						comboBox_1.setModel(new DefaultComboBoxModel
								(Test.SorgulaBlok(mac_id, comboBox.getSelectedItem().toString())));
					} catch (SQLException e1) {
						e1.printStackTrace();
					}
					comboBox_1.setEnabled(true);
				}	
			}
		});
		comboBox.setBounds(686, 324, 165, 20);
		contentPane.add(comboBox);		
		JPanel panel = new JPanel();
		panel.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel.setBackground(new Color(255, 255, 204));
		panel.setBounds(542, 16, 344, 262);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblKategori = new JLabel("2. Kategori");
		lblKategori.setBounds(10, 58, 61, 14);
		panel.add(lblKategori);
		lblKategori.setForeground(new Color(255, 0, 153));
		lblKategori.setFont(new Font("Tahoma", Font.BOLD, 11));
		
		JLabel lblKategori_1 = new JLabel("3. Kategori");
		lblKategori_1.setBounds(10, 90, 61, 14);
		panel.add(lblKategori_1);
		lblKategori_1.setForeground(new Color(255, 0, 0));
		lblKategori_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		
		JLabel lblNewLabel_1 = new JLabel("1. Kategori");
		lblNewLabel_1.setBounds(10, 22, 61, 14);
		panel.add(lblNewLabel_1);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_1.setForeground(new Color(51, 153, 102));
		
		JLabel lblKategori_3 = new JLabel("5. Kategori");
		lblKategori_3.setBounds(10, 165, 61, 14);
		panel.add(lblKategori_3);
		lblKategori_3.setForeground(new Color(51, 204, 255));
		lblKategori_3.setFont(new Font("Tahoma", Font.BOLD, 11));
		
		JLabel lblKategori_4 = new JLabel("6. Kategori");
		lblKategori_4.setBounds(10, 211, 61, 14);
		panel.add(lblKategori_4);
		lblKategori_4.setForeground(new Color(255, 204, 0));
		lblKategori_4.setFont(new Font("Tahoma", Font.BOLD, 11));
		
		JLabel lblKategori_2 = new JLabel("4. Kategori");
		lblKategori_2.setBounds(10, 125, 61, 14);
		panel.add(lblKategori_2);
		lblKategori_2.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblKategori_2.setForeground(new Color(102, 204, 153));
		
		JLabel lblNewLabel_2 = new JLabel("New label");
		lblNewLabel_2.setBounds(121, 22, 46, 14);
		panel.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("New label");
		lblNewLabel_3.setBounds(121, 58, 46, 14);
		panel.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("New label");
		lblNewLabel_4.setBounds(121, 90, 46, 14);
		panel.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("New label");
		lblNewLabel_5.setBounds(121, 125, 46, 14);
		panel.add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("New label");
		lblNewLabel_6.setBounds(121, 165, 46, 14);
		panel.add(lblNewLabel_6);
		
		JLabel lblNewLabel_7 = new JLabel("New label");
		lblNewLabel_7.setBounds(121, 211, 46, 14);
		panel.add(lblNewLabel_7);
		
		JLabel lblNewLabel_8 = new JLabel("New label");
		lblNewLabel_8.setBounds(196, 22, 46, 14);
		panel.add(lblNewLabel_8);
		
		JLabel lblNewLabel_9 = new JLabel("New label");
		lblNewLabel_9.setBounds(196, 58, 46, 14);
		panel.add(lblNewLabel_9);
		
		JLabel lblNewLabel_10 = new JLabel("New label");
		lblNewLabel_10.setBounds(196, 90, 46, 14);
		panel.add(lblNewLabel_10);
		
		JLabel lblNewLabel_11 = new JLabel("New label");
		lblNewLabel_11.setBounds(196, 125, 46, 14);
		panel.add(lblNewLabel_11);
		
		JLabel lblNewLabel_12 = new JLabel("New label");
		lblNewLabel_12.setBounds(196, 165, 46, 14);
		panel.add(lblNewLabel_12);
		
		JLabel lblNewLabel_13 = new JLabel("New label");
		lblNewLabel_13.setBounds(196, 211, 46, 14);
		panel.add(lblNewLabel_13);
		
		JLabel lblBiletKald = new JLabel("bilet kald\u0131.");
		lblBiletKald.setBounds(260, 22, 61, 14);
		panel.add(lblBiletKald);
		
		JLabel label = new JLabel("bilet kald\u0131.");
		label.setBounds(260, 58, 61, 14);
		panel.add(label);
		
		JLabel label_1 = new JLabel("bilet kald\u0131.");
		label_1.setBounds(260, 90, 61, 14);
		panel.add(label_1);
		
		JLabel label_2 = new JLabel("bilet kald\u0131.");
		label_2.setBounds(260, 125, 61, 14);
		panel.add(label_2);
		
		JLabel label_3 = new JLabel("bilet kald\u0131.");
		label_3.setBounds(260, 165, 61, 14);
		panel.add(label_3);
		
		JLabel label_4 = new JLabel("bilet kald\u0131.");
		label_4.setBounds(260, 211, 61, 14);
		panel.add(label_4);
		
		JLabel lblKategoriSeiniz = new JLabel("Kategori Se\u00E7iniz :");
		lblKategoriSeiniz.setBounds(560, 327, 116, 14);
		contentPane.add(lblKategoriSeiniz);
		
		JLabel lblNewLabel_14 = new JLabel("Blok Se\u00E7iniz :");
		lblNewLabel_14.setBounds(560, 363, 100, 14);
		contentPane.add(lblNewLabel_14);
		
		ImageIcon resim= new ImageIcon("C:\\Users\\GaziBM\\Desktop\\Ma\u00E7BiletiOto\\resimler\\Fenerbah\u00E7e-\u015E\u00FCkr\u00FC-Sara\u00E7o\u011Flu-Stad\u0131-Oturma-plan\u0131.jpg");
		Test test=new Test();
		fiyat_yazdir (lblNewLabel_2,"1.kategori");
		fiyat_yazdir (lblNewLabel_3,"2.kategori");
		fiyat_yazdir (lblNewLabel_4,"3.kategori");
		fiyat_yazdir (lblNewLabel_5,"4.kategori");
		fiyat_yazdir (lblNewLabel_6,"5.kategori");
		fiyat_yazdir (lblNewLabel_7,"6.kategori");
		
		koltuk_yazdir (lblNewLabel_8,"1.kategori");
		koltuk_yazdir (lblNewLabel_9,"2.kategori");
		koltuk_yazdir (lblNewLabel_10,"3.kategori");
		koltuk_yazdir (lblNewLabel_11,"4.kategori");
		koltuk_yazdir (lblNewLabel_12,"5.kategori");
		koltuk_yazdir (lblNewLabel_13,"6.kategori");
		lblTakim.setBounds(69, 438, 143, 14);
		contentPane.add(lblTakim);
		JLabel lblVs = new JLabel("VS.");
		lblVs.setBounds(243, 438, 46, 14);
		contentPane.add(lblVs);

		lblTakim_1.setBounds(384, 438, 116, 14);
		contentPane.add(lblTakim_1);		
		JButton btnNewButton = new JButton("\u0130leri");
		btnNewButton.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent arg0) {
				BiletAl ornek = new BiletAl(mac_id,comboBox_1.getSelectedItem().toString());
				dispose();
				ornek.lblKategori.setText(getComboBox());

				//Test test=new Test();
				try {
					String h=Integer.toString(Test.SorgulaKategori(mac_id,getComboBox()));
					ornek.fiyat=Test.SorgulaKategori(mac_id,getComboBox());
					ornek.lblFiyat.setText(h+ " tl");
					ornek.label_1.setText(comboBox_1.getSelectedItem().toString());
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				ornek.setVisible(true);				
			}
		});
		btnNewButton.setBounds(797, 438, 89, 23);
		contentPane.add(btnNewButton);
	}

	public String getComboBox() {
		return comboBox.getSelectedItem().toString();
	}
	void fiyat_yazdir (JLabel label,String kategori)
	{
		try {
			String f = Test.SorgulaKategori(mac_id,kategori)+ " tl";	
			label.setText(f);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	void koltuk_yazdir (JLabel label,String kategori)
	{
		try {
			ArrayList<String> liste=new ArrayList<String>();
			liste =  Test.SorgulaKoltuk(mac_id,kategori);
			int a= 30-liste.size();
			String f =a + " tane";	
			label.setText(f);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
