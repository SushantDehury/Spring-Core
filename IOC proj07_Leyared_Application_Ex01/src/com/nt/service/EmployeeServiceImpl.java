package com.nt.service;

import com.nt.bo.EmployeeBO;
import com.nt.dao.EmployeeDAO;
import com.nt.dto.EmployeeDTO;

public class EmployeeServiceImpl implements EmployeeService {
	private EmployeeDAO edao;

	public void setEdao(EmployeeDAO edao) {
		this.edao = edao;
	}
	private EmployeeBO bo;
	

	public void setBo(EmployeeBO bo) {
		this.bo = bo;
	}


	@Override
	public String paySlipGenerator(EmployeeDTO dto) throws Exception {
		float salary=0.0f;
		float netSalary,grossSalary=0.0f;
//		EmployeeBO bo=null;
		int result=0;
		//Write the b.logic
		salary=dto.getSalary();
		netSalary=salary/2*100;
		grossSalary=salary/2*100+50;
		//sent to EmployeeBO
//		bo=new EmployeeBO();
		bo.setEno(dto.getEno());
		bo.setEname(dto.getEname());
		bo.setSalary(salary);
		bo.setNetSalary(netSalary);
		bo.setGrossSalary(grossSalary);
		//sent EmployeeDAOImpl
		result=edao.insert(bo);
		if(result==0)
			return "Registratation fail";
		else
		    return "Registratation Succided";
	}

}
