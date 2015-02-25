package com.ksoft.wpm.login.dao;

import com.ksoft.wpm.common.vo.UserVO;
import com.ksoft.wpm.login.vo.LoginVO;

public interface ILoginDAO {

	public boolean isValidUser(LoginVO loginVO);
	public UserVO getUseDetails(String userId);
}
