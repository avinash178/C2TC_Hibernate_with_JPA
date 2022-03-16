package com.placementmanagement.repository;

import com.placementmanagement.entities.College;

public interface ICollegeRepository {

	public abstract void addCollege(College college);

	public abstract void updateCollege(College college);

	public abstract College searchCollege(long id);

	public abstract void deleteCollege(College college);
	
	public abstract void commitTransaction();

	public abstract void beginTransaction();

}
