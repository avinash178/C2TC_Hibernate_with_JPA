package com.placementmanagement.repository;

import com.placementmanagement.entities.User;

public interface IUserRepository {
	public abstract void addUser(User user);

	public abstract void updateUser(User user);

	public User deleteUser(long id);
	
	public abstract void commitTransaction();

	public abstract void beginTransaction();
	

}
