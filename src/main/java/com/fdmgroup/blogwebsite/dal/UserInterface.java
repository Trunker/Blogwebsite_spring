package com.fdmgroup.blogwebsite.dal;

import com.fdmgroup.blogwebsite.entity.User;

public interface UserInterface {

	// public Connection initialize();
	public void addUser(User user);

	public void removeUser(int userId);

	public void modifyUserPassword(int userId, String newPassword);

	public User getUser(int userId);

	public java.util.List getUserList();
}
