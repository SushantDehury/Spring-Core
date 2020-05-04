package com.nt.dao;

import java.util.List;
import java.util.Map;

public interface EmployeeDAO {
	public int serchEmpCount();
	public int serchEmpSaly(int empno);
	public Map<String,?> empRecord(int empno);
	public List<Map<String,?>> employeeDetails();
	public float insertEmployee(int empno,String ename,String job,float sal);
	public int updateEmployeeSalary(int empno);

}
