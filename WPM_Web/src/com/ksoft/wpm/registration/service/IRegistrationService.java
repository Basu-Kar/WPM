package com.ksoft.wpm.registration.service;

import org.springframework.stereotype.Service;

import com.ksoft.wpm.registration.vo.RegistrationVO;

@Service
public interface IRegistrationService {
	public void saveUserDetails(RegistrationVO registrationVO);
	public boolean isEmailDuplicate(RegistrationVO registrationVO);

	
}
