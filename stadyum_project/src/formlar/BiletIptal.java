package formlar;

import core.Test;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;
import java.awt.Color;
import javax.swing.ImageIcon;
import java.awt.Font;

public class BiletIptal extends JFrame {

	private static final long serialVersionUID = 1L;
	final static BiletIptal frame = new BiletIptal();
	public int[] bilet_no;
	private JPanel contentPane;
	static JTextField textField;
	Boolean kontrol;
	String metin;

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
	
	public BiletIptal() {
			initComponent();
		}
		void initComponent()
		{
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 509, 325);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(240, 248, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		try {
			bilet_no = Test.biletSorgula();
		} catch (SQLException e1) {
			e1.printStackTrace();
		}
		JButton btnBiletiIptalEt = new JButton("Bileti \u0130ptal Et");
		btnBiletiIptalEt.setFocusPainted(false);
		btnBiletiIptalEt.addActionListener(new ActionListener() {
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
				if (textField.getText().length()== 0||kontrol == true)
				{
					JOptionPane.showMessageDialog(null,"Girdiðiniz bilet numarasý hatalý. Lütfen girdiðiniz numarayý tekrar kontrol ediniz!!");
					return;
				}
				int no= Integer.parseInt(metin);
			    if(no_kontrol(no) == false)
				{
					JOptionPane.showMessageDialog(null,"Girdiðiniz numarada bir bilet bulunmamaktadýr. Lütfen girdiðiniz numarayý tekrar kontrol ediniz!!");
					return;
				}
								
			   else {
					int dialogResult = JOptionPane.showConfirmDialog(null,
							"Silmek istediðinize emin misiniz?", "",
							JOptionPane.YES_NO_OPTION);
					if (dialogResult == 0) {
						try {
							Test.sil(no);
						} catch (ClassNotFoundException | SQLException e1) {
							// TODO Auto-generated catch block
							e1.printStackTrace();
						}
						
						int dialogResult2 = JOptionPane.showConfirmDialog(null,
								"Yeni bir bilet iptal iþlemi yaptýrmak emin misiniz?", "",
								JOptionPane.YES_NO_OPTION);
						if (dialogResult2 == 0) {
							BiletIptal yeni= new BiletIptal();
							dispose();
							yeni.setVisible(true);
							return;
						} else {
							AnaSayfa ornek = new AnaSayfa();
							frame.setVisible(false);
							dispose();
							ornek.setVisible(true);
						}
						
						
					} 					
					else {
						JOptionPane.showMessageDialog(null,
								"Silme Ýptal edildi.");
					}
				}												
			}
		});
		btnBiletiIptalEt.setBounds(330, 142, 139, 23);
		contentPane.add(btnBiletiIptalEt);
		
		JLabel lblBiletNumaras = new JLabel("Bilet Numaras\u0131n\u0131 Giriniz :");
		lblBiletNumaras.setHorizontalAlignment(SwingConstants.CENTER);
		lblBiletNumaras.setForeground(Color.WHITE);
		lblBiletNumaras.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblBiletNumaras.setBounds(0, 91, 205, 31);
		contentPane.add(lblBiletNumaras);
		
		textField = new JTextField();
		textField.setBounds(209, 98, 274, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JButton button = new JButton("<<Geri");
		button.setHorizontalAlignment(SwingConstants.LEFT);
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.setVisible(false);
				dispose();
				AnaSayfa ornek = new AnaSayfa();
				ornek.setVisible(true);
			}
		});
		button.setBounds(0, 260, 84, 23);
		contentPane.add(button);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\busra yilmaz\\workspace\\stadyum_project\\bin\\7487.jpg"));
		lblNewLabel.setBounds(0, -20, 503, 317);
		contentPane.add(lblNewLabel);
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
