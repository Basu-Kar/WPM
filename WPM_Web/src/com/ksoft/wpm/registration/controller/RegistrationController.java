package com.ksoft.wpm.registration.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.ksoft.wpm.registration.vo.RegistrationVO;

@Controller
public class RegistrationController {

	@RequestMapping("")
	public ModelAndView submitRegistration(@ModelAttribute("") RegistrationVO registrationVO ){
		
		return null;
	}
}
