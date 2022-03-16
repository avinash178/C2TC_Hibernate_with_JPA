package com.placementmanagement.service;

import com.placementmanagement.entities.College;
import com.placementmanagement.entities.Placement;

public interface ICollegeService {
	public abstract void addCollege(College college);

	public abstract void updateCollege(College college);

	public  College searchCollege(long id);

	public abstract void  deleteCollege(College college);

	public boolean schedulePlacement(Placement placement);
	
}