package com.nt.service;

import java.util.List;
import java.util.Map;

public interface EmployeeService {
	public int factchEmpCount();
	public Map<String, ?> fatchEmployeeRecord(int empno);
	public List<Map<String,?>> fatchEmployeeDetails();
	public String fatchEmployee(int empno,String ename,String job,float sal);
	public float factcEmpSalary(int empno);
	public String UpdateSalHike(int empno);

}
