package com.ksoft.wpm.manage.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.ksoft.wpm.common.vo.ProjectVO;
import com.ksoft.wpm.common.vo.UserVO;

@Repository
public class WPMProjectDAO implements IWPMProjectDAO{

	@Override
	public boolean addProject(ProjectVO projectVO) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean upodateProject(ProjectVO projectVO) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean deleteProject(int projectId) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public List<ProjectVO> getAllProjects(int userId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean addProjectUsers(int projectId, UserVO UserVO) {
		// TODO Auto-generated method stub
		return false;
	}

}
