package com.ksoft.wpm.login.validator;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

import com.ksoft.wpm.login.bsl.ILoginManager;
import com.ksoft.wpm.login.vo.LoginVO;

@Component
public class LoginValidator implements Validator{
	
	@Autowired
	private ILoginManager loginManager;

	@Override
	public boolean supports(Class<?> arg0) {
		// TODO Auto-generated method stub
		return false;
	}
/*
 * (non-Javadoc)
 * @see org.springframework.validation.Validator#validate(java.lang.Object, org.springframework.validation.Errors)
 */
	@Override
	public void validate(Object arg0, Errors errors) {
		LoginVO vo = (LoginVO)arg0;//Type Casting
		/*ResourceBundle bundle = ResourceBundle.getBundle("com.ksoft.msg.validationMsg");
		System.out.println(bundle.getString("valida.generic.chars"));*/
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "userId", "field.required.userId");
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "password", "field.required.password");
		boolean validFields=true;
		if(vo.getUserId()==null || vo.getUserId().trim().length()<5 || vo.getUserId().trim().length()>20){
			errors.rejectValue("userId","field.required.userId");	
			validFields=false;
		}
		if(vo.getPassword()==null || vo.getPassword().trim().length()<5 || vo.getPassword().trim().length()>20){
			errors.rejectValue("userId","field.required.password");	
			validFields=false;
		}
		if(validFields && !loginManager.isValidUser(vo)){
			errors.reject("field.inalid.login","field.inalid.login");	
		}
	}

}
