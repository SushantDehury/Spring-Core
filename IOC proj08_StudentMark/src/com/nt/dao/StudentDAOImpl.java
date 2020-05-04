package com.nt.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;

import javax.sql.DataSource;

import com.nt.bo.StudentBO;

public class StudentDAOImpl implements StudentDAO {
	private DataSource ds;
	private static final String STUDENTMARK = "INSERT INTO STUDENTMARK VALUES(?,?,?,?,?,?)";

	public void setDs(DataSource ds) {
		this.ds = ds;
	}

	@Override
	public int insert(StudentBO bo) throws Exception {
		Connection con = null;
		PreparedStatement ps = null;
		int result = 0;
		// get connection to connection pool
		con = ds.getConnection();
		// Create preparedStatement obj
		ps = con.prepareStatement(STUDENTMARK);
		// set into query param
		ps.setString(1, bo.getSname());
		ps.setInt(2, bo.getMark1());
		ps.setInt(3, bo.getMark2());
		ps.setInt(4, bo.getMark3());
		ps.setFloat(5, bo.getAvg());
		ps.setFloat(6, bo.getTotal());
		result = ps.executeUpdate();
		// close the connection
		ps.close();
		con.close();

		return result;
	}

}
