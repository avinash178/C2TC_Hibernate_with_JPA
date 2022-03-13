package com.placementmanagement.repository;


import javax.persistence.EntityManager;
import com.placementmanagement.entities.*;

public class IPlacementRepositoryImpl implements IPlacementRepository {

	
	private EntityManager entityManager;

	public IPlacementRepositoryImpl() {
		entityManager = JPAUtil.getEntityManager();
	}
	
	
	public void addPlacement(Placement placement) {
		entityManager.persist(placement);
		
	}

	public void updatePlacement(Placement placement) {
		entityManager.merge(placement);
		
	}

	public Placement searchPlacement(long id) {
		Placement placement= entityManager.find(Placement.class, id);
		return placement;
	}
	public void beginTransaction() {
		entityManager.getTransaction().begin();
	}

	public void commitTransaction() {
		entityManager.getTransaction().commit();
	}
	

}
