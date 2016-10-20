package com.fatih.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import java.util.List;

import javax.inject.Inject;
import javax.inject.Named;
import javax.sql.DataSource;

import com.fatih.dao.CalisanDAO;
import com.fatih.model.Calisan;


@Named
public class CalisanDAOImpl implements CalisanDAO {

	
	@Inject
	private DataSource dataSource;
	
	
	
	



	public CalisanDAOImpl() {
		// TODO Auto-generated constructor stub
	}
	
	
	
	
	public void calisanEkle(Calisan calisan) {
		PreparedStatement ps=null;
		Connection conn=null;
		
		try {
			
			conn=dataSource.getConnection();
			
			ps=conn.prepareStatement("insert into Calisan(ad,soyad) values(?,?)");
			
			ps.setString(1, calisan.getAd());
			ps.setString(2, calisan.getSoyad());
			
			ps.executeUpdate();
			
			
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally{
			try{
			if(ps!=null){
				ps.close();
			}
			}catch(SQLException e){
				throw new RuntimeException(e);
			}
		}
		
	}

	public List<Calisan> caliasanListele() {
		PreparedStatement ps=null;
		Connection conn=null;
		
		List<Calisan> calisanList=new ArrayList<Calisan>();
		
		try{
			
			conn=dataSource.getConnection();
			
			ps=conn.prepareStatement("select*from calisan");
			
			ResultSet rs=ps.executeQuery();
			
			while(rs.next()){
				
				//int id=rs.getInt("calisanId");
				String ad=rs.getString("ad");
				String soyad=rs.getString("soyad");
				
				Calisan calisan=new Calisan(ad, soyad);
				
				calisanList.add(calisan);
			}
				System.out.println("Calisan listesi");
				
				for (Calisan calisan : calisanList) {
					System.out.println(calisan);
				}
				
				
				
				
				
				
				
				
			
			
		}catch(SQLException e){
			e.printStackTrace();
		}
		
		
		return calisanList;
	}
	
}
