package com.placementmanagement.service;

import com.placementmanagement.entities.Certificate;
import com.placementmanagement.entities.Student;
import com.placementmanagement.repository.*;
import com.placementmanagement.repository.IStudentDaoImpl;

public class ICertificateServiceImpl implements ICertificateService
{
	// reference variable 
	private ICertificateRepository dao;

	public ICertificateServiceImpl() {
		
		dao = new ICertificateRepositoryImpl();    // object of ICertififcateRepositoryImpl
	}

	public void updateCertificate(Certificate certificate) {
		// calling methods of ICertificateRepositoryImpl
		dao.beginTransaction();
		dao.updateCertificate(certificate);
		dao.commitTransaction();
		
	}

	public void addCertificate(Certificate certificate) {
		// calling methods of ICertificateRepositoryImpl

		dao.beginTransaction();
		dao.addCertificate(certificate);
		dao.commitTransaction();
		
	}

	public void removeCertificate(Certificate certificate) {
		// calling methods of ICertificateRepositoryImpl

		dao.beginTransaction();
		dao.removeCertificate(certificate);
		dao.commitTransaction();
		
	}

	public Certificate searchCertificateId(long id) {
		// calling methods of ICertificateRepositoryImpl

		Certificate certificate = dao.getCertificateById(id);
		return certificate;
	}
	
	

}
