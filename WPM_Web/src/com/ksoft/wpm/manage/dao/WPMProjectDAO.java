package com.ksoft.wpm.manage.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.springframework.stereotype.Repository;

import com.ksoft.wpm.common.dao.BaseDAO;
import com.ksoft.wpm.common.vo.ProjectVO;
import com.ksoft.wpm.common.vo.UserVO;

@Repository
public class WPMProjectDAO extends BaseDAO implements IWPMProjectDAO{

	@Override
	public boolean addProject(ProjectVO projectVO) {
		// TODO Auto-generated method stub
		Session session = getSession();
		Transaction t=session.beginTransaction();
	    session.persist(projectVO);
	    t.commit();
	    session.close();
	     
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
		Query query = getSession().createQuery("from ProjectVO");
		List<ProjectVO> list = query.list();
		return list;
	}

	@Override
	public boolean addProjectUsers(int projectId, UserVO UserVO) {
		// TODO Auto-generated method stub
		return false;
	}

}
