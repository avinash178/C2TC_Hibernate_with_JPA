package com.placementmanagement.repository;

import com.placementmanagement.entities.Placement;

public interface IPlacementRepository {
	public abstract void addPlacement(Placement placement);

	public abstract void updatePlacement(Placement placement);

	public Placement searchPlacement(long id);
	
	public abstract void commitTransaction();

	public abstract void beginTransaction();


}
