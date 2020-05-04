package com.nt.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.sql.DataSource;

import com.nt.bo.EmployeeBO;

public class EmployeeDAOImpl implements EmployeeDAO {
	private static final String EMPLOYEE_DI = "INSERT INTO EMPLOYEE_DI(ENO,ENAME,SALARY,NETSALARY,GROSSSALARY) VALUES(Employee_idaa.nextval,?,?,?,?)";
	private DataSource ds;

	public void setDs(DataSource ds) {
		this.ds = ds;
	}

	@Override
	public int insert(EmployeeBO bo) throws Exception {
		Connection con = null;
		PreparedStatement ps = null;
		int result = 0;
		// Access the Connection obj in connection obj
		con = ds.getConnection();
		// Create PreparedStatement obj
		ps = con.prepareStatement(EMPLOYEE_DI);
		// set query pqram
//		ps.setInt(1, bo.getEno());
		ps.setString(1, bo.getEname());
		ps.setFloat(2, bo.getSalary());
		ps.setFloat(3, bo.getNetSalary());
		ps.setFloat(4, bo.getGrossSalary());
		// prosses the result
		result = ps.executeUpdate();
		// close the connection
		ps.close();
		con.close();

		return result;
	}

}
