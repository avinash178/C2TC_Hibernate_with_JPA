package com.placementmanagement.repository;

import javax.persistence.EntityManager;

import com.placementmanagement.entities.Admin;

public class IAdminRepositoryImpl implements IAdminRepository {

	private EntityManager entityManager;

	public IAdminRepositoryImpl() {                           // constructor to create entityManger()
		entityManager = JPAUtil.getEntityManager();
	}

	
	public void addAdmin(Admin admin) {
		entityManager.persist(admin);
		
	}

	public void updateAdmin(Admin admin) {
		entityManager.merge(admin);
		
	}

	public void removeAdmin(Admin admin) {
		entityManager.remove(admin);
	}

	public void commitTransaction() {
		entityManager.getTransaction().commit();
		
		
	}

	public void beginTransaction() {
		entityManager.getTransaction().begin();
		
	}

}
