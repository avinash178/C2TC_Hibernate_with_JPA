package com.placementmanagement.client;

import com.placementmanagement.entities.*;
import com.placementmanagement.service.*;


public class Client {

	public static void main(String[] args) {
		StudentService service = new StudentServiceImpl();
		Student student = new Student();
		
		/*
		student.setId(234);
		student.setName("giresh");
		student.setRoll(3);
		student.setHallTicketNo(535345);
		student.setCourse("chemistry");
		student.setQualification("degree");
		student.setYear(2349);
		
		service.addStudent(student);
		
		
		*/
//		student.setHallTicketNo(38);
//		student.setName("aashey");
//		student.setName("mohit");
//		student.setHallTicketNo(37568);
//		student.setId(8);
//		service.addStudent(student);
		
		// searching name with student id 
		//System.out.println(service.searchStudentById(234).getName());
		
		// remove student from table
		//service.removeStudent(student);
		
		// this operation is not performing 
		
		//System.out.println(service.searchByHallTicket(535345));
		
		System.out.println("End of program/Life cycle completed...");
	}
}
