package com.ksoft.wpm.login.bsl;

import com.ksoft.wpm.common.vo.UserVO;
import com.ksoft.wpm.login.vo.LoginVO;



public interface ILoginManager {

	public boolean isValidUser(LoginVO loginVO);
	public UserVO getUseDetails(String userId);
	
}
