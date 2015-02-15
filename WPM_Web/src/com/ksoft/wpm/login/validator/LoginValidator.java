package com.ksoft.wpm.login.validator;

import java.util.ResourceBundle;

import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;
import org.springframework.validation.annotation.Validated;

import com.ksoft.wpm.login.vo.LoginVO;

@Component
public class LoginValidator implements Validator{

	@Override
	public boolean supports(Class<?> arg0) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void validate(Object arg0, Errors errors) {
		LoginVO vo = (LoginVO)arg0;
		ResourceBundle bundle = ResourceBundle.getBundle("com.ksoft.msg.validationMsg");
		System.out.println(bundle.getString("valida.generic.chars"));
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "userId", "field.required.userId");
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "password", "field.required.password");
		if(vo.getUserId()==null || vo.getUserId().trim().length()<8 || vo.getUserId().trim().length()>20){
			errors.rejectValue("userId","field.required.userId");	
		}
	}

}
