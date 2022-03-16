package com.placementmanagement.service;

import com.placementmanagement.entities.Admin;
import com.placementmanagement.repository.IAdminRepository;
import com.placementmanagement.repository.IAdminRepositoryImpl;

public class IAdminServiceImpl implements IAdminService
{
	private IAdminRepository  ad;

	public IAdminServiceImpl() {
		ad = new IAdminRepositoryImpl();
	}
	
	

	public void addAdmin(Admin admin) {
		ad.beginTransaction();
		ad.addAdmin(admin);
		ad.commitTransaction();
		
	}

	public void updateAdmin(Admin admin) {
		ad.beginTransaction();
		ad.updateAdmin(admin);
		ad.commitTransaction();
		
	}

	public void removeAdmin(Admin admin) {
		ad.beginTransaction();
		ad.removeAdmin(admin);
		ad.commitTransaction();
		
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
