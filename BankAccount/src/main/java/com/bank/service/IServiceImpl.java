package com.bank.service;

import com.bank.entities.Bank;
import com.bank.repository.BankDao;
import com.bank.repository.BankDaoImpl;

public class IServiceImpl implements IService{

	private BankDao dao;     // reference of BankDao class
	
	public IServiceImpl() {          
		dao= new BankDaoImpl();               // object BankDaoImpl assigned to dao 
	}
	public void addBankAccount(Bank bank) {     // method user will access for adding bank details
		dao.beginTransaction();
		dao.addAccount(bank);
		dao.commitTransaction();
		
		
	}

	public void addmoney(Bank bank) {       // method user will access for adding money
		dao.beginTransaction();
		dao.addMoney(bank);
		dao.commitTransaction();
		
		
	}

	public void withdrawMoney(Bank bank) {       // method user will access for withdraw money
		dao.beginTransaction();
		dao.withdrawMoney(bank);
		dao.commitTransaction();
		
		
	}
	public Bank searchBankByIFSC(long ifsc) {
		Bank bank=dao.searchBankIFSC(ifsc);
		return bank;
	}
	

}
