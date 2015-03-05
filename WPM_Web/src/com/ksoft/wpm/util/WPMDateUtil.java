package com.ksoft.wpm.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class WPMDateUtil {

	public boolean isValidDateFormat(){
		return false;
	}
	
	public static Date getStringAsDate(String dateStr){
		SimpleDateFormat formatter = new SimpleDateFormat("dd-MMM-yyyy");
		//String dateInString = "7-Jun-2013";
		Date date = null;
	 
		try {
	 
			date = formatter.parse(dateStr);
			System.out.println(date);
			System.out.println(formatter.format(date));
	 
		} catch (ParseException e) {
			e.printStackTrace();
		}
		return date;
	}
}
