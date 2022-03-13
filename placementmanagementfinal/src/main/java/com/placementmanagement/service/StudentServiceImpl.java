package com.placementmanagement.service;

import com.placementmanagement.entities.Student;
import com.placementmanagement.repository.IStudentDao;
import com.placementmanagement.repository.IStudentDaoImpl;

public class StudentServiceImpl implements StudentService{
	private IStudentDao dao;

	public StudentServiceImpl() {
		dao = new IStudentDaoImpl();
	}

	
	public void addStudent(Student student) {
		dao.beginTransaction();
		dao.addStudent(student);
		dao.commitTransaction();
	}

	
	public void updateStudent(Student student) {
		dao.beginTransaction();
		dao.updateStudent(student);
		dao.commitTransaction();
	}

	
	
	public void removeStudent(Student student) {
		dao.beginTransaction();
		dao.removeStudent(student);
		dao.commitTransaction();
	}

	
	public Student searchStudentById(long id) {
//no need of transaction, as it's an read operation 
		Student student = dao.getStudentById(id);
		return student;
	}
	
	
	public Student searchByHallTicket(long hallTicketNo) {
		//no need of transaction, as it's an read operation 
				Student student= dao.getByHallTicket(hallTicketNo);
				return student;
			}
	

}
