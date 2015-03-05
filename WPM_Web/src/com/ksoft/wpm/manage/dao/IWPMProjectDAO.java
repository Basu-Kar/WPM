package com.ksoft.wpm.manage.dao;

import java.util.List;

import com.ksoft.wpm.common.vo.ProjectVO;
import com.ksoft.wpm.common.vo.UserVO;

public interface IWPMProjectDAO {

	public boolean addProject(ProjectVO projectVO);
	public boolean upodateProject(ProjectVO projectVO);
	public boolean deleteProject(int projectId);
	
	public List<ProjectVO> getAllProjects(int userId);
	public boolean addProjectUsers(int projectId, UserVO UserVO);
}
