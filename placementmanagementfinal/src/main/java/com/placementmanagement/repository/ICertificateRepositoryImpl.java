package com.placementmanagement.repository;

import javax.persistence.EntityManager;

import com.placementmanagement.entities.Certificate;
import com.placementmanagement.entities.Student;

public class ICertificateRepositoryImpl implements ICertificateRepository {

	private EntityManager entityManager;

	public ICertificateRepositoryImpl() {
		entityManager = JPAUtil.getEntityManager();
	}

	public void addCertificate(Certificate certificate) {
		entityManager.persist(certificate);
	}

	public void updateCertificate(Certificate certificate) {
		entityManager.merge(certificate);
	}

	public Certificate getCertificateById(long id) {
		Certificate certificate = entityManager.find(Certificate.class, id);
		return certificate;
	}

	public void removeCertificate(Certificate certificate) {
		entityManager.remove(certificate);
	}

	public void commitTransaction() {
		entityManager.getTransaction().commit();

	}

	public void beginTransaction() {
		entityManager.getTransaction().begin();

	}

}
