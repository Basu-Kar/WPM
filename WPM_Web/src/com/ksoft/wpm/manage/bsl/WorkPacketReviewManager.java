package com.ksoft.wpm.manage.bsl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ksoft.wpm.common.vo.ReviewVO;
import com.ksoft.wpm.manage.dao.IWorkPacketReviewDAO;

@Service
public class WorkPacketReviewManager implements IWorkPacketReviewManager{
	
	@Autowired
	private IWorkPacketReviewDAO reviewDAO;

	@Override
	public boolean addWorkPacketReview(ReviewVO reviewVO) {
		// TODO Auto-generated method stub
		return reviewDAO.addWorkPacketReview(reviewVO);
	}

	@Override
	public boolean updateWorkPacketReview(ReviewVO reviewVO) {
		// TODO Auto-generated method stub
		return reviewDAO.updateWorkPacketReview(reviewVO);
	}

	@Override
	public boolean deleteWorkPacketReview(int projectId, int workPacketId,
			int reviewId) {
		// TODO Auto-generated method stub
		return reviewDAO.deleteWorkPacketReview(projectId, workPacketId, reviewId);
	}

	@Override
	public List<ReviewVO> getWorkPackets(int projectId, int workPacketId) {
		// TODO Auto-generated method stub
		return reviewDAO.getWorkPackets(projectId, workPacketId);
	}

	@Override
	public List<ReviewVO> getWorkPacketsForUser(int userId) {
		// TODO Auto-generated method stub
		return reviewDAO.getWorkPacketsForUser(userId);
	}

}
 