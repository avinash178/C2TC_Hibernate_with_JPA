package com.placementmanagement.repository;

import com.placementmanagement.entities.Certificate;

public interface ICertificateRepository {

	public abstract void addCertificate(Certificate certificate);

	public abstract void updateCertificate(Certificate certificate);

	public Certificate getCertificateById(long id);

	public abstract void removeCertificate(Certificate certificate);
	
	public abstract void commitTransaction();

	public abstract void beginTransaction();

}
