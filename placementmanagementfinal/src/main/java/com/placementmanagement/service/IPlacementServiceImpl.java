package com.placementmanagement.service;

import com.placementmanagement.entities.Placement;
import com.placementmanagement.repository.IPlacementRepository;
import com.placementmanagement.repository.IPlacementRepositoryImpl;

public class IPlacementServiceImpl  implements IPlacementService{

	private IPlacementRepository plce;

	public IPlacementServiceImpl() {
		plce = new IPlacementRepositoryImpl();
	}

	
	public void addPlacement(Placement placement) {
		
		plce.beginTransaction();
		plce.addPlacement(placement);
		plce.commitTransaction();
	}

	public void updatePlacement(Placement placement) {
		
		plce.beginTransaction();
		plce.updatePlacement(placement);
		plce.commitTransaction();
		
	}

	public Placement searchPlacement(long id) {
		//no need of transaction, as it's an read operation 
				 Placement placement = plce.searchPlacement( id);
				return placement;
	}

	public boolean cancelPlacement(long id) {
		
		return false;
	}


	public void removePlacement(Placement placement) {
		plce.beginTransaction();
		plce.removePlacement(placement);
		plce.commitTransaction();
		
	}
	

}
