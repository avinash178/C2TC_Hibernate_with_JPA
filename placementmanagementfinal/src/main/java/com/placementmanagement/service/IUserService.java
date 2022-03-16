package com.placementmanagement.service;

import com.placementmanagement.entities.Student;
import com.placementmanagement.entities.User;

public interface IUserService {
	public User searchUserById(long id);
	
	public abstract void addUser(User user);

	public abstract void updateUser(User user);
	
	public abstract void removeUser(User user);

	public User login(User user);

	public boolean logOut();

}
