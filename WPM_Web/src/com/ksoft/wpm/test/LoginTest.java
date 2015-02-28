package com.ksoft.wpm.test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.ksoft.wpm.common.vo.UserVO;
import com.ksoft.wpm.login.bsl.ILoginManager;
import com.ksoft.wpm.login.vo.LoginVO;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "WPM-Controller.xml"})
public class LoginTest {
	@Autowired
	private ILoginManager loginManager;

	private LoginVO loginVO;
	@Test
	public void validLoginTest() {
		
		assertEquals(true, loginManager.isValidUser(loginVO));
		
	}
	@Test
	public void validUserTest() {
		UserVO userVO = loginManager.getUseDetails("basu@tgt.com");
		assertNotNull(userVO);
		
	}
	
	@Before
	public void init(){
		loginVO = new LoginVO();
		loginVO.setUserId("basu@tgt.com");
		loginVO.setPassword("admin");
		
	}

}
