package com.nt.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.sql.DataSource;

import com.nt.bo.EmployeeBO;
import com.nt.bo.StudentBO;

public class CollegeDAOImpl implements CollegeDAO {

	private static final String STUDENT_QUERY = "INSERT INTO STUDENT VALUES(STUDENT_SEQ.NEXTVAL,?,?,?)";
	private static final String EMPLOYEE_DETAILS_QUERY = "INSERT INTO EMPLOYEE_DETAILS VALUES(EMPLOYEE_DETAILS_SEQ.NEXTVAL,?,?,?)";
	private DataSource ds;

	public CollegeDAOImpl(DataSource ds) {
		System.out.println("CollegeDAOImpl 1-param Constructor");
		this.ds = ds;
	}

	@Override
	public int insertStudent(StudentBO bo) throws Exception {
		Connection con = null;
		PreparedStatement ps = null;
		int result = 0;
		// get connection obj
		con = ds.getConnection();
		// create preparedStatement obj
		ps = con.prepareStatement(STUDENT_QUERY);
		// set value to query param
		ps.setString(2, bo.getPname());
		ps.setString(3, bo.getCourse());
		ps.setString(4, String.valueOf(bo.getDoj()));
		// execute the query
		result = ps.executeUpdate();
		System.out.println("result");
		System.out.println(result);
		return result;
	}

	@Override
	public int insertEmployee(EmployeeBO bo) throws Exception {
		Connection con = null;
		PreparedStatement ps = null;
		int result = 0;
		// get connection obj
		con = ds.getConnection();
		// create preparedStatement obj
		ps = con.prepareStatement(EMPLOYEE_DETAILS_QUERY);
		// set value to query param
		ps.setString(2, bo.getPname());
		ps.setString(3, bo.getDesg());
		ps.setString(4, String.valueOf(bo.getDoj()));
		// execute the query
		result = ps.executeUpdate();
		return result;
	}

}
