package com.ksoft.wpm.common.vo;

public class StatusVO {

	private int wpmId;
	private int statId;
	private int phaseId;
	private String assignedTo;
	public int getWpmId() {
		return wpmId;
	}
	public void setWpmId(int wpmId) {
		this.wpmId = wpmId;
	}
	public int getStatId() {
		return statId;
	}
	public void setStatId(int statId) {
		this.statId = statId;
	}
	public int getPhaseId() {
		return phaseId;
	}
	public void setPhaseId(int phaseId) {
		this.phaseId = phaseId;
	}
	public String getAssignedTo() {
		return assignedTo;
	}
	public void setAssignedTo(String assignedTo) {
		this.assignedTo = assignedTo;
	}

	
	
}
