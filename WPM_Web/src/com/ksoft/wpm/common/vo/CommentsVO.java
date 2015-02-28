package com.ksoft.wpm.common.vo;

public class CommentsVO {

	private int wpmId;
	private int reviewId;
	private int commentId;
	private int assignedTo;
	private int reviewStatId;
	private String commentText;
	public int getWpmId() {
		return wpmId;
	}
	public void setWpmId(int wpmId) {
		this.wpmId = wpmId;
	}
	public int getReviewId() {
		return reviewId;
	}
	public void setReviewId(int reviewId) {
		this.reviewId = reviewId;
	}
	public int getCommentId() {
		return commentId;
	}
	public void setCommentId(int commentId) {
		this.commentId = commentId;
	}
	public int getAssignedTo() {
		return assignedTo;
	}
	public void setAssignedTo(int assignedTo) {
		this.assignedTo = assignedTo;
	}
	public int getReviewStatId() {
		return reviewStatId;
	}
	public void setReviewStatId(int reviewStatId) {
		this.reviewStatId = reviewStatId;
	}
	public String getCommentText() {
		return commentText;
	}
	public void setCommentText(String commentText) {
		this.commentText = commentText;
	}
	
	
}
