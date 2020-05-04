package com.nt.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.nt.bo.EmployeeBO;

@Repository
public class EmployeeDAOImpl implements EmployeeDAO {
	private static final String EMPLOYEE_HR="INSERT INTO EMPLOYEE_HR VALUES(?,?,?,?)";
	private static final String EMPLOYEE_FINANCE="INSERT INTO EMPLOYEE_FINANCE VALUES(?,?,?,?)";
	
	@Autowired
	private JdbcTemplate jt;
	
	public int insertEmployee_HR(EmployeeBO bo) throws Exception{
		int id=bo.getEid();
		String name=bo.getEname();
		String desg=bo.getDesg();
		int sal=bo.getSal();
		int count=jt.update(EMPLOYEE_HR, id,name,desg,sal);
		return 0;
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
