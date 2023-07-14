package com.employee.employee.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.employee.employee.entity.EmployeeEntity;

@Service
public interface EmployeeService {

	EmployeeEntity createEmp(EmployeeEntity employee);
	List<EmployeeEntity> getAllLeave();
	EmployeeEntity updateemployee(EmployeeEntity employee);
	void deleteEmployee(Long id);
}
