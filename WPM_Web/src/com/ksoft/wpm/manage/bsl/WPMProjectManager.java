package com.ksoft.wpm.manage.bsl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ksoft.wpm.common.vo.ProjectVO;
import com.ksoft.wpm.common.vo.UserVO;
import com.ksoft.wpm.manage.dao.IWPMProjectDAO;

@Service
public class WPMProjectManager implements IWPMProjectManager{
	
	@Autowired
	private IWPMProjectDAO projectDAO;

	@Override
	public boolean addProject(ProjectVO projectVO) {
		// TODO Auto-generated method stub
		return projectDAO.addProject(projectVO);
	}

	@Override
	public boolean upodateProject(ProjectVO projectVO) {
		// TODO Auto-generated method stub
		return projectDAO.upodateProject(projectVO);
	}

	@Override
	public boolean deleteProject(int projectId) {
		// TODO Auto-generated method stub
		return projectDAO.deleteProject(projectId);
	}

	@Override
	public List<ProjectVO> getAllProjects(int userId) {
		// TODO Auto-generated method stub
		return projectDAO.getAllProjects(userId);
	}

	@Override
	public boolean addProjectUsers(int projectId, UserVO UserVO) {
		// TODO Auto-generated method stub
		return projectDAO.addProjectUsers(projectId, UserVO);
	}

}
 