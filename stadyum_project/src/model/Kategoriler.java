package model;

public class Kategoriler 
{
	private int kategori_id;
	private int mac_id;
	private double fiyat;
	
	
	
	//************getter/setter
	
	
	public int getKategori_id() {
		return kategori_id;
	}
	public void setKategori_id(int kategori_id) {
		this.kategori_id = kategori_id;
	}
	public int getMac_id() {
		return mac_id;
	}
	public void setMac_id(int mac_id) {
		this.mac_id = mac_id;
	}
	public double getFiyat() {
		return fiyat;
	}
	public void setFiyat(double fiyat) {
		this.fiyat = fiyat;
	}

}
