package com.test.dao;

import com.test.obj.User;

public interface UserDao {
	public void saveUser(User user);
	public User getUser(long id);

}
