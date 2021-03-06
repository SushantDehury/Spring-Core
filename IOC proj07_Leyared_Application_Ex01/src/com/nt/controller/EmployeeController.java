package com.nt.controller;

import com.nt.dto.EmployeeDTO;
import com.nt.service.EmployeeService;
import com.nt.vo.EmployeeVO;

public class EmployeeController {
	private EmployeeService eservice;

	public void setEservice(EmployeeService eservice) {
		this.eservice = eservice;
	}

	EmployeeVO vo = null;
	EmployeeDTO dto = null;

	public void setVo(EmployeeVO vo) {
		this.vo = vo;
	}

	public void setDto(EmployeeDTO dto) {
		this.dto = dto;
	}

	public String resultGenerator(String eno, String ename, String salary) throws Exception {
		/*
		 * EmployeeVO vo = null; EmployeeDTO dto = null;
		 */ 
		String result = null;
		// prepare vo obj
		// vo = new EmployeeVO();
		vo.setEno(eno);
		vo.setEname(ename);
		vo.setSalary(salary);
		// convert vo to dto
		// dto = new EmployeeDTO();
		dto.setEno(Integer.parseInt(eno));
		dto.setEname(ename);
		dto.setSalary(Float.parseFloat(salary));
		result = eservice.paySlipGenerator(dto);

		return result;

	}

}
