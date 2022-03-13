package com.placementmanagement.repository;

import com.placementmanagement.entities.College;

public interface ICollegeRepository {

	public abstract void addCollege(College college);

	public abstract void updateCollege(College college);

	public College searchCollege(College college);

	public boolean deleteCollege(long id);
	
	public abstract void commitTransaction();

	public abstract void beginTransaction();

}
