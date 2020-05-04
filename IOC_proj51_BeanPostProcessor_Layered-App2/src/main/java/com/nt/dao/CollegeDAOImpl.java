package com.nt.dao;


import com.nt.bo.EmployeeBO;
import com.nt.bo.StudentBO;

public class CollegeDAOImpl implements CollegeDAO {


	@Override
	public int insertStudent(StudentBO bo) throws Exception {
		System.out.println(bo.getPid()+"   "+bo.getPname()+"   "+bo.getCourse()+"   "+bo.getDoj());
		return 1;
	}

	@Override
	public int insertEmployee(EmployeeBO bo) throws Exception {
		System.out.println(bo.getPid()+"   "+bo.getPname()+"   "+bo.getDesg()+"   "+bo.getDoj());
		return 1;
	}

}
