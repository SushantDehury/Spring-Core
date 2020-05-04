package com.nt.dao;

import com.nt.bo.EmployeeBO;
import com.nt.bo.StudentBO;

public interface CollegeDAO {
	public int insertStudent(StudentBO bo) throws Exception;
	public int insertEmployee(EmployeeBO bo) throws Exception;

}
