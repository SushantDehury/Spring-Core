package com.nt.service;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.nt.bo.EmployeeBO;
import com.nt.dao.EmployeeDAO;
import com.nt.dto.EmployeeDTO;

@Service("eservice")
public class EmployeeServiceImpl implements EmployeeService {
	@Autowired
	private EmployeeDAO dao;
	
	@Transactional(propagation=Propagation.REQUIRED,readOnly=false,transactionManager="dsTm")
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
