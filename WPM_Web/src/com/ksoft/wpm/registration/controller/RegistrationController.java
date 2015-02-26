package com.ksoft.wpm.registration.controller;

import java.util.logging.Level;
import java.util.logging.Logger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.ksoft.wpm.admin.service.IAdminManageService;
import com.ksoft.wpm.admin.vo.QuestionVO;
import com.ksoft.wpm.login.controller.LoginController;
import com.ksoft.wpm.login.validator.LoginValidator;
import com.ksoft.wpm.login.vo.LoginVO;
import com.ksoft.wpm.registration.validator.RegistrationValidator;
import com.ksoft.wpm.registration.vo.RegistrationVO;

@Controller
public class RegistrationController {
	private final static Logger LOGGER = Logger.getLogger(RegistrationController.class.getName()); 
	
	
	@Autowired
	private RegistrationValidator registrationValidator;
	
	@Autowired
	private IAdminManageService adminManageService;
	
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
	

	@RequestMapping(value="/register.do",method=RequestMethod.POST)
	public ModelAndView register(@ModelAttribute("") RegistrationVO registrationVO){
		LOGGER.log(Level.INFO, "Register......");
		ModelAndView mv = new ModelAndView("registration/registration");
		return mv;
	}
	
}
