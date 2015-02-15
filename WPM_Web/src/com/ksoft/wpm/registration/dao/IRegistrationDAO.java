package com.ksoft.wpm.registration.dao;

import com.ksoft.wpm.registration.vo.RegistrationVO;

public interface IRegistrationDAO {
	
	public void insertUserDetails(RegistrationVO registrationVO);
	public boolean isEmailDuplicate(RegistrationVO registrationVO);

}
