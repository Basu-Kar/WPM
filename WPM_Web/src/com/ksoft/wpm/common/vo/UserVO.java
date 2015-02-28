package com.ksoft.wpm.common.vo;

import java.util.Date;

public class UserVO {

	private int userId;
	private String fName;
	private String lName;
	private String userName;
	private String emailId;
	private int roleId;
	private String password;
	private int questionId;
	private String ansText;
	private String dateOfJoinStr;
	private Date dateOfJoin;
	
	public String getfName() {
		return fName;
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
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	public int getRoleId() {
		return roleId;
	}
	public void setRoleId(int roleId) {
		this.roleId = roleId;
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public int getQuestionId() {
		return questionId;
	}
	public void setQuestionId(int questionId) {
		this.questionId = questionId;
	}
	public String getAnsText() {
		return ansText;
	}
	public void setAnsText(String ansText) {
		this.ansText = ansText;
	}
	public String getDateOfJoinStr() {
		return dateOfJoinStr;
	}
	public void setDateOfJoinStr(String dateOfJoinStr) {
		this.dateOfJoinStr = dateOfJoinStr;
	}
	public Date getDateOfJoin() {
		return dateOfJoin;
	}
	public void setDateOfJoin(Date dateOfJoin) {
		this.dateOfJoin = dateOfJoin;
	}
	
	
}
