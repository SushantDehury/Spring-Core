package com.nt.service;

import com.nt.bo.StudentBO;
import com.nt.dao.StudentDAO;
import com.nt.dto.StudentDTO;

public class StudentServiceImpl implements StudentService {
	private StudentDAO dao = null;

	public void setDao(StudentDAO dao) {
		this.dao = dao;
	}

	@Override
	public String processResult(StudentDTO dto) throws Exception {

		int mark1, mark2, mark3 = 0;
		float avg, total = 0.0f;
		StudentBO bo = null;
		int result = 0;

		mark1 = dto.getMark1();
		mark2 = dto.getMark2();
		mark3 = dto.getMark3();
		total = mark1 + mark2 + mark3;
		avg = total / 3;
		// create bo class obj\
		bo=new StudentBO();
		bo.setSname(dto.getSname());
		bo.setMark1(mark1);
		bo.setMark2(mark2);
		bo.setMark3(mark3);
		bo.setAvg(avg);
		bo.setTotal(total);
		// Sent to StudentDAOImlp
		result = dao.insert(bo);
		if (result == 0)
			return "Record is not insert";
		else
			return "Record is insert successfully";
	}

}
