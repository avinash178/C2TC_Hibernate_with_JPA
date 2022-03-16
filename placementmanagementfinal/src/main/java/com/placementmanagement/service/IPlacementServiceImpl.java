package com.placementmanagement.service;

import com.placementmanagement.entities.Placement;
import com.placementmanagement.repository.IPlacementRepository;
import com.placementmanagement.repository.IPlacementRepositoryImpl;

public class IPlacementServiceImpl implements IPlacementService {

	private IPlacementRepository dao;			 // reference variable

	public IPlacementServiceImpl() {
		dao = new IPlacementRepositoryImpl();		// creating object of  IPlacementRepositoryImpl
	}

	public void addPlacement(Placement placement) {
			// calling method of IPlacementRepositoryImpl
		dao.beginTransaction();
		dao.addPlacement(placement);
		dao.commitTransaction();
	}

	public void updatePlacement(Placement placement) {
		// calling method of IPlacementRepositoryImpl
		dao.beginTransaction();
		dao.updatePlacement(placement);
		dao.commitTransaction();

	}

	public Placement searchPlacement(long id) {
		// calling method of IPlacementRepositoryImpl
		// no need of transaction, as it's an read operation
		Placement placement = dao.searchPlacement(id);
		return placement;
	}

	public boolean cancelPlacement(long id) {

		return false;
	}

	public void removePlacement(Placement placement) {
		// calling method of IPlacementRepositoryImpl
		dao.beginTransaction();
		dao.removePlacement(placement);
		dao.commitTransaction();

	}

}
