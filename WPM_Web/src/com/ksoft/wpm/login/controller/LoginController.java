package com.ksoft.wpm.login.controller;

import java.util.logging.Level;
import java.util.logging.Logger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.ksoft.wpm.common.session.ISessionHolder;
import com.ksoft.wpm.common.vo.UserVO;
import com.ksoft.wpm.login.bsl.LoginManager;
import com.ksoft.wpm.login.validator.LoginValidator;
import com.ksoft.wpm.login.vo.LoginVO;
import com.ksoft.wpm.registration.validator.RegistrationValidator;
import com.ksoft.wpm.registration.vo.RegistrationVO;


@Controller
public class LoginController {
	
	private final static Logger LOGGER = Logger.getLogger(LoginController.class.getName()); 

	//@Qualifier("loginVOValidator")
	@Autowired
	private LoginValidator loginValidator;
	@Autowired
	private RegistrationValidator registrationValidator;
	@Autowired
	private LoginManager loginManager;
	@Autowired
	private ISessionHolder<String> sessionHolder;
	
	 
	@RequestMapping(value="/login.do")
	public ModelAndView login(@ModelAttribute("loginVO")LoginVO loginVO){
	
		return new ModelAndView("/login/login");
	}
	
	@RequestMapping(value="/validateLogin.do", method=RequestMethod.POST)
	public ModelAndView validateLogin(@ModelAttribute("loginVO")LoginVO loginVO,BindingResult bindingResult,Model model){
		loginValidator.validate(loginVO, bindingResult);
		ModelAndView mu=new ModelAndView();
		if(bindingResult.hasErrors()){
			mu.setViewName("/login/login");
		}
		else{
			mu.setViewName("/home/home");
		}
		return mu;
		//return new ModelAndView("/login/login");
	}
	
	
	@RequestMapping(value="/getLoginUserDetails.do", method=RequestMethod.GET)
	public @ResponseBody UserVO getLoginUserDetails(@RequestParam(value="email", defaultValue="basu@tgt.com") String email){
		System.out.println("......................");
		return loginManager.getUseDetails(email);
		
	}
}
