package com.ksoft.wpm.registration.validator;

import java.util.ResourceBundle;

import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

import com.ksoft.wpm.login.vo.LoginVO;
import com.ksoft.wpm.registration.vo.RegistrationVO;
import com.ksoft.wpm.util.WPMWhiteListCharUtil;

@Component
public class RegistrationValidator implements Validator {

	WPMWhiteListCharUtil wPMWhiteListCharUtil=new 
			WPMWhiteListCharUtil();
	@Override
	public boolean supports(Class<?> arg0) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void validate(Object arg0, Errors errors) {
		RegistrationVO vo = (RegistrationVO)arg0;
		boolean x=wPMWhiteListCharUtil.isValidEmail(vo.getEmail());
		 if(x==false){
				errors.rejectValue("email","field.required.email");	
			}
		ResourceBundle bundle = ResourceBundle.getBundle("com.ksoft.msg.validationMsg");
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "email", "field.required.email");
		ValidationUtils.rejectIfEmpty(errors, "fName", "field.required.fname");
		ValidationUtils.rejectIfEmpty(errors, "lName", "field.required.lname");
		ValidationUtils.rejectIfEmpty(errors, "password", "field.required.password");
		ValidationUtils.rejectIfEmpty(errors, "confirmPassword", "field.required.cnfrmpassword");
		if(vo.getfName()==null || vo.getfName().trim().length()<8 || vo.getfName().trim().length()>30){
			errors.rejectValue("fName","field.required.fname");			
		}
		if(vo.getlName()==null || vo.getlName().trim().length()<8 || vo.getlName().trim().length()>30){
			errors.rejectValue("lName","field.required.lname");			
		}
		if(!vo.getPassword().equals(vo.getConfirmPassword())){
			errors.reject("password.match");
			
			
		}
	}
}
