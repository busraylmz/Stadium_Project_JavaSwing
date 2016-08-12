package model;

import java.sql.Date;

public class Mac 
{
	private int mac_id;
	private int takim1_id;
	private int takim2_id;
    private String yer;
    private Date tarih;
    private String saat;
    
    //******************getter/setter
    
    
	public int getMac_id() {
		return mac_id;
	}
	public void setMac_id(int mac_id) {
		this.mac_id = mac_id;
	}
	public int getTakim1_id() {
		return takim1_id;
	}
	public void setTakim1_id(int takim1_id) {
		this.takim1_id = takim1_id;
	}
	public int getTakim2_id() {
		return takim2_id;
	}
	public void setTakim2_id(int takim2_id) {
		this.takim2_id = takim2_id;
	}
	public String getYer() {
		return yer;
	}
	public void setYer(String yer) {
		this.yer = yer;
	}
	public Date getTarih() {
		return tarih;
	}
	public void setTarih(Date tarih) {
		this.tarih = tarih;
	}
	public String getSaat() {
		return saat;
	}
	public void setSaat(String saat) {
		this.saat = saat;
	}
    
}
