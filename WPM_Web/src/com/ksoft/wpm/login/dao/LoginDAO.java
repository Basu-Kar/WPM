package com.ksoft.wpm.login.dao;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.criterion.Expression;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;

import com.ksoft.wpm.common.dao.BaseDAO;
import com.ksoft.wpm.common.vo.UserVO;
import com.ksoft.wpm.login.vo.LoginVO;

@Repository
public class LoginDAO  extends BaseDAO implements ILoginDAO{

	@Override
	public boolean isValidUser(LoginVO loginVO) {
		Criteria criteria = getSession().createCriteria(LoginVO.class);
		criteria.add(Restrictions.eq("userId", loginVO.getUserId()).ignoreCase());
		criteria.add(Expression.eq("password", loginVO.getPassword()));
		LoginVO vo = (LoginVO)criteria.uniqueResult();
		if(vo==null){
			return false;
		}else{
			return true;
		}
	}

	@Override
	public UserVO getUseDetails(String userId) {
		Query query=getSession().getNamedQuery("findUserByEmailId");
		query.setString("emailId", userId);
		UserVO userVO = (UserVO)query.uniqueResult();
		return userVO;
	}

}
