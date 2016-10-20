package com.fatih.model;

public class Calisan {
	private String ad;
	private String soyad;
	public String getAd() {
		return ad;
	}
	public void setAd(String ad) {
		this.ad = ad;
	}
	public String getSoyad() {
		return soyad;
	}
	public void setSoyad(String soyad) {
		this.soyad = soyad;
	}
	
	public Calisan() {
		// TODO Auto-generated constructor stub
	}
	public Calisan(String ad, String soyad) {
		super();
		this.ad = ad;
		this.soyad = soyad;
	}
	@Override
	public String toString() {
		return "Calisan [ad=" + ad + ", soyad=" + soyad + "]";
	}
	
	
	

}
