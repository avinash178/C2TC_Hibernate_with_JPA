package com.placementmanagement.service;

import com.placementmanagement.entities.Placement;

public interface IPlacementService {
	
	public abstract void addPlacement(Placement placement);  // C
	public abstract void updatePlacement(Placement placement); // U
	public Placement searchPlacement(long id); // R
	public boolean cancelPlacement(long id); // R
	

}
