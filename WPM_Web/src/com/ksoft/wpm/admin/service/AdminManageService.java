package com.ksoft.wpm.admin.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ksoft.wpm.admin.dao.IAdminManageDAO;
import com.ksoft.wpm.admin.vo.QuestionVO;

@Service
public class AdminManageService implements IAdminManageService{
	
	@Autowired
	private IAdminManageDAO adminManageDAO;
	
	public void insertQuestion(QuestionVO questionVO){
		adminManageDAO.insertQuestion(questionVO);
	}

}
