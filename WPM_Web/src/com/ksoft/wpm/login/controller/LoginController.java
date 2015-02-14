package com.ksoft.wpm.login.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.Validator;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.ksoft.wpm.login.validator.LoginValidator;
import com.ksoft.wpm.login.vo.LoginVO;


@Controller
public class LoginController {

	//@Qualifier("loginVOValidator")
	@Autowired
	private LoginValidator loginValidator;
	
	 
	@RequestMapping("/login.do")
	public ModelAndView login(@ModelAttribute("loginVO")LoginVO loginVO){
	
		System.out.println("..............Login Controller..");
		return new ModelAndView("/login/login");
	}
	
	@RequestMapping("/validateLogin.do")
	public ModelAndView validateLogin(@ModelAttribute("loginVO")LoginVO loginVO,BindingResult bindingResult,Model model){
		loginValidator.validate(loginVO, bindingResult);
		System.out.println("..............Login Controller..");
		if(bindingResult.hasErrors()){
			System.out.println("..................HAS ERRORS.........");
		}
		return new ModelAndView("/login/login");
	}
	
	@RequestMapping("/register.do")
	public ModelAndView register(){
		System.out.println("register................");
		ModelAndView mv = new ModelAndView("registration/registration");
		return mv;
	}
}