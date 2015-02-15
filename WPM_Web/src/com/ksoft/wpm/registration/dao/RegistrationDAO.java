package com.ksoft.wpm.registration.dao;

import org.springframework.stereotype.Repository;

import com.ksoft.wpm.registration.vo.RegistrationVO;

@Repository
public class RegistrationDAO implements IRegistrationDAO{

	public void insertUserDetails(RegistrationVO registrationVO){
		
	}
	
	public boolean isEmailDuplicate(RegistrationVO registrationVO){
		return false;
	}
}
