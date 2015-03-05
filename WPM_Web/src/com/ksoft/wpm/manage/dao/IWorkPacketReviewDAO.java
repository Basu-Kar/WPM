package com.ksoft.wpm.manage.dao;

import java.util.List;

import com.ksoft.wpm.common.vo.ReviewVO;

public interface IWorkPacketReviewDAO {

	public boolean addWorkPacketReview(ReviewVO reviewVO);
	public boolean updateWorkPacketReview(ReviewVO reviewVO);
	public boolean deleteWorkPacketReview(int projectId, int workPacketId, int reviewId);
	
	public List<ReviewVO> getWorkPackets(int projectId, int workPacketId);
	public List<ReviewVO> getWorkPacketsForUser(int userId);
}
