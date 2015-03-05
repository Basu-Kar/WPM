package com.ksoft.wpm.common.vo;

public class ProjectVO {

	private int projectId;
	private String projectName;
	private String projectDesc;
	private String projectStartDateStr;
	private String projectEndDateStr;
	
	public int getProjectId() {
		return projectId;
	}
	public void setProjectId(int projectId) {
		this.projectId = projectId;
	}
	public String getProjectName() {
		return projectName;
	}
	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}
	public String getProjectDesc() {
		return projectDesc;
	}
	public void setProjectDesc(String projectDesc) {
		this.projectDesc = projectDesc;
	}
	public String getProjectStartDateStr() {
		return projectStartDateStr;
	}
	public void setProjectStartDateStr(String projectStartDateStr) {
		this.projectStartDateStr = projectStartDateStr;
	}
	public String getProjectEndDateStr() {
		return projectEndDateStr;
	}
	public void setProjectEndDateStr(String projectEndDateStr) {
		this.projectEndDateStr = projectEndDateStr;
	}
	
}
