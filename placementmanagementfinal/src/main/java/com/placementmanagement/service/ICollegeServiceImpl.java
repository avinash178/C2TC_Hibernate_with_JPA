package com.placementmanagement.service;

import com.placementmanagement.entities.College;
import com.placementmanagement.entities.Placement;
import com.placementmanagement.entities.Student;
import com.placementmanagement.repository.ICollegeRepository;
import com.placementmanagement.repository.ICollegeRepositoryImpl;

public class ICollegeServiceImpl implements ICollegeService {

	private ICollegeRepository dao;				// reference variable

	public ICollegeServiceImpl() {
		dao = new ICollegeRepositoryImpl();			// object of ICollegeRepositoryImpl
	}

	
	public void addCollege(College college) {
		// calling method of ICollegeRepositoryImpl class
		dao.beginTransaction();
		dao.addCollege(college);
		dao.commitTransaction();
		
	}

	public void updateCollege(College college) {
		dao.beginTransaction();
		dao.updateCollege(college);
		dao.commitTransaction();
		
	}

	public College  searchCollege(long id) {
		College college = dao.searchCollege(id);
		return college;
	}

	public void deleteCollege(College college) {
		dao.beginTransaction();
		dao.deleteCollege(college);
		dao.commitTransaction();
	}

	public boolean schedulePlacement(Placement placement) {
		// TODO Auto-generated method stub
		return false;
	}

	
}
