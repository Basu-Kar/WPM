package com.ksoft.wpm.util;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class WPMWhiteListCharUtil {

	private static final String validChar="[a-zA-Z0-9,.;:_'\\s-]*"; 
	
	private static final String EMAIL_PATTERN = 
			"^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@"
			+ "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";
	 
	
	public static boolean isValidCharList(String charsStr){
		Pattern pattern = Pattern.compile(validChar);
		Matcher matcher = pattern.matcher(charsStr);
		return matcher.find();
	}
	
	public static boolean isValidEmail(String charsStr){
		Pattern pattern = Pattern.compile(EMAIL_PATTERN);
		Matcher matcher = pattern.matcher(charsStr);
		return matcher.find();
	}

}
