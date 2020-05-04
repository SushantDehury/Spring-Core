package com.nt.dao;

import java.util.List;

import com.nt.bo.EmployeeBO;

public interface EmployeeSerchDAO {
	public List<EmployeeBO> findEmployeeDesg(String cond) throws Exception;

}
