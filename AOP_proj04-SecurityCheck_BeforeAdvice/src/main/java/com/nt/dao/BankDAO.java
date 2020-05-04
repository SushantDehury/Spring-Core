package com.nt.dao;

public interface BankDAO {
	public int updateBalance(int acno,float balance);
	public float getBalance(int acno);

}
