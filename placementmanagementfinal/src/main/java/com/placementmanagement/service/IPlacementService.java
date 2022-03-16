package com.placementmanagement.service;

import com.placementmanagement.entities.Placement;
import com.placementmanagement.entities.Student;

public interface IPlacementService {

	public abstract void addPlacement(Placement placement); // C

	public abstract void updatePlacement(Placement placement); // U
	
	public abstract void removePlacement(Placement placement);

	public Placement searchPlacement(long id); // R

	public boolean cancelPlacement(long id); // R

}
