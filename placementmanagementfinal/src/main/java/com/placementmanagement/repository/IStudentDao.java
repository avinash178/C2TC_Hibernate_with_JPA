package com.placementmanagement.repository;

import com.placementmanagement.entities.Student;

public interface IStudentDao {
	public abstract Student getStudentById(long id);
	
	public abstract Student getByHallTicket(long hallTicketNo);
	
	public abstract void addStudent(Student student);

	public abstract void removeStudent(Student student);

	public abstract void updateStudent(Student student);

	public abstract void commitTransaction();

	public abstract void beginTransaction();
	
}
