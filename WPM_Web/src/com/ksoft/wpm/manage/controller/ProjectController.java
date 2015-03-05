package com.ksoft.wpm.manage.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.ksoft.wpm.common.vo.ProjectVO;

@Controller
public class ProjectController {

	@RequestMapping(value="/addProject.do", method=RequestMethod.POST)
	public ModelAndView addProject(@ModelAttribute("projectVO")ProjectVO projectVO){
	
		System.out.println("???????????????/");
		return new ModelAndView("/manage/addProject");
	}
}
