package com.ksoft.wpm.manage.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.ksoft.wpm.common.vo.ProjectVO;
import com.ksoft.wpm.manage.bsl.IWPMProjectManager;

@Controller
public class ProjectController {
	
	@Autowired
	private IWPMProjectManager projectManager;

	@RequestMapping(value="/addProject.do", method=RequestMethod.POST)
	public ModelAndView addProject(@ModelAttribute("projectVO")ProjectVO projectVO){
	
		
		return new ModelAndView("/manage/addProject");
	}
	
	@RequestMapping(value="/saveProject.do", method=RequestMethod.POST)
	public ModelAndView addProject(@ModelAttribute("projectVO")ProjectVO projectVO,BindingResult bindingResult,Model model){
	
		projectManager.addProject(projectVO);
		return new ModelAndView("/home/home");
	}
}
