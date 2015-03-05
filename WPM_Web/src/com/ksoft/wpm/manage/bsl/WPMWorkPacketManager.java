package com.ksoft.wpm.manage.bsl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ksoft.wpm.common.vo.WorkPacketVO;
import com.ksoft.wpm.manage.dao.IWPMWorkPacketDAO;

@Service
public class WPMWorkPacketManager implements IWPMWorkPacketManager{

	@Autowired
	private IWPMWorkPacketDAO workPacketDAO;
	
	@Override
	public boolean addWorPacket(int projectId, WorkPacketVO workPAcketVO) {
		// TODO Auto-generated method stub
		return workPacketDAO.addWorPacket(projectId, workPAcketVO);
	}

	@Override
	public boolean updateWorPacket(int projectId, WorkPacketVO workPAcketVO) {
		// TODO Auto-generated method stub
		return workPacketDAO.updateWorPacket(projectId, workPAcketVO);
	}

	@Override
	public boolean deleteWorPacket(int projectId, int workPacketId) {
		// TODO Auto-generated method stub
		return workPacketDAO.deleteWorPacket(projectId, workPacketId);
	}

	@Override
	public List<WorkPacketVO> getWorkPacketsForProject(int projectId) {
		// TODO Auto-generated method stub
		return workPacketDAO.getWorkPacketsForProject(projectId);
	}

	@Override
	public List<WorkPacketVO> getAssinedWorkPackets(int userId) {
		// TODO Auto-generated method stub
		return workPacketDAO.getAssinedWorkPackets(userId);
	}

}
 