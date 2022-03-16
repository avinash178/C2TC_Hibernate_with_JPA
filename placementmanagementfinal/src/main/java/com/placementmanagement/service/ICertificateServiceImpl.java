package com.placementmanagement.service;

import com.placementmanagement.entities.Certificate;
import com.placementmanagement.entities.Student;
import com.placementmanagement.repository.*;
import com.placementmanagement.repository.IStudentDaoImpl;

public class ICertificateServiceImpl implements ICertificateService
{
	private ICertificateRepository cer;

	public ICertificateServiceImpl() {
		cer = new ICertificateRepositoryImpl();
	}

	public void updateCertificate(Certificate certificate) {
		cer.beginTransaction();
		cer.updateCertificate(certificate);
		cer.commitTransaction();
		
	}

	public void addCertificate(Certificate certificate) {
		cer.beginTransaction();
		cer.addCertificate(certificate);
		cer.commitTransaction();
		
	}

	public void removeCertificate(Certificate certificate) {
		cer.beginTransaction();
		cer.removeCertificate(certificate);
		cer.commitTransaction();
		
	}

	public Certificate searchCertificateId(long id) {
		Certificate certificate = cer.getCertificateById(id);
		return certificate;
	}
	
	

}
