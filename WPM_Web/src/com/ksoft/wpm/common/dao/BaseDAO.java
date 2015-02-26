package com.ksoft.wpm.common.dao;

import org.hibernate.Session;

import com.ksoft.wpm.util.HibernateUtil;


public class BaseDAO {
	
	public Session getSession() {
		return HibernateUtil.getHibernateSession();
	}
	

}
