package com.bank.entities;

import javax.persistence.Entity;
import javax.persistence.Id;
 

@Entity                // creating table name Bank in database
public class Bank {
	@Id                                  // creating ifsc as primary key in Bank table 
	private long ifsc;
	private String bankName;
	private long accountNumber;
	private double balance;
	
	private char[] password;              // password in char[] for security reason 
	

	// getter and setter
	
	public long getIfsc() {
		return ifsc;
	}

	public void setIfsc(long ifsc) {
		this.ifsc = ifsc;
	}

	public String getBankName() {
		return bankName;
	}

	public void setBankName(String bankName) {
		this.bankName = bankName;
	}

	public long getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(long accountNumber) {
		this.accountNumber = accountNumber;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public void addMoney(double money) {
		this.balance = this.balance + money;
	}

	public void withdrawMoney(double money) {
		
		// if withdrawal amount is less than balance it will return insufficient balance
		if(balance>=money) {
		this.balance = this.balance - money;
		}
		else {
			System.out.println("insufficient balance");
		}
	}

	public char[] getPassword() {
		return password;
	}

	public void setPassword(char[] password) {
		this.password = password;
	}
	

}
