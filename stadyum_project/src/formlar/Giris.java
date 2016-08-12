package formlar;

import javax.swing.border.EmptyBorder;

import core.Test;

import java.awt.*;

import java.io.File;
import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


public class Giris extends JFrame {

	private static final long serialVersionUID = 1L;
	private static JPanel contentPane;
	static Image resmim1,resmim2;
    static File dosyam1,dosyam2;
	static JLabel lblNewLabel_1=new JLabel("");
	static JLabel lblTakim = new JLabel("");
	static JLabel lblYer = new JLabel("");
	static JLabel lblTarih = new JLabel("");
	static JLabel lblSaat = new JLabel("");	
	static AnaSayfa anasayfa=new AnaSayfa();
	final static JLabel lblNewLabel_6 = new JLabel("");
	final static JLabel label = new JLabel("");

	int mac_id;
	private final JLabel lblNewLabel = new JLabel("New label");
	static final JLabel lblNewLabel_7 = new JLabel("");
	static final JLabel label_1 = new JLabel("");
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
				 //Giris frame = new Giris();
					//frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	public Giris()
	{
		
	}
	


	public Giris(int mac_id) {
		this.mac_id=mac_id;
		initComponent();
	}
	void initComponent()
	{
		System.out.println(mac_id +"giris");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 792, 505);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		label_1.setHorizontalTextPosition(SwingConstants.CENTER);
		label_1.setHorizontalAlignment(SwingConstants.CENTER);
		label_1.setBounds(475, 11, 291, 157);
		
		contentPane.add(label_1);
		lblNewLabel_7.setHorizontalTextPosition(SwingConstants.CENTER);
		lblNewLabel_7.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_7.setBounds(10, 11, 291, 157);
		
		contentPane.add(lblNewLabel_7);
		
		JButton btnNewButton = new JButton("Bilet Al");
		btnNewButton.setFocusPainted(false);
		btnNewButton.setBounds(328, 439, 95, 23);
		btnNewButton.setAlignmentY(2.5f);
		contentPane.add(btnNewButton);
		btnNewButton.addActionListener(new ActionListener() {
			@SuppressWarnings("static-access")
			public void actionPerformed(ActionEvent e) {
				dispose();				
				KategoriSec ornek = new KategoriSec(mac_id);				
				ornek.lblTakim.setText(lblNewLabel_6.getText());
				ornek.lblTakim_1.setText(label.getText());
				ornek.setVisible(true);		
			}
		});

		JLabel lblNewLabel_3 = new JLabel("Yer:");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_3.setForeground(Color.WHITE);
		lblNewLabel_3.setBounds(222, 287, 54, 14);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Tarih:");
		lblNewLabel_4.setForeground(Color.WHITE);
		lblNewLabel_4.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_4.setBounds(222, 312, 44, 14);
		contentPane.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("Saat:");
		lblNewLabel_5.setForeground(Color.WHITE);
		lblNewLabel_5.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_5.setBounds(222, 337, 44, 14);
		contentPane.add(lblNewLabel_5);

		JLabel lblNewLabel_2 = new JLabel("            X");
		lblNewLabel_2.setBackground(Color.WHITE);
		lblNewLabel_2.setIcon(new ImageIcon("C:\\Users\\busra yilmaz\\Desktop\\proje fotolar\u0131\\carpi.jpg"));
		lblNewLabel_2.setBounds(353, 74, 88, 93);
		contentPane.add(lblNewLabel_2);
		lblNewLabel_6.setHorizontalTextPosition(SwingConstants.CENTER);
		lblNewLabel_6.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_6.setForeground(Color.WHITE);
		lblNewLabel_6.setFont(new Font("Tahoma", Font.BOLD, 14));
		
		lblNewLabel_6.setBounds(95, 193, 161, 31);
		contentPane.add(lblNewLabel_6);
		label.setFont(new Font("Tahoma", Font.BOLD, 14));
		label.setHorizontalTextPosition(SwingConstants.CENTER);
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setForeground(Color.WHITE);
			
		label.setBounds(584, 193, 144, 31);
		contentPane.add(label);
		lblYer.setHorizontalTextPosition(SwingConstants.CENTER);
		lblYer.setHorizontalAlignment(SwingConstants.CENTER);
		lblYer.setForeground(Color.WHITE);
		lblYer.setFont(new Font("Tahoma", Font.BOLD, 14));
		
		lblYer.setBounds(276, 287, 282, 14);
		contentPane.add(lblYer);
		lblTarih.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblTarih.setHorizontalTextPosition(SwingConstants.CENTER);
		lblTarih.setHorizontalAlignment(SwingConstants.CENTER);
		lblTarih.setForeground(Color.WHITE);
				
		lblTarih.setBounds(276, 312, 282, 14);
		contentPane.add(lblTarih);
		lblSaat.setHorizontalTextPosition(SwingConstants.CENTER);
		lblSaat.setHorizontalAlignment(SwingConstants.CENTER);
		lblSaat.setForeground(Color.WHITE);
		lblSaat.setFont(new Font("Tahoma", Font.BOLD, 14));
				
		lblSaat.setBounds(276, 337, 282, 14);
		contentPane.add(lblSaat);
		lblNewLabel.setVerticalTextPosition(SwingConstants.BOTTOM);
		lblNewLabel.setVerticalAlignment(SwingConstants.BOTTOM);
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\busra yilmaz\\workspace\\stadyum_project\\bin\\s.jpg"));
		lblNewLabel.setBounds(0, 0, 776, 462);
		
		contentPane.add(lblNewLabel);
	}	
	
	public void resimyukle(String foto1,String foto2) 
	{
		dosyam1=new File(foto1);
		try {
			resmim1=ImageIO.read(dosyam1);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
		lblNewLabel_7 .setIcon(new ImageIcon(resmim1));
		//lblNewLabel_1.setBounds(45, 43, 148, 139);
		//contentPane.add(lblNewLabel_1);
		
		dosyam2=new File(foto2);
		try {
			resmim2=ImageIO.read(dosyam2);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}		
        label_1.setIcon(new ImageIcon(resmim2));
		//lblTakim.setBounds(599, 43, 148, 139);
		//contentPane.add(lblTakim);
	}
}
