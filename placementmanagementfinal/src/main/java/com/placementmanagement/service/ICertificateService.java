package com.placementmanagement.service;

import com.placementmanagement.entities.Certificate;
import com.placementmanagement.entities.Student;

public interface ICertificateService {

	public abstract void updateCertificate(Certificate certificate); // U

	public abstract void addCertificate(Certificate certificate); // C

	public abstract void removeCertificate(Certificate certificate);
	
	public Certificate searchCertificateId(long id); 
}
