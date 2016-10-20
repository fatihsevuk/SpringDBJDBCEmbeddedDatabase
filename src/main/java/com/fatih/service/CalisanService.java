package com.fatih.service;

import java.util.List;

import javax.inject.Inject;
import javax.inject.Named;

import com.fatih.dao.impl.CalisanDAOImpl;
import com.fatih.model.Calisan;

@Named
public class CalisanService{
	
	
	

	private CalisanDAOImpl calisanDAOImpl;
	
	
	
	
	


	public CalisanService() {
		// TODO Auto-generated constructor stub
	}
	
	
	@Inject
	public CalisanService(CalisanDAOImpl calisanDAOImpl) {
	
		this.calisanDAOImpl = calisanDAOImpl;
	}
	
	public void calisanEkle(Calisan calisan){
		calisanDAOImpl.calisanEkle(calisan);
	}
	
	public List<Calisan> calisanListele(){
		return calisanDAOImpl.caliasanListele();
	}

}
