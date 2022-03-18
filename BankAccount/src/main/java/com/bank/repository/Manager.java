package com.bank.repository;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Manager {
	private static EntityManager entitymanager;
	private static EntityManagerFactory factory;
	
	static {
		factory=Persistence.createEntityManagerFactory("JPA-PU");
	}

	public static EntityManager getEntityManager() {
		if(entitymanager== null || !entitymanager.isOpen()) {
			entitymanager=factory.createEntityManager();
		}
		return entitymanager;
	}
}
