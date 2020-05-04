package com.nt.dao;

import com.nt.bo.EmployeeBO;

public interface EmployeeDAO {
	public int insertEmployee_HR(EmployeeBO bo)throws Exception;
	public int insertEmployee_FINANCE(EmployeeBO bo)throws Exception;

}
