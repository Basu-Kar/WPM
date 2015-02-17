package com.ksoft.wpm.registration.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.ksoft.wpm.admin.service.IAdminManageService;
import com.ksoft.wpm.admin.vo.QuestionVO;
import com.ksoft.wpm.login.validator.LoginValidator;
import com.ksoft.wpm.login.vo.LoginVO;
import com.ksoft.wpm.registration.validator.RegistrationValidator;
import com.ksoft.wpm.registration.vo.RegistrationVO;

@Controller
public class RegistrationController {
	
	@Autowired
	private RegistrationValidator registrationValidator;
	
	@Autowired
	private IAdminManageService adminManageService;
	
/*
	@RequestMapping("/registration.do")
	public ModelAndView submitRegistration(@ModelAttribute("registrationVO") RegistrationVO registrationVO ){
		System.out.println("..............Registration Controller.....");
		return new ModelAndView("/registration/registration");
	}
	*/
	
	@RequestMapping("/validateRegistration.do")
	public ModelAndView validateRegistration(@ModelAttribute("registrationVO")RegistrationVO registrationVO,BindingResult bindingResult,Model model){
		/*registrationValidator.validate(registrationVO, bindingResult);
		System.out.println("..............Registration Controller..");
		if(bindingResult.hasErrors()){
			System.out.println("..................HAS ERRORS.........");
		}*/
		
		QuestionVO qVO = new QuestionVO();
		qVO.setQuestionName("Question1");
		qVO.setQuestionDesc("Question1");
		adminManageService.insertQuestion(qVO);
		return new ModelAndView("/registration/registration");
	}
}
