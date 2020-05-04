package com.nt.controller;

import com.nt.dto.StudentDTO;
import com.nt.service.StudentService;
import com.nt.vo.StudentVO;

public class StudentController {
	private StudentService service = null;

	public void setService(StudentService service) {
		this.service = service;
	}

	public String resultTotalMark(String ename, String mark1, String mark2, String mark3) throws Exception {
		StudentVO vo = null;
		StudentDTO dto = null;
		String result = null;
		// convert to VO---->DTO

		vo = new StudentVO();

		vo.setSname(ename);
		vo.setMark1(mark1);
		vo.setMark2(mark2);
		vo.setMark3(mark3);

		dto = new StudentDTO();
		dto.setSname(vo.getSname());
		dto.setMark1(Integer.parseInt(vo.getMark1()));
		dto.setMark2(Integer.parseInt(vo.getMark2()));
		dto.setMark3(Integer.parseInt(vo.getMark3()));
		// sent to service class
		result = service.processResult(dto);
		return result;

	}

}
