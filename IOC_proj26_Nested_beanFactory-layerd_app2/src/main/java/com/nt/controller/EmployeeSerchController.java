package com.nt.controller;

import java.util.ArrayList;
import java.util.List;

import com.nt.dto.EmployeeDTO;
import com.nt.service.EmployeeSerchService;
import com.nt.vo.EmployeeVO;

public class EmployeeSerchController {
	private EmployeeSerchService service;

	public EmployeeSerchController(EmployeeSerchService service) {
		this.service = service;
	}
	public List<EmployeeVO> getEmpByDesg(String[] desg) throws Exception{
		List<EmployeeDTO> listDTO=null;
		List<EmployeeVO> listVO=new ArrayList();
		
		listDTO=service.serchEmployeeDesg(desg);
		//convert listDTO to list ListVO
		listDTO.forEach(dto->{
			EmployeeVO vo=new EmployeeVO();
			vo.setSno(String.valueOf(dto.getSno()));
			vo.setEmpno(String.valueOf(dto.getEmpno()));
			vo.setEname(dto.getEname());
			vo.setDeptno(String.valueOf(dto.getDeptno()));
			listVO.add(vo);
			
		});
		
		return listVO;
	}

}
