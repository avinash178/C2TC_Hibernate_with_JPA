package com.placementmanagement.repository;


import javax.persistence.EntityManager;
import com.placementmanagement.entities.*;

public class IStudentDaoImpl implements IStudentDao {
	private EntityManager entityManager;

	public IStudentDaoImpl() {
		entityManager = JPAUtil.getEntityManager();
	}

	
	public Student getStudentById(long id) {
		Student student = entityManager.find(Student.class, id);
		return student;
	}
	
	public Student getByHallTicket(long hallTicketNo) {
		Student student= entityManager.find(Student.class, hallTicketNo);
		return student;
	}

	
	public void addStudent(Student student) {
		entityManager.persist(student);
	}

	
	public void removeStudent(Student student) {
		entityManager.remove(student);
	}

	
	public void updateStudent(Student student) {
		entityManager.merge(student);
	}

	
	public void beginTransaction() {
		entityManager.getTransaction().begin();
	}

	public void commitTransaction() {
		entityManager.getTransaction().commit();
	}
}
