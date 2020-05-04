package com.nt.dao;

import org.springframework.jdbc.core.JdbcTemplate;

import com.nt.bo.Userlist;

public class AuthDAOImpl implements AuthDAO {
	private static final String AUTH_USER = "SELECT COUNT(*) FROM USERLIST WHERE USERNAME=? AND PASSWORD=?";

	private JdbcTemplate jt;

	public AuthDAOImpl(JdbcTemplate jt) {
		this.jt = jt;
	}

	@Override
	public int checkUser(Userlist userlist) {
		int count = 0;
		count = jt.queryForObject(AUTH_USER, Integer.class, userlist.getUsername(), userlist.getPassword());
		return count;
	}

}
