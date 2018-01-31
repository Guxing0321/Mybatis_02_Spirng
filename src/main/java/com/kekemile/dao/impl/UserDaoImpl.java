package com.kekemile.dao.impl;

import org.apache.ibatis.session.SqlSession;
import org.mybatis.spring.support.SqlSessionDaoSupport;

import com.kekemile.dao.UserDao;
import com.kekemile.po.User;

public class UserDaoImpl extends SqlSessionDaoSupport implements UserDao {

	public User FindUserById(int id) {
		// TODO Auto-generated method stub

		SqlSession session = this.getSqlSession();
		return (User) session.selectOne("selectUserById", 1);

	}

	public void deleteUserById(int id) {
		// TODO Auto-generated method stub

	}

}
