package com.placementmanagement.client;

import java.time.LocalDate;

import com.placementmanagement.entities.*;
import com.placementmanagement.service.*;

public class Client {

	public static void main(String[] args) {

		// creating object of all services
		StudentServiceImpl serviceStu = new StudentServiceImpl();
		IPlacementService servicePlacement = new IPlacementServiceImpl();
		IUserService serviceUser = new IUserServiceImpl();
		ICollegeService serviceClg = new ICollegeServiceImpl();
		ICertificateService serviceCerti = new ICertificateServiceImpl();
		IAdminService serviceAdmin = new IAdminServiceImpl();

		// creating objects of entities
		Student student = new Student();
		College college = new College();
		User user = new User();
		Certificate certificate = new Certificate();
		Placement placement = new Placement();
		Admin admin = new Admin();

		// setting admin
		admin.setId(911);
		admin.setName("admin");
		char[] password =new char[] {'A','d','m','i','n'};
		admin.setPassword(password);
		
		user=serviceUser.searchUserById(7);
		admin.setUser(user);
		serviceAdmin.addAdmin(admin);

		// setting user
		user.setId(7);
		user.setName("College");
		char[] userPassword = new char[] { 'U','s','e','r'};
		user.setPassword(userPassword);
		user.setType("type");

		// setting certificate before student and college

		certificate.setId(4665);
		certificate.setYear(2021);

		// setting student
		student.setId(5);
		student.setName("avinash");
		student.setRoll(1);
		student.setCourse("degree");
		student.setHallTicketNo(101);
		student.setQualification("Engineering");
		student.setYear(2021);
		student.setCertificate(certificate); // addin certificaet in student

		// setting college
		college.setId(33);
		college.setLocation("mumbai");
		college.setCollegeAdmin(user);
		college.setCollegeName("bharati vidyapeeth");

		student.setCollege(college); // setting college into student

		certificate.setCollege(college); // setting college into certificate
		certificate.setStudent(student); // setting student into certificate

//		// setting placement
		LocalDate date = LocalDate.now();
		placement.setCollege(college); // setting college into placement
		placement.setDate(date);
		placement.setId(11);
		placement.setName("jio");
		placement.setQualification("degree");
		placement.setYear(2022);

		// saving data into Database

		serviceUser.addUser(user);
		serviceStu.addStudent(student);
		servicePlacement.addPlacement(placement);
		serviceClg.addCollege(college);

		// CRUD OPERATION

		student = serviceStu.searchStudentById(1); // reading data from student table
		System.out.println(student.getName() + " " + student.getCollege());

		student.setCollege(college);
		student.setId(345);
		serviceStu.updateStudent(student); // updating student details

		serviceStu.removeStudent(student); // removing student from table

		college = serviceClg.searchCollege(33); // reading data from database
		college.setCollegeName("ac patil");
		college.setLocation("pune");
		serviceClg.updateCollege(college); // update college details

		college = serviceClg.searchCollege(33); // college search by id
		System.out.println(college.getCollegeName());
		serviceClg.deleteCollege(college); // delete college

		placement = servicePlacement.searchPlacement(11); // reading data from placement table
		System.out.println(placement.getName() + " " + placement.getYear());

		placement.setName("xyz pvt lmt");
		placement.setQualification("B.TECH");
		servicePlacement.updatePlacement(placement); // updating placement details

		servicePlacement.removePlacement(placement); // deleting data from placement table

		certificate = serviceCerti.searchCertificateId(4665); // searching certificate
		System.out.println(certificate.getStudent().getName());

		certificate.setId(23);
		certificate.setYear(2019);
		serviceCerti.updateCertificate(certificate); // updating cetificate

		
		
		// searching user by id		
		user=serviceUser.searchUserById(99);
		System.out.println(user.getName()+"   "+user.getPassword());    // password print in encrypted 
		
		user=serviceUser.searchUserById(7);        // user update
		user.setType("corporate");
		user.setName("sanik");
		serviceUser.updateUser(user);
		
		serviceUser.removeUser(user);         		// removing user
		
	
		
		 
		
		
		

		System.out.println("End of program/Life cycle completed...");
	}
}
