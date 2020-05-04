package com.nt.dao;

import org.springframework.jdbc.core.JdbcTemplate;

import com.nt.bo.EmployeeBO;

public class EmployeeDAOImpl implements EmployeeDAO {
	private static final String EMPLOYEE_HR="INSERT INTO EMPLOYEE_HR VALUES(?,?,?,?)";
	private static final String EMPLOYEE_FINANCE="INSERT INTO EMPLOYEE_FINANCE VALUES(?,?,?,?)";
	
	private JdbcTemplate jt;
	
	public EmployeeDAOImpl(JdbcTemplate jt) {
		this.jt = jt;
	}

	public int insertEmployee_HR(EmployeeBO bo) throws Exception{
		int id=bo.getEid();
		String name=bo.getEname();
		String desg=bo.getDesg();
		int sal=bo.getSal();
		int count=jt.update(EMPLOYEE_HR, id,name,desg,sal);
		return count;
	}

	public int insertEmployee_FINANCE(EmployeeBO bo) throws Exception{
		int id=bo.getEid();
		String name=bo.getEname();
		String desg=bo.getDesg();
		int sal=bo.getSal();
		int count=jt.update(EMPLOYEE_FINANCE, id,name,desg,sal);
		return count;
	}

}
