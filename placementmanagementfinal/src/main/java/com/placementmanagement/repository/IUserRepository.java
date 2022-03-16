package com.placementmanagement.repository;

import com.placementmanagement.entities.Student;
import com.placementmanagement.entities.User;

public interface IUserRepository {

	public abstract User getUserById(long id);

	public abstract void addUser(User user);

	public abstract void updateUser(User user);

	public abstract void removeUser(User user);

	public abstract void commitTransaction();

	public abstract void beginTransaction();

}
