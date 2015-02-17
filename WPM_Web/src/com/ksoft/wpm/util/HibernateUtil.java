package com.ksoft.wpm.util;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtil {
	 public static Session getHibernateSession(){
		 
		 //creating configuration object  
		     Configuration cfg=new Configuration();  
		     cfg.configure("hibernate.cfg.xml");//populates the data of the configuration file  
		       
		     //creating seession factory object  
		     SessionFactory factory=cfg.buildSessionFactory();  
		       
		     //creating session object  
		     Session session=factory.openSession(); 
		     return session;
		 }
}
