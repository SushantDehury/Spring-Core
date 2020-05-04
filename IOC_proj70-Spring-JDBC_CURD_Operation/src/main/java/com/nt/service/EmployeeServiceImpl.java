package com.nt.service;

import java.util.List;
import java.util.Map;

import com.nt.dao.EmployeeDAO;

public class EmployeeServiceImpl implements EmployeeService {
	private EmployeeDAO dao;
	

	public void setDao(EmployeeDAO dao) {
		this.dao = dao;
	}


	@Override
	public int factchEmpCount() {
		//invoke the method
		
		return dao.serchEmpCount();
	}


	@Override
	public Map<String, ?> fatchEmployeeRecord(int empno) {
		
		return dao.empRecord(empno);
	}


	@Override
	public List<Map<String, ?>> fatchEmployeeDetails() {
		return dao.employeeDetails();
	}


	@Override
	public String fatchEmployee(int empno, String ename, String job, float sal) {
		int count=0;
		count=dao.insertEmployee(empno, ename, job, sal);
		if (count==0)
			return "Record Insetation fail";
			else
				return "Recoed Insert succeeded";
	}
	
	@Override
	public float factcEmpSalary(int empno) {
		
		return dao.serchEmpSaly(empno);
	}



	@Override
	public String UpdateSalHike(int empno) {
		float count=factcEmpSalary(empno);
		count=dao.updateEmployeeSalary(empno);
		if (count==0)
			return "Record Insetation fail";
			else
				return "Recoed Insert succeeded";
	}


	
}
