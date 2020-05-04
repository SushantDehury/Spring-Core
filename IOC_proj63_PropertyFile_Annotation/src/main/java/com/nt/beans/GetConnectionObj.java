package com.nt.beans;

import java.sql.Connection;
import java.sql.SQLException;

import javax.inject.Named;
import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;

@Named
public class GetConnectionObj {
	@Autowired
	private DataSource ds;
	
	public String getConnectionObj() throws SQLException {
		Connection con=null;
		con=ds.getConnection();
		if(con==null)
			return "there is no Connection";
		else
			return "there is Connection a between them";
	}

}
