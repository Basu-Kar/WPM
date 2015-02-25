package com.ksoft.wpm.login.dao;

import org.springframework.stereotype.Repository;

import com.ksoft.wpm.common.vo.UserVO;
import com.ksoft.wpm.login.vo.LoginVO;

@Repository
public class LoginDAO implements ILoginDAO{

	@Override
	public boolean isValidUser(LoginVO loginVO) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public UserVO getUseDetails(String userId) {
		// TODO Auto-generated method stub
		return null;
	}

}
