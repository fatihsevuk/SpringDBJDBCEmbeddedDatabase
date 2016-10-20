package com.fatih.dao;

import java.util.List;

import com.fatih.model.Calisan;

public interface CalisanDAO {
	
	public void calisanEkle(Calisan calisan);
	public List<Calisan> caliasanListele();
	
}
