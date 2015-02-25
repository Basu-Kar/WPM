package com.ksoft.wpm.login.bsl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ksoft.wpm.common.vo.UserVO;
import com.ksoft.wpm.login.dao.ILoginDAO;
import com.ksoft.wpm.login.vo.LoginVO;

@Service
public class LoginManager implements ILoginManager{

	@Autowired
	private ILoginDAO  loginDAO;
	
	@Override
	public boolean isValidUser(LoginVO loginVO) {
		// TODO Auto-generated method stub
		return loginDAO.isValidUser(loginVO);
	}

	@Override
	public UserVO getUseDetails(String userId) {
		// TODO Auto-generated method stub
		return loginDAO.getUseDetails(userId);
	}

}
