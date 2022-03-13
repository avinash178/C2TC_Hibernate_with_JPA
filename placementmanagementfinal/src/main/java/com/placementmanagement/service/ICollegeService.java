package com.placementmanagement.service;

import com.placementmanagement.entities.College;
import com.placementmanagement.entities.Placement;

public interface ICollegeService {
	public abstract void addCollege(College college);

	public abstract void updateCollege(College college);

	public abstract void searchCollege(College college);

	public boolean deleteCollege(long id);

	public boolean schedulePlacement(Placement placement);
	
}