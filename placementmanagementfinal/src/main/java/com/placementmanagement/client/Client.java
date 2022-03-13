package com.placementmanagement.client;

import java.time.LocalDate;

import com.placementmanagement.entities.*;
import com.placementmanagement.service.*;


public class Client {

	public static void main(String[] args) {
		StudentServiceImpl service = new StudentServiceImpl();
		IPlacementService servicePlacement=new IPlacementServiceImpl();
		IUserService serviceUser=new IUserServiceImpl(); 
		ICollegeService serviceClg =new ICollegeServiceImpl();
		Student student = new Student();
		
		College college=new College();
		User user =new User();
		Certificate certificate=new Certificate();
		Placement placement =new Placement();
		Admin admin=new Admin();
		
		
		// setting admin
//		admin.setId(911);
//		admin.setName("admin");
//		admin.setPassword("Admin@1234");
		
		
		//setting user
//		user.setId(91);
//		user.setName("user");
//		user.setPassword("password");
//		user.setType("type");
		//admin.setUser(user); // setting user into admin
		
		
		// setting certificate before student and college
		
		certificate.setId(466586);
		certificate.setYear(2021);
		
		
		// setting student
		student.setId(4);
		student.setName("rahul");
		student.setRoll(1);
		student.setCourse("degree");
		student.setHallTicketNo(101);
		student.setQualification("Engineering");
		student.setYear(2021);
		student.setCertificate(certificate);  // addin certificaet in student
		
		
		// setting college
		college.setId(26);
		college.setLocation("mumbai");
		//college.setCollegeAdmin(user);
		college.setCollegeName("bharati vidyapeeth");
		
		
		
		
		student.setCollege(college);           // setting college into student
		
	
		certificate.setCollege(college);       // setting college into certificate
		certificate.setStudent(student);       // setting student into certificate
//		// setting placement
		LocalDate date = LocalDate.now();  //date = LocalDate.now(); 
		placement.setCollege(college);       // setting college into placement
		placement.setDate(date);
		placement.setId(1001);
		placement.setName("jio");
		placement.setQualification("degree");
		placement.setYear(2022);
	
		
		
		
		
	
		
		service.addStudent(student); 
		servicePlacement.addPlacement(placement);
		serviceClg.addCollege(college);
	//	serviceUser.addUser(user);
		
		
	
		
		
		
		
	
		
//		student.setHallTicketNo(38);
//		student.setName("aashey");
//		student.setName("mohit");
//		student.setHallTicketNo(37568);
//		student.setId(8);
//		service.addStudent(student);
		
		// searching name with student id 
		//System.out.println(service.searchStudentById(234).getName());
		
		//System.out.println(service.searchStudentById(234).getQualification());
		
		
		
//		student = service.searchStudentById(234);                  
//		student.setName("aashey shribhate");
//		service.updateStudent(student);                    // update 
		
		
		
		
//		student=service.searchStudentById(234);
//		student.setHallTicketNo(123654);
//		service.updateStudent(student);
		
		
		
		//service.searchStudentById(234);
		//service.removeStudent(student);
		
		
		
		
		
		
		System.out.println("End of program/Life cycle completed...");
	}
}
