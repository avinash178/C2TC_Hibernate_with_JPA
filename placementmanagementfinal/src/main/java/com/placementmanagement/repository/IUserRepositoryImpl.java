package com.placementmanagement.repository;

import javax.persistence.EntityManager;

import com.placementmanagement.entities.User;

public class IUserRepositoryImpl implements IUserRepository {

	
	
	private EntityManager entityManager;

	public IUserRepositoryImpl() {
		entityManager = JPAUtil.getEntityManager();
	}

	
	
	
	public void addUser(User user) {
		entityManager.persist(user);
	}

	public void updateUser(User user) {
		entityManager.merge(user);
	}

	public User deleteUser(long id) {
		// TODO Auto-generated method stub
		return null;
	}
	public void beginTransaction() {
		entityManager.getTransaction().begin();
	}

	public void commitTransaction() {
		entityManager.getTransaction().commit();
	}
	

}
