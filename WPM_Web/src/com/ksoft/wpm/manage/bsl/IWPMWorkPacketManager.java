package com.ksoft.wpm.manage.bsl;

import java.util.List;

import com.ksoft.wpm.common.vo.WorkPacketVO;

public interface IWPMWorkPacketManager {

	public boolean addWorPacket(int projectId, WorkPacketVO workPAcketVO);
	public boolean updateWorPacket(int projectId, WorkPacketVO workPAcketVO);
	public boolean deleteWorPacket(int projectId, int workPacketId);
	
	public List<WorkPacketVO> getWorkPacketsForProject(int projectId);
	public List<WorkPacketVO> getAssinedWorkPackets(int userId);
}
 