package com.nt.dao;

import org.springframework.jdbc.core.JdbcTemplate;

public class BankDAOImpl implements BankDAO {
	private static final String UPDATE_ACC_BALANCE="UPDATE SPRING_ACOUNT SET BALANCE=? WHERE ACNO=?";
	private static final String GET_ACC_BALANCE = "SELECT BALANCE FROM SPRING_ACOUNT WHERE ACNO=?";
	
	private JdbcTemplate jt;

	public BankDAOImpl(JdbcTemplate jt) {
		this.jt = jt;
	}

	@Override
	public int updateBalance(int acno, float balance) {
		int count=jt.update(UPDATE_ACC_BALANCE, balance,acno);
		return count;
	}

	@Override
	public float getBalance(int acno) {
		float balance=jt.queryForObject(GET_ACC_BALANCE, Float.class, acno);
		return balance;
	}

}
