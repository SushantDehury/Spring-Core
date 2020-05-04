package com.nt.service;

import java.util.Random;

import org.springframework.beans.BeanUtils;

import com.nt.bo.EmployeeBO;
import com.nt.bo.StudentBO;
import com.nt.dao.CollegeDAO;
import com.nt.dto.EmployeeDTO;
import com.nt.dto.StudentDTO;

public abstract class CollegeServiceImpl implements CollegeService {
	private CollegeDAO dao;

	public CollegeServiceImpl(CollegeDAO dao) {
		this.dao = dao;
	}

	public abstract StudentBO getStudentBO();

	public abstract EmployeeBO getEmployeeBO();

	@Override
	public String generateStudentInsert(StudentDTO dto) throws Exception {
		StudentBO bo = null;
		int result = 0;
		bo = getStudentBO();
		int no=new Random().nextInt(100);
		BeanUtils.copyProperties(dto, bo);
		bo.setPid(no);
		result = dao.insertStudent(bo);
		if (result == 0)
			return "Record is not Inserted...";
		else
			return "Record Insert Succeeded...";
	}

	@Override
	public String generateEmployeeInsert(EmployeeDTO dto) throws Exception {
		EmployeeBO bo = null;
		bo = getEmployeeBO();
		int result = 0;
		int no=new Random().nextInt(100);
		BeanUtils.copyProperties(dto, bo);
		bo.setPid(no);
		result = dao.insertEmployee(bo);
		if (result == 0)
			return "Record is not Inserted...";
		else
			return "Record Insert Succeeded...";
	}

}
