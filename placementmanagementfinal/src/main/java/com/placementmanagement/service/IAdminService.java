package com.placementmanagement.service;

import com.placementmanagement.entities.Admin;

public interface IAdminService {
	public abstract void addAdmin(Admin admin);

	public abstract void updateAdmin(Admin admin);
	
	public abstract void removeAdmin(Admin admin);

	public Admin login(Admin admin);

	public boolean logOut();

}
