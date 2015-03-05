package com.ksoft.wpm.common.vo;

import java.util.Date;

import com.ksoft.wpm.util.WPMDateUtil;

public class ProjectVO {

	private int projectId;
	private String projectName;
	private String projectDesc; 
	private String projectStartDateStr;
	private String projectEndDateStr;
	private Date projectStartDate;
	private Date projectEndDate;
	
	private int projectStatus;
	private String projectAssignedTo;
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
	public int getProjectStatus() {
		return projectStatus;
	}
	public void setProjectStatus(int projectStatus) {
		this.projectStatus = projectStatus;
	}
	public String getProjectAssignedTo() {
		return projectAssignedTo;
	}
	public void setProjectAssignedTo(String projectAssignedTo) {
		this.projectAssignedTo = projectAssignedTo;
	}
	public Date getProjectStartDate() {
		projectStartDate = WPMDateUtil.getStringAsDate(projectStartDateStr);
		return projectStartDate;
	}
	public void setProjectStartDate(Date projectStartDate) {
		this.projectStartDate = projectStartDate;
	}
	public Date getProjectEndDate() {
		projectStartDate = WPMDateUtil.getStringAsDate(projectEndDateStr);
		return projectEndDate;
	}
	public void setProjectEndDate(Date projectEndDate) {
		this.projectEndDate = projectEndDate;
	}
	
}
