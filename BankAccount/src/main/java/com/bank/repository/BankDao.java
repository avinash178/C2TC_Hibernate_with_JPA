package com.bank.repository;

import com.bank.entities.Bank;

public interface BankDao {
	public Bank searchBankIFSC( long ifsc);

	public abstract void addAccount(Bank bank);

	public abstract void addMoney(Bank bank);

	public abstract void withdrawMoney(Bank bank);

	public void beginTransaction();

	public void commitTransaction();

}
