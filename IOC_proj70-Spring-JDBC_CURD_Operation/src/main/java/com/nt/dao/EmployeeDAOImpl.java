package com.nt.dao;

import java.util.List;
import java.util.Map;

import org.springframework.jdbc.core.JdbcTemplate;

public class EmployeeDAOImpl implements EmployeeDAO {
	private JdbcTemplate tc;
	private static final String EMP_COUNT = "SELECT COUNT(*) FROM EMP";
	private static final String EMPLOYEE_RECORD = "SELECT EMPNO,ENAME,JOB,SAL FROM EMP WHERE EMPNO=?";
	private static final String EMPLOYEE_SALARY = "SELECT SAL FROM EMP WHERE EMPNO=?";
	private static final String EMPLOYEE_DETAILS = "SELECT EMPNO,ENAME,SAL,JOB FROM EMP";
	private static final String INSERT_EMPLOYEE = "INSERT INTO EMP(EMPNO,ENAME,SAL,JOB) VALUES(?,?,?,?)";
	private static final String UPDATE_EMPLOYEE_SAL = "UPDATE EMP SET SAL=? WHERE SAL=?";

	public void setTc(JdbcTemplate tc) {
		this.tc = tc;
	}

	@Override
	public int serchEmpCount() {
		int no = 0;
		no = tc.queryForObject(EMP_COUNT, Integer.class, new Object[] {});
		return no;
	}

	@Override
	public Map<String, ?> empRecord(int empno) {
		Map map = tc.queryForMap(EMPLOYEE_RECORD, empno);
		return map;
	}

	@Override
	public List<Map<String, ?>> employeeDetails() {
		List list = tc.queryForList(EMPLOYEE_DETAILS);
		return list;
	}

	@Override
	public int insertEmployee(int empno, String ename, String job, float sal) {
		int record = 0;
		record = tc.update(INSERT_EMPLOYEE, empno, ename, sal, job);
		return record;
	}

	@Override
	public int serchEmpSaly(int empno) {
		int salary=tc.queryForObject(EMPLOYEE_SALARY,Float.class);
		return salary;
	}

	@Override
	public int updateEmployeeSalary(int empno) {
		int count = 0;
		count = tc.update(UPDATE_EMPLOYEE_SAL, empno);
		return count;
	}

}
