package com.ksoft.wpm.util;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtil {
	 public static Session getHibernateSession(){
		 
		     Configuration cfg=new Configuration();  
		     cfg.configure("hibernate.cfg.xml");  
		     SessionFactory factory=cfg.buildSessionFactory();  
		     Session session=factory.openSession(); 
		     return session;
		 }
}
