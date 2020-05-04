package com.nt.service;

import java.util.List;

import com.nt.dto.EmployeeDTO;

public interface EmployeeSerchService {
	public List<EmployeeDTO> serchEmployeeDesg(String[] desg) throws Exception;

}
