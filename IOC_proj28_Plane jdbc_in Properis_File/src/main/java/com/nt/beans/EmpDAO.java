package com.nt.beans;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.sql.DataSource;

public class EmpDAO {
	private DataSource ds;

	public void setDs(DataSource ds) {
		this.ds = ds;
	}

	public int Insert(String emp) throws Exception {
		Connection con = null;
		Statement st=null;
		ResultSet rs=null;
		int count=
		con = ds.g
		etConnection();
		st=con.createStatement();
		rs=st.executeQuery("SELECT * FROM "+emp);

		if(rs.next()) {
			count=rs.getInt(1)
			
		}
	}

}
