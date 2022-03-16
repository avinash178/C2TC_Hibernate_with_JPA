package com.placementmanagement.service;

import com.placementmanagement.entities.Admin;
import com.placementmanagement.repository.IAdminRepository;
import com.placementmanagement.repository.IAdminRepositoryImpl;

public class IAdminServiceImpl implements IAdminService
{
	// reference variable of IAdminRepository 
	private IAdminRepository  dao;

	public IAdminServiceImpl()
	{ 
		dao = new IAdminRepositoryImpl();// creating object of IAdminRepositoryImpl
	} 
	
	

	public void addAdmin(Admin admin) {
		// calling  methods of IAdminRepositoryImpl  class
		dao.beginTransaction();
		dao.addAdmin(admin);
		dao.commitTransaction();
		
	}

	public void updateAdmin(Admin admin) {
		// calling  methods of IAdminRepositoryImpl  class
		dao.beginTransaction();
		dao.updateAdmin(admin);
		dao.commitTransaction();
		
	}

	public void removeAdmin(Admin admin) {
		// calling  methods of IAdminRepositoryImpl  class
		dao.beginTransaction();
		dao.removeAdmin(admin);
		dao.commitTransaction();
		
	}
	

	public Admin login(Admin admin) {
		// TODO Auto-generated method stub
		return null;
	}

	public boolean logOut() {
		// TODO Auto-generated method stub
		return false;
	}
	

}
