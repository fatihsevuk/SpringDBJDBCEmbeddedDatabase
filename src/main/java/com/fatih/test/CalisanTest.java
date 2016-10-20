package com.fatih.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.fatih.model.Calisan;
import com.fatih.service.CalisanService;

public class CalisanTest {
public static void main(String[] args) {
	
	ApplicationContext context=new ClassPathXmlApplicationContext("app-config.xml");
	
	CalisanService calisanService=context.getBean(CalisanService.class);
	
	Calisan calisan=new Calisan("ali" , "kaya"); 
	
	calisanService.calisanEkle(calisan);
	
	
}
}
