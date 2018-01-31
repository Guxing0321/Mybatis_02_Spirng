package com.kekemile.dao;

import com.kekemile.po.User;

public interface UserDao {
	public void deleteUserById(int id);

	public User FindUserById(int id);
}
