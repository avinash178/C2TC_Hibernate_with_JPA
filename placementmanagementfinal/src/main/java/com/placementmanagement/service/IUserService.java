package com.placementmanagement.service;

import com.placementmanagement.entities.User;

public interface IUserService {
	public abstract void addUser(User user);

	public abstract void updateUser(User user);

	public User login(User user);

	public boolean logOut();

}
