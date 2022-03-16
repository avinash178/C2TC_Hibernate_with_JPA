package com.placementmanagement.service;

import com.placementmanagement.entities.Student;
import com.placementmanagement.repository.IStudentDao;
import com.placementmanagement.repository.IStudentDaoImpl;

public class StudentServiceImpl implements StudentService{
	// creating reference of IStudentDao class
	private IStudentDao dao;              

//	initialing variable through constructor
	public StudentServiceImpl() {
		dao = new IStudentDaoImpl();        // creating object of IStudentDaoImpl
	}

	
	public void addStudent(Student student) // method to add student data
	{
		// calling method of IStudentDaoImpl class 
		dao.beginTransaction();                
		dao.addStudent(student);              
		dao.commitTransaction();
	}

	
	public void updateStudent(Student student)// method to update student data
	{
		// calling method of IStudentDaoImpl class
		dao.beginTransaction();
		dao.updateStudent(student);
		dao.commitTransaction();
	}

	
	
	public void removeStudent(Student student)
	{
		// calling method of IStudentDaoImpl class
		dao.beginTransaction();
		dao.removeStudent(student);
		dao.commitTransaction();
	}

	
	public Student searchStudentById(long id) {
//no need of transaction, as it's an read operation 
		Student student = dao.getStudentById(id);          // calling method of IStudentDaoImpl class
		return student;
	}
	
	
	public Student searchByHallTicket(long hallTicketNo) {
		//no need of transaction, as it's an read operation 
				Student student= dao.getByHallTicket(hallTicketNo);  // calling method of IStudentDaoImpl class
				return student;
			}
	

}
