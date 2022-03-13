package com.placementmanagement.repository;

import javax.persistence.EntityManager;

import com.placementmanagement.entities.College;
import com.placementmanagement.entities.Student;

public class ICollegeRepositoryImpl implements ICollegeRepository {

	private EntityManager entityManager;

	public ICollegeRepositoryImpl() {
		entityManager = JPAUtil.getEntityManager();
	}

	
	
	public void addCollege(College college) {
		entityManager.persist(college);
		
	}

	public void updateCollege(College college) {
		entityManager.merge(college);
		
	}

	public College searchCollege(College college) {
		College clg = entityManager.find(College.class, college);
		return clg;
	}

	public boolean deleteCollege(long id) {
		// TODO Auto-generated method stub
		return false;
	}

	public void commitTransaction() {
		entityManager.getTransaction().commit();
		
	}

	public void beginTransaction() {
		entityManager.getTransaction().begin();;
		
	}

}
