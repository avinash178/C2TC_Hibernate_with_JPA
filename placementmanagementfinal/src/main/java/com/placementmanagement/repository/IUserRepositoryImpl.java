package com.placementmanagement.repository;

import javax.persistence.EntityManager;

import com.placementmanagement.entities.Student;
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

	public void removeUser(User user) {
		entityManager.remove(user);
	}
	public void beginTransaction() {
		entityManager.getTransaction().begin();
	}

	public void commitTransaction() {
		entityManager.getTransaction().commit();
	}

	public User getUserById(long id) {
		User user = entityManager.find(User.class, id);
		return user;
	}
	

}
