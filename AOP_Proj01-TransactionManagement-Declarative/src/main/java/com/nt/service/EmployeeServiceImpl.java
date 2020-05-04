package com.nt.service;

import org.springframework.beans.BeanUtils;

import com.nt.bo.EmployeeBO;
import com.nt.dao.EmployeeDAO;
import com.nt.dto.EmployeeDTO;

public class EmployeeServiceImpl implements EmployeeService {
	private EmployeeDAO dao;
	
	public EmployeeServiceImpl(EmployeeDAO dao) {
		this.dao = dao;
	}

	public String registerEmployee(EmployeeDTO dto) throws Exception{
		EmployeeBO bo=new EmployeeBO();
		BeanUtils.copyProperties(dto, bo);
		int result1=dao.insertEmployee_HR(bo);
		int result2=dao.insertEmployee_FINANCE(bo);
		if(result1==0 || result2==0)
			throw new RuntimeException("Some Internal Problem...");
		
		return "Registration successfull....";
	}

}
