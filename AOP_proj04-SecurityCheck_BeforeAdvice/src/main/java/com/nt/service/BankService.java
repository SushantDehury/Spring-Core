package com.nt.service;

import com.nt.dao.BankDAO;

public class BankService {
	private BankDAO dao;

	public BankService(BankDAO dao) {
		this.dao = dao;
	}

	public boolean withdraw(int acno, float balance) throws Exception{
		float money = 0;
		int result = 0;
		money = dao.getBalance(acno);
		money = money - balance;
		result = dao.updateBalance(acno, money);
		if (result == 0)
			return false;
		return true;
	}
	
	public boolean deposit(int acno, float balance) throws Exception{
		float money = 0.0f;
		int result = 0;
		money = dao.getBalance(acno);
		money = money + balance;
		result = dao.updateBalance(acno, money);
		if (result == 0)
			return false;
		return true;
	}
}
