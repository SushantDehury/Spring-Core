package com.nt.service;

import com.nt.dto.EmployeeDTO;
import com.nt.dto.StudentDTO;

public interface CollegeService {
	public String generateStudentInsert(StudentDTO dto) throws Exception;

	public String generateEmployeeInsert(EmployeeDTO dto) throws Exception;
}
