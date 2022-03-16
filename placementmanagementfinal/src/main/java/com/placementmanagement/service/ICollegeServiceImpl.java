package com.placementmanagement.service;

import com.placementmanagement.entities.College;
import com.placementmanagement.entities.Placement;
import com.placementmanagement.entities.Student;
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

	public College  searchCollege(long id) {
		College college = col.searchCollege(id);
		return college;
	}

	public void deleteCollege(College college) {
		col.beginTransaction();
		col.deleteCollege(college);
		col.commitTransaction();
	}

	public boolean schedulePlacement(Placement placement) {
		// TODO Auto-generated method stub
		return false;
	}

	
}
