package com.ksoft.wpm.manage.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.ksoft.wpm.common.vo.ReviewVO;

@Repository
public class WorkPacketReviewDAO implements IWorkPacketReviewDAO{

	@Override
	public boolean addWorkPacketReview(ReviewVO reviewVO) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean updateWorkPacketReview(ReviewVO reviewVO) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean deleteWorkPacketReview(int projectId, int workPacketId,
			int reviewId) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public List<ReviewVO> getWorkPackets(int projectId, int workPacketId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<ReviewVO> getWorkPacketsForUser(int userId) {
		// TODO Auto-generated method stub
		return null;
	}

}
