package com.placementmanagement.service;

//import com.cg.placementmanagement.entities.Certificate;
import com.placementmanagement.entities.Student;

public interface StudentService {
	
	public abstract void addStudent(Student student);
	
	public abstract void updateStudent(Student student);
	
	public Student searchStudentById(long id);  // R

	public Student searchByHallTicket(long hallTicketNo); // R

	public abstract void removeStudent(Student student);
	
	//public Certificate addCertificate(Certificate certificate); // C
	//public Certificate updateCertificate(Certificate certificate); // U
	//public boolean deleteStudent(long id); // D
	

}
