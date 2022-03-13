package com.placementmanagement.service;

import com.placementmanagement.entities.User;
import com.placementmanagement.repository.IUserRepository;
import com.placementmanagement.repository.IUserRepositoryImpl;

public class IUserServiceImpl implements IUserService{

	
	private IUserRepository  use;

	public IUserServiceImpl() {
		use = new IUserRepositoryImpl();
	}

	
	
	public void addUser(User user) {
		use.beginTransaction();
		use.addUser(user);
		use.commitTransaction();
		
	}

	public void updateUser(User user) {
		use.beginTransaction();
		use.updateUser(user);
		use.commitTransaction();
		
	}

	public User login(User user) {
		// TODO Auto-generated method stub
		return null;
	}

	public boolean logOut() {
		// TODO Auto-generated method stub
		return false;
	}
	

}
