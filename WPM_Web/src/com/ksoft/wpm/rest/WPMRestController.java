package com.ksoft.wpm.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.ksoft.wpm.common.vo.UserVO;
import com.ksoft.wpm.login.bsl.LoginManager;

@RestController
public class WPMRestController {

	@Autowired
	private LoginManager loginManager;
	
	
	/**
	 * Produces domain object as JSON data.
	 */
	@RequestMapping(value="/getUserDetailsAsJSON.do", method=RequestMethod.GET)
	public UserVO getUserDetailsAsJSON(@RequestParam(value="email", defaultValue="basu@tgt.com") String email){
		System.out.println("email = "+email);
		return loginManager.getUseDetails(email);
		
	}
	

	/**
	 * Consumes json data as domain object.
	 * @param userVO
	 */
	@RequestMapping(value="/saveUserDetailsAsJSON.do", method=RequestMethod.POST)
	@ResponseStatus(value = HttpStatus.OK)
	public void saveUserDetailsAsJSON(@RequestBody UserVO userVO){
		System.out.println("......................"+userVO.getEmailId()+" - "+userVO.getDateOfJoin());
		
	}
	
	/**
	 * produces domain object as XML
	 * @param email
	 * @return
	 */
	@RequestMapping(value="/getUserDetailsAsXML.do", method=RequestMethod.GET,produces=MediaType.APPLICATION_XML_VALUE)
	public UserVO getUserDetailsAsXML(@RequestParam(value="email", defaultValue="basu@tgt.com") String email){
		return loginManager.getUseDetails(email);
		
	}
	
	/**
	 * consumes XML data as domain object 
	 * @param userVO
	 */
	@RequestMapping(value="/saveUserDetailsAsXML.do", method=RequestMethod.POST)
	@ResponseStatus(value = HttpStatus.OK)
	public void saveUserDetailsAsXML(@RequestBody UserVO userVO){
		System.out.println("......................"+userVO.getEmailId()+" - "+userVO.getDateOfJoin());
		
	}
	
	
}
