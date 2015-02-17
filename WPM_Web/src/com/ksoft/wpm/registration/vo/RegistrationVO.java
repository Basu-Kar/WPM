package com.ksoft.wpm.registration.vo;

public class RegistrationVO {

	private String email;
	private String fName;
	private String lName;
	private String dateOfJoin;
	private String password;
	private String confirmPassword;
	private String hintQuestionId;
	private String hintAnswer;
	
	public String getEmail() {
		return email;
	}
	public void setHintQuestionId(String hintQuestionId) {
		this.hintQuestionId = hintQuestionId;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getfName() {
		return fName;
	}
	public String getHintQuestionId() {
		return hintQuestionId;
	}
	public void setfName(String fName) {
		this.fName = fName;
	}
	public String getlName() {
		return lName;
	}
	public void setlName(String lName) {
		this.lName = lName;
	}
	public String getDateOfJoin() {
		return dateOfJoin;
	}
	public void setDateOfJoin(String dateOfJoin) {
		this.dateOfJoin = dateOfJoin;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getConfirmPassword() {
		return confirmPassword;
	}
	public void setConfirmPassword(String confirmPassword) {
		this.confirmPassword = confirmPassword;
	}
	/*public int getHintQuestionId() {
		return hintQuestionId;
	}
	public void setHintQuestionId(int hintQuestionId) {
		this.hintQuestionId = hintQuestionId;
	}*/
	public String getHintAnswer() {
		return hintAnswer;
	}
	public void setHintAnswer(String hintAnswer) {
		this.hintAnswer = hintAnswer;
	}
	
	
	
	
}
