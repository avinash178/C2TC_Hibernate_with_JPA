package com.placementmanagement.service;

import com.placementmanagement.entities.Student;
import com.placementmanagement.entities.User;
import com.placementmanagement.repository.IUserRepository;
import com.placementmanagement.repository.IUserRepositoryImpl;

public class IUserServiceImpl implements IUserService{

	
	private IUserRepository  dao;			// reference variable

	public IUserServiceImpl() {
		dao = new IUserRepositoryImpl();		// creating object of IUserRepositoryImpl
	}

	
	
	public void addUser(User user) {
		// calling method of IUserRepositoryImpl
		dao.beginTransaction();
		dao.addUser(user);
		dao.commitTransaction();
		
	}

	public void updateUser(User user) {
		// calling method of IUserRepositoryImpl
		dao.beginTransaction();
		dao.updateUser(user);
		dao.commitTransaction();
		
	}
	public User login(User user) {
		// TODO Auto-generated method stub
		return null;
	}

	public boolean logOut() {
		// TODO Auto-generated method stub
		return false;
	}



	public void removeUser(User user) {
		// calling method of IUserRepositoryImpl
		dao.beginTransaction();
		dao.removeUser(user);
		dao.commitTransaction();
		
		
	}


	public User searchUserById(long id) {
		User user = dao.getUserById(id);
		return user;
	}
	

}
