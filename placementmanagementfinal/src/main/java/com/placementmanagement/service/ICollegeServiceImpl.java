package com.placementmanagement.service;

import com.placementmanagement.entities.College;
import com.placementmanagement.entities.Placement;
import com.placementmanagement.repository.ICollegeRepository;
import com.placementmanagement.repository.ICollegeRepositoryImpl;

public class ICollegeServiceImpl implements ICollegeService {

	private ICollegeRepository col;

	public ICollegeServiceImpl() {
		col = new ICollegeRepositoryImpl();
	}

	
	public void addCollege(College college) {
		col.beginTransaction();
		col.addCollege(college);
		col.commitTransaction();
		
	}

	public void updateCollege(College college) {
		col.beginTransaction();
		col.updateCollege(college);
		col.commitTransaction();
		
	}

	public void searchCollege(College college) {
		// TODO Auto-generated method stub
		
	}

	public boolean deleteCollege(long id) {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean schedulePlacement(Placement placement) {
		// TODO Auto-generated method stub
		return false;
	}

	
}
