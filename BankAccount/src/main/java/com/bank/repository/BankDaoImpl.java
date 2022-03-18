package com.bank.repository;


import javax.persistence.EntityManager;

import com.bank.entities.Bank;

public class BankDaoImpl implements BankDao {
	
	private EntityManager entitymanager;        // created reference 
	
	public BankDaoImpl() {
		entitymanager = Manager.getEntityManager();       // getting entitymanager from Manager class
	}
	

	public void addAccount(Bank bank) {       // method for adding data into database
		entitymanager.persist(bank);
		
	}

	public void addMoney(Bank bank) {       // method for updating account balance after addign money
		entitymanager.merge(bank);
		
	}

	public void withdrawMoney(Bank bank) {    // method for updating account balance after withdrawing money
		entitymanager.merge(bank);
	}

	public void beginTransaction() {            // method for begin transaction 
		entitymanager.getTransaction().begin();
		
	}
 
	public void commitTransaction() {              // method for commit transaction 
		entitymanager.getTransaction().commit();
	}


	public Bank searchBankIFSC(long ifsc) {
		Bank bank=entitymanager.find(Bank.class, ifsc);
		return bank;
	}

}
