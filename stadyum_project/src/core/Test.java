package core;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.swing.JOptionPane;
import javax.swing.text.AbstractDocument.Content;

import db.DataBase;
import model.Takimlar;

public class Test
{
	static DataBase db=new DataBase();
	static String[] k;
	static String[] l;
	static String[] m;
	static int[] n;
	static ResultSet set;
	static Statement stmt;
	public static String[] Listele(String takim) throws SQLException
	{		
		db.baglan();		
		stmt=db.conn.createStatement();		
		String sql=("Select takim_adi from takimlar a join maclar m on a.takim_id=m."+takim);
	              set=stmt.executeQuery(sql);
		ArrayList<String> liste=new ArrayList<String>();
		liste.add("Seçiniz");
		while(set.next())
		{
			liste.add(set.getString("takim_adi"));
		
		}
		
		k=new String[liste.size()];
		k=liste.toArray(k);		
		return k;
		
	}
	@SuppressWarnings("static-access")

	public static String takimSahaSorgula(String takim_adi) throws SQLException
	{
		 db.baglan();
			String c="";
			stmt=db.conn.createStatement();
			String sql=("Select * from takimlar where takim_adi='"
				+takim_adi+"'");	
			set=stmt.executeQuery(sql);
			while(set.next())
			{
				c=set.getString("takim_stadi");
			
			}
			return c;
	}
	public static String takimSaatSorgula(String takim1_adi,String takim2_adi) throws SQLException 
	{
		 db.baglan();
			String c="";
			stmt=db.conn.createStatement();
			String sql=("Select saat from maclar where takim1_id="
					+"(select takim_id from takimlar where takim_adi='"+takim1_adi
					+"') and takim2_id="
					+"(select takim_id from takimlar where takim_adi='"+takim2_adi	
					+"')"); 
			set=stmt.executeQuery(sql);
			while(set.next())
			{
				c=set.getString("saat");
			
			}
			return c;
	}
	
	public static String takimZamanSorgula(String takim1_adi,String takim2_adi) throws SQLException 
	{
		 db.baglan();
			String c="";
			stmt=db.conn.createStatement();
			String sql=("Select tarih from maclar where takim1_id="
					+"(select takim_id from takimlar where takim_adi='"+takim1_adi
					+"') and takim2_id="
					+"(select takim_id from takimlar where takim_adi='"+takim2_adi	
					+"')"); 
			set=stmt.executeQuery(sql);
			while(set.next())
			{
				c=set.getString("tarih");
			
			}
			return c;
	}
	public static String[] kategoriSorgula(int mac_id) throws SQLException
	{
		db.baglan();
		stmt=db.conn.createStatement();
		String sql=("Select kategori_adi from kategoriler where mac_id='"+mac_id+"'");
		set=stmt.executeQuery(sql);
		ArrayList<String> liste=new ArrayList<String>();
		liste.add("Seçiniz");
		while(set.next())
		{
			liste.add(set.getString("kategori_adi"));
		}
		m=new String[liste.size()];
		m=liste.toArray(m);	
		return m;		
	}
	
	public static int[] biletSorgula() throws SQLException
	{
		db.baglan();
		stmt=db.conn.createStatement();
		String sql=("Select bilet_id from biletler");
		set=stmt.executeQuery(sql);
		ArrayList liste=new ArrayList ();
		while(set.next())
		{
			liste.add(set.getInt("bilet_id"));
		}
		n=new int[liste.size()];
		for(int i=0;i< liste.size();i++)
		{
			n[i]= (int) liste.get(i);
		}
		return n;
	}
	public static void sil(int bilet_id) throws ClassNotFoundException, SQLException {
		db.baglan();
		stmt=db.conn.createStatement();
		stmt.execute("delete from biletler where bilet_id='" + bilet_id + "'");
		stmt.close();
		JOptionPane.showMessageDialog(null, "Bilet iptal edildi.");
	}
	
	
	public static int ekle(String isim,String soyisim,String tc_no, int mac_id,String blok_adi,int koltuk_adedi,int fiyat,String koltuk) throws ClassNotFoundException, SQLException
	{
		int blok=0,kategori =0,bilet_no=0;
		db.baglan();
		stmt=db.conn.createStatement();
		String sql=("Select * from bloklar where blok_adi ='"+blok_adi+"'"); 
		set=stmt.executeQuery(sql);
		while(set.next())
		{
			blok=set.getInt("blok_id");
			kategori=set.getInt("kategori_id");
		
		}
		System.out.println("blok bulundu");
		String sql2="INSERT INTO biletler (kisi_adi,kisi_soyadi,tc_no,mac_id,kategori_id,blok_id,koltuk_adedi,koltuk_fiyati,koltuk_adi) values('"
				+ isim+ "','"+soyisim+ "','"+tc_no+ "','"+mac_id+"','"+kategori+"','"+blok+"','"+koltuk_adedi+"','"+fiyat+"','"+koltuk+"')";
		stmt.execute(sql2);
		System.out.println("Eklendi");
		String sql3=("Select bilet_id from biletler where blok_id ='"+blok+"'"
				+ " and kategori_id ='"+kategori+"'"
				+ " and mac_id='"+mac_id+"'"
				+ " and koltuk_adi='"+koltuk+"'"); 
		set=stmt.executeQuery(sql3);
		while(set.next())
		{
			bilet_no = set.getInt("bilet_id");
		}
		return bilet_no;
	}
	
	public static void ekle_koltuk(int mac_id,String blok_adi,String koltuk) throws ClassNotFoundException, SQLException
	{
		int blok=0,kategori =0;
		db.baglan();
		stmt=db.conn.createStatement();
		String sql=("Select * from bloklar where blok_adi ='"+blok_adi+"'"); 
		set=stmt.executeQuery(sql);
		while(set.next())
		{
			blok=set.getInt("blok_id");
			kategori=set.getInt("kategori_id");
		
		}
		System.out.println("blok bulundu");
		String sql2="INSERT INTO bos_koltuklar (mac_id,kategori_id,blok_id,bos_koltuk_adi) values"
				+ "('"+mac_id+"','"+kategori+"','"+blok+"','"+koltuk+"')";
		stmt.execute(sql2);
	}
	public static int takimMacId(String takim1_adi,String takim2_adi) throws SQLException 
	{
		 db.baglan();
			int c=0;
			stmt=db.conn.createStatement();
			String sql=("Select mac_id from maclar where takim1_id="
					+"(select takim_id from takimlar where takim_adi='"+takim1_adi
					+"') and takim2_id="
					+"(select takim_id from takimlar where takim_adi='"+takim2_adi	
					+"')"); 
			set=stmt.executeQuery(sql);
			while(set.next())
			{
				c=set.getInt("mac_id");
			
			}
			return c;
	}
	public static int SorgulaKategori(int mac_id, String kategori_adi) throws SQLException 
	{
		 db.baglan();
			int c=0;
			stmt=db.conn.createStatement();
			String sql=("Select kategori_fiyati from kategoriler where mac_id='"
					+mac_id+"'and kategori_adi ='"+kategori_adi+"'"); 
			set=stmt.executeQuery(sql);
			while(set.next())
			{
				c=set.getInt("kategori_fiyati");
			}
			return c;
	}
	public static String[] SorgulaBlok(int mac_id, String kategori_adi) throws SQLException 
	{
		 db.baglan();
			stmt=db.conn.createStatement();
			String sql=("Select blok_adi from bloklar where mac_id='"
					+mac_id+"'and kategori_id = (select kategori_id from kategoriler"
							+ " where kategori_adi ='"+kategori_adi+"' and mac_id ='"+mac_id+"')"); 
			set=stmt.executeQuery(sql);

			ArrayList<String> liste=new ArrayList<String>();
			liste.add("Seçiniz");
				while(set.next())
				{
					liste.add(set.getString("blok_adi"));
				}
				k=new String[liste.size()];
				k=liste.toArray(k);		
				return k;
	}
	
	public static ArrayList<String> SorgulaKoltuk(int mac_id, String kategori_adi) throws SQLException 
	{
		 db.baglan();
			stmt=db.conn.createStatement();
			String sql=("Select bos_koltuk_adi from bos_koltuklar where mac_id='"
					+mac_id+"'and kategori_id = (select kategori_id from kategoriler"
							+ " where kategori_adi ='"+kategori_adi+"' and mac_id ='"+mac_id+"')"); 
			set=stmt.executeQuery(sql);
			ArrayList<String> liste=new ArrayList<String>();
			while(set.next())
			{
				liste.add(set.getString("bos_koltuk_adi"));
			}
			return liste;
	}
	
	
	public static ArrayList<String> Sorgula_dolukoltuk(int mac_id, String kategori_adi, String blok_adi) throws SQLException 
	{
		 db.baglan();
			stmt=db.conn.createStatement();
			String sql=("Select bos_koltuk_adi from bos_koltuklar where mac_id='"
					+mac_id+"'and blok_id = (select blok_id from bloklar"
							+ " where mac_id ='"+mac_id+"'"
									+ "and blok_adi ='"+blok_adi+"')");  
			set=stmt.executeQuery(sql);

			ArrayList<String> liste=new ArrayList<String>();
				while(set.next())
				{
					liste.add(set.getString("bos_koltuk_adi"));
					
				}
				return liste;
	}
	
	public static ArrayList<String> macSorgula(int mac_id) throws SQLException
	{
        db.baglan();
		stmt=db.conn.createStatement();
		String sql=("Select * from maclar where mac_id='"
				+mac_id+"'");
		
		set=stmt.executeQuery(sql);
		ArrayList<String> liste=new ArrayList<String>();
		while(set.next())
		{
			liste.add(Integer.toString(set.getInt("takim1_id")));
			liste.add(Integer.toString(set.getInt("takim2_id")));
			liste.add(set.getString("yer"));
			liste.add(set.getString("saat"));
			liste.add(set.getString("tarih"));
		}
		return liste;		
	}
	public static ArrayList<String> sorgulabilet(int bilet_no) throws SQLException
	{
		db.baglan();
		stmt=db.conn.createStatement();
		String sql=("Select * from biletler where bilet_id='"+bilet_no+"'");
		set=stmt.executeQuery(sql);
		ArrayList<String> liste=new ArrayList<String>();
		while(set.next())
		{
			liste.add(set.getString("kisi_adi"));
			liste.add(set.getString("kisi_soyadi"));
			liste.add(set.getString("tc_no"));
			liste.add(Integer.toString(set.getInt("mac_id")));
			liste.add(Integer.toString(set.getInt("kategori_id")));
			liste.add(Integer.toString(set.getInt("blok_id")));
			liste.add(Integer.toString(set.getInt("koltuk_fiyati")));			
			liste.add(set.getString("koltuk_adi"));
		}	
		return liste;		
		
	}
	public static String takimAdiSorgula(String takim_adi) throws SQLException
	{
        db.baglan();
		String c="";
		stmt=db.conn.createStatement();
		String sql=("Select * from takimlar where takim_adi='"
				+takim_adi+"'");
		
		set=stmt.executeQuery(sql);
		while(set.next())
		{
			c=set.getString("takim_foto");		
		}	
		return c;
		
	}
	public static String takimAdiSorgula2(int takim_id) throws SQLException
	{
        db.baglan();
		String c="";
		stmt=db.conn.createStatement();
		String sql=("Select takim_adi from takimlar where takim_id='"
				+takim_id+"'");
		
		set=stmt.executeQuery(sql);
		while(set.next())
		{
			c=set.getString("takim_adi");		
		}	
		return c;		
	}
	
	public static String kateSorgula(int kategori_id) throws SQLException
	{
        db.baglan();
		String c="";
		stmt=db.conn.createStatement();
		String sql=("Select kategori_adi from kategoriler where kategori_id='"
				+kategori_id+"'");		
		set=stmt.executeQuery(sql);
		while(set.next())
		{
			c=set.getString("kategori_adi");		
		}	
		return c;		
	}
	
	public static String blokSorgula(int blok_id) throws SQLException
	{
        db.baglan();
		String c="";
		stmt=db.conn.createStatement();
		String sql=("Select blok_adi from bloklar where blok_id='"
				+blok_id+"'");		
		set=stmt.executeQuery(sql);
		while(set.next())
		{
			c=set.getString("blok_adi");		
		}	
		return c;		
	}
}



