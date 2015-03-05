package com.ksoft.wpm.common.vo;

public class WorkPacketVO {

	private int workPacketId;
	private int projectId;
	private String workPacketName;
	private String workPacketDesc;
	private String workPacketStartDateStr;
	private String workPacketEndDateStr;
	private String assignedTo;
	private int assignedToId;
	public int getWorkPacketId() {
		return workPacketId;
	}
	public void setWorkPacketId(int workPacketId) {
		this.workPacketId = workPacketId;
	}
	public int getProjectId() {
		return projectId;
	}
	public void setProjectId(int projectId) {
		this.projectId = projectId;
	}
	public String getWorkPacketName() {
		return workPacketName;
	}
	public void setWorkPacketName(String workPacketName) {
		this.workPacketName = workPacketName;
	}
	public String getWorkPacketDesc() {
		return workPacketDesc;
	}
	public void setWorkPacketDesc(String workPacketDesc) {
		this.workPacketDesc = workPacketDesc;
	}
	public String getWorkPacketStartDateStr() {
		return workPacketStartDateStr;
	}
	public void setWorkPacketStartDateStr(String workPacketStartDateStr) {
		this.workPacketStartDateStr = workPacketStartDateStr;
	}
	public String getWorkPacketEndDateStr() {
		return workPacketEndDateStr;
	}
	public void setWorkPacketEndDateStr(String workPacketEndDateStr) {
		this.workPacketEndDateStr = workPacketEndDateStr;
	}
	public String getAssignedTo() {
		return assignedTo;
	}
	public void setAssignedTo(String assignedTo) {
		this.assignedTo = assignedTo;
	}
	public int getAssignedToId() {
		return assignedToId;
	}
	public void setAssignedToId(int assignedToId) {
		this.assignedToId = assignedToId;
	}
	
	
}
