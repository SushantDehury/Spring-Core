package com.nt.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;

import com.nt.bo.EmployeeBO;
import com.nt.dao.EmployeeSerchDAO;
import com.nt.dto.EmployeeDTO;

public class EmployeeSerchServiceImpl implements EmployeeSerchService {

	private EmployeeSerchDAO dao;

	public EmployeeSerchServiceImpl(EmployeeSerchDAO dao) {
		this.dao = dao;
	}

	@Override
	public List<EmployeeDTO> serchEmployeeDesg(String[] desg) throws Exception {
		String cond="(";
		List<EmployeeBO> listBO=null;
		List<EmployeeDTO> listDTO=new ArrayList();
		//prepare cond Srting
		for (int i = 0; i < desg.length; i++) {
			if(i==desg.length-1){
				cond=cond+"'"+desg[i]+"')";
			}else{
				cond=cond+"'"+desg[i]+"',";
			}
		}
			//user dao
			listBO=dao.findEmployeeDesg(cond);
			//convert listBO to listDTO;
			listBO.forEach(bo->{
			EmployeeDTO dto=new EmployeeDTO();
			BeanUtils.copyProperties(bo, dto);
			dto.setSno(listDTO.size()+1);
			listDTO.add(dto);
			});	
		return listDTO;
	}

}
