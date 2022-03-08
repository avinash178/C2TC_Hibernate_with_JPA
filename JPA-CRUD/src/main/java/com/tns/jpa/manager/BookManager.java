package com.tns.jpa.manager;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.tns.jpa.jpacrud.Books;

public class BookManager {
	static EntityManagerFactory factory;
	static EntityManager entitymanger;

	public static void main(String[] args) {

		begin();   // create method for simplicity

		// CRUD OPERATION HERE

		//create();
		update();
		
		

		end();

	}

	private static void update() {
		Books change=new Books();
		change.setBookid(1);
		change.setTitle("alchemist");
		change.setAuthor("paolo");
		change.setPrice(340);
		entitymanger.merge(change);
	}

	private static void create() {
		Books b1 = new Books();
		
		b1.setTitle("rich dad poor dad");
		b1.setAuthor("robert kiosaki");
		b1.setPrice(250);

		entitymanger.persist(b1);
	}

	private static void end() {
		entitymanger.getTransaction().commit();
		entitymanger.close();
		factory.close();
	}

	private static void begin() {
		factory = Persistence.createEntityManagerFactory("jpa");

		entitymanger = factory.createEntityManager();

		entitymanger.getTransaction().begin();
	}

	

}
