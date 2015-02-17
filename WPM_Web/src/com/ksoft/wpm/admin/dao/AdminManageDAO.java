package com.ksoft.wpm.admin.dao;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.springframework.stereotype.Repository;

import com.ksoft.wpm.admin.vo.QuestionVO;
import com.ksoft.wpm.util.HibernateUtil;

@Repository
public class AdminManageDAO implements IAdminManageDAO{
	public void insertQuestion(QuestionVO questionVO){
		Session session=HibernateUtil.getHibernateSession();
	     Transaction t=session.beginTransaction();
	     session.persist(questionVO);
	     t.commit();
	     session.close();
	}

}
