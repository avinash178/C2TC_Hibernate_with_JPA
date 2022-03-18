package com.bank.client;

import com.bank.service.*;
import com.bank.entities.*;
public class AccountUser {
	public static void main(String[] args) {
		
		
		IService service= new IServiceImpl();      // created object of IServiceImpl class
		Bank bank=new Bank();
		
		
		
		// setting bank details
		bank.setIfsc(6459);
		bank.setBankName("BankOfMaharashtra");
		bank.setAccountNumber(123456789);
		bank.setBalance(1000);
		
		
		// adding data into database using service package
		service.addBankAccount(bank);
		
		
		bank=service.searchBankByIFSC(6459);// first searching bank and giving object of that to bank reference
		bank.addMoney(1000);    // adding money through bankclass method
		service.addmoney(bank); // updating bank balance of bank 
		
		
		bank=service.searchBankByIFSC(6459); // first searching bank and giving object of that to bank reference  
		bank.withdrawMoney(500);      // withdrawing money
		service.withdrawMoney(bank);    // updating bank balance
		
		
		
		
		
		System.out.println("End Of Transaction ");
		
	}

}
