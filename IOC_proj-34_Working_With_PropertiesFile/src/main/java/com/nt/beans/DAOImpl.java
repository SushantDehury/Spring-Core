package com.nt.beans;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.sql.DataSource;

public class DAOImpl {
	private DataSource ds;
	private static final String query = "SELECT empno,ename,job,mgr FROM EMP";

	public void setDs(DataSource ds) {
		this.ds = ds;
	}

	public void RetriveEmp() throws Exception {
		Connection con = null;
		Statement st = null;
		ResultSet rs = null;
		con = ds.getConnection();
		st = con.createStatement();
		rs = st.executeQuery(query);
		while (rs.next()) {
			System.out.println(
					rs.getInt(1) + "    " + rs.getString(2) + "    " + rs.getString(3) + "    " + rs.getString(4));

		}

	}

}
