package com.placementmanagement.repository;

import com.placementmanagement.entities.Admin;

public interface IAdminRepository {

	public abstract void addAdmin(Admin admin);

	public abstract void updateAdmin(Admin admin);

	public abstract void removeAdmin(Admin admin);
	
	public abstract void commitTransaction();

	public abstract void beginTransaction();
}
