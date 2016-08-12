package formlar;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import core.Test;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import java.awt.Color;

public class BiletSorgu extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	final static BiletSorgu frame = new BiletSorgu();
	static JTextField textField;
	public int[] bilet_no;
	Boolean kontrol;
	String metin;
	ArrayList<String> a;
	ArrayList<String> b;
	JLabel lblNewLabel_1 = new JLabel("New label");
	JLabel lblTakim = new JLabel("");
	JLabel lblNewLabel_2 = new JLabel("New label");
	JLabel lblNewLabel_6 = new JLabel("New label");
	JLabel lblNewLabel_4 = new JLabel("New label");
	JLabel lblNewLabel_5 = new JLabel("New label");
	JLabel lblTakimad = new JLabel("takim1ad");
	JLabel lblNewLabel = new JLabel("");
	JLabel lblTakimad_1 = new JLabel("takim2ad");
	JLabel lblYer = new JLabel("Yer");
	JLabel lblTarih = new JLabel("Tarih");
	JLabel lblSaat = new JLabel("Saat");

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

	public BiletSorgu() {		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 671, 396);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 240, 245));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnAnaSayfa = new JButton("Anasayfa");
		btnAnaSayfa.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.setVisible(false);
				dispose();
				AnaSayfa ornek  = new AnaSayfa();
				ornek.setVisible(true);
			}
		});
		btnAnaSayfa.setBounds(265, 335, 115, 23);
		contentPane.add(btnAnaSayfa);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(255, 255, 240));
		panel.setBounds(0, 77, 655, 239);
		contentPane.add(panel);
		panel.setLayout(null);
				
		lblTakim.setBounds(512, 11, 133, 98);
		panel.add(lblTakim);
		
		
		lblYer.setBounds(276, 75, 46, 14);
		panel.add(lblYer);
		
		lblTarih.setBounds(276, 100, 46, 14);
		panel.add(lblTarih);

		lblSaat.setBounds(276, 125, 46, 14);
		panel.add(lblSaat);
		
		JLabel lblAd = new JLabel("Ad :");
		lblAd.setBounds(10, 161, 46, 14);
		panel.add(lblAd);
				
		lblNewLabel_1.setBounds(107, 161, 126, 14);
		panel.add(lblNewLabel_1);
		
		JLabel lblKoltuklar = new JLabel("Koltuklar: ");
		lblKoltuklar.setBounds(273, 197, 61, 14);
		panel.add(lblKoltuklar);
		
		lblNewLabel_2.setBounds(107, 197, 126, 14);
		panel.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Kategori:");
		lblNewLabel_3.setBounds(10, 197, 61, 14);
		panel.add(lblNewLabel_3);
		
		JLabel lblBlok = new JLabel("Blok :");
		lblBlok.setBounds(273, 161, 46, 14);
		panel.add(lblBlok);
		
		
		lblNewLabel_4.setBounds(329, 161, 100, 14);
		panel.add(lblNewLabel_4);

		lblNewLabel_5.setBounds(329, 197, 100, 14);
		panel.add(lblNewLabel_5);
		
		JLabel lblFiyat = new JLabel("Fiyat: ");
		lblFiyat.setBounds(481, 197, 46, 14);
		panel.add(lblFiyat);
		
		lblNewLabel_6.setBounds(537, 197, 80, 14);
		panel.add(lblNewLabel_6);

		lblTakimad.setBounds(10, 125, 46, 14);
		panel.add(lblTakimad);

		lblTakimad_1.setBounds(512, 125, 46, 14);
		panel.add(lblTakimad_1);
		
		
		lblNewLabel.setBounds(10, 11, 133, 98);
		panel.add(lblNewLabel);
		
		textField = new JTextField();
		textField.setBounds(169, 29, 329, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblBiletNumaranzGiriniz = new JLabel("Bilet Numaran\u0131z\u0131 Giriniz:");
		lblBiletNumaranzGiriniz.setBounds(10, 32, 149, 14);
		contentPane.add(lblBiletNumaranzGiriniz);
		
		try {
			bilet_no = Test.biletSorgula();
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		JButton btnAra = new JButton("Ara");
		btnAra.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			    kontrol = false;
			    metin=textField.getText();
				for (byte a=0; a<metin.length();a++)
				{	if(metin.charAt(a)<'0'||metin.charAt(a)>'9')
					{
						kontrol= true;
						break;
					}
				}				
				if (textField.getText()== null||kontrol == true)
				{
					JOptionPane.showMessageDialog(null,"Girdiðiniz bilet numarasý hatalý. Lütfen girdiðiniz numarayý tekrar kontrol ediniz!!");
					return;
				}
				int no= Integer.parseInt(metin);
				if(no_kontrol(no) == false)
				{
					System.out.println(Arrays.asList(bilet_no).contains(metin));
					JOptionPane.showMessageDialog(null,"Girdiðiniz numarada bir bilet bulunmamaktadýr. Lütfen girdiðiniz numarayý tekrar kontrol ediniz!!");
					return;
				}
								
			   else {	
				   
					try {
						 a= Test.sorgulabilet(Integer.parseInt(metin));
						 b=Test.macSorgula(Integer.parseInt(a.get(3)));
					} catch (NumberFormatException | SQLException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
					lblNewLabel_1.setText(a.get(0)+"  "+a.get(1));
					lblNewLabel_5.setText(a.get(7));
					lblNewLabel_6.setText(a.get(6));
					lblYer.setText(b.get(2));
					lblSaat.setText(b.get(3));
					lblTarih.setText(b.get(4));
					try {
						lblNewLabel_2.setText(Test.kateSorgula(Integer.parseInt(a.get(4))));
					} catch (NumberFormatException | SQLException e1) {
						e1.printStackTrace();
					}
					try {
						lblNewLabel_4.setText(Test.blokSorgula(Integer.parseInt(a.get(5))));
					} catch (NumberFormatException | SQLException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
					try {
						lblTakimad.setText(Test.takimAdiSorgula2(Integer.parseInt(b.get(0))));
					} catch (NumberFormatException | SQLException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
					try {
						lblTakimad_1.setText(Test.takimAdiSorgula2(Integer.parseInt(b.get(1))));
					} catch (NumberFormatException | SQLException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
					try {
						lblNewLabel.setIcon(new ImageIcon(Test.takimAdiSorgula(lblTakimad.getText())));
					} catch (SQLException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
					try {
						lblTakim.setIcon(new ImageIcon(Test.takimAdiSorgula(lblTakimad_1.getText())));
					} catch (SQLException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
					//lblNewLabel_2.setIcon(new ImageIcon("C:\\Users\\busra yilmaz\\Desktop\\proje fotolar\u0131\\carpi.jpg"));
				}												
			}		
		});
		btnAra.setBounds(537, 32, 89, 23);
		contentPane.add(btnAra);
	}
	boolean no_kontrol(int sayi)
	{
		boolean k=false;			
		List<Integer> list = new ArrayList<Integer>();
		for(int i = 0;i<bilet_no.length;i++)
			list.add(bilet_no[i]);
		if(list.contains(sayi))
			k=true;
		return k;
	}
}
