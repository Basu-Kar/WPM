package com.ksoft.wpm.manage.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.ksoft.wpm.common.vo.WorkPacketVO;

@Repository
public class WPMWorkPacketDAO implements IWPMWorkPacketDAO{

	@Override
	public boolean addWorPacket(int projectId, WorkPacketVO workPAcketVO) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean updateWorPacket(int projectId, WorkPacketVO workPAcketVO) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean deleteWorPacket(int projectId, int workPacketId) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public List<WorkPacketVO> getWorkPacketsForProject(int projectId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<WorkPacketVO> getAssinedWorkPackets(int userId) {
		// TODO Auto-generated method stub
		return null;
	}

}
