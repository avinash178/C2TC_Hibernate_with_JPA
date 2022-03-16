package com.placementmanagement.repository;

import javax.persistence.EntityManager;

import com.placementmanagement.entities.College;
import com.placementmanagement.entities.Student;

public class ICollegeRepositoryImpl implements ICollegeRepository {

	private EntityManager entityManager;

	public ICollegeRepositoryImpl() {                    // constructor to create entityManger()
		entityManager = JPAUtil.getEntityManager();
	}

	
	
	public void addCollege(College college) {
		entityManager.persist(college);
		
	}

	public void updateCollege(College college) {
		entityManager.merge(college);
		
	}

	public College searchCollege(long id) {
		College college = entityManager.find(College.class, id);
		return college;
	}

	public void deleteCollege(College college) {
		entityManager.remove(college);
	}

	public void commitTransaction() {
		entityManager.getTransaction().commit();
		
	}

	public void beginTransaction() {
		entityManager.getTransaction().begin();;
		
	}

}
