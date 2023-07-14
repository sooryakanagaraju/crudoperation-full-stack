package com.employee.employee.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.employee.employee.entity.EmployeeEntity;
import com.employee.employee.repository.EmployeeRepo;

@Service
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	EmployeeRepo employeerepository;
	

	@Override
	public EmployeeEntity createEmp(EmployeeEntity employee) {
		
		return employeerepository.save(employee);
	}

@Override
	public List<EmployeeEntity> getAllLeave() {
		// TODO Auto-generated method stub
		return (List<EmployeeEntity>) employeerepository.findAll();
	}

@Override
public EmployeeEntity updateemployee(EmployeeEntity employee) {
	// TODO Auto-generated method stub
	EmployeeEntity existingemployee = employeerepository.findById(employee.getId()).get();
	existingemployee.setFirstName(employee.getFirstName());
	existingemployee.setLastName(employee.getLastName());
	existingemployee.setEmail(employee.getEmail());
	existingemployee.setDob(employee.getDob());
	existingemployee.setGender(employee.getGender());
	existingemployee.setEducation(employee.getEducation());
	existingemployee.setCompany(employee.getCompany());
	existingemployee.setExperience(employee.getExperience());
	existingemployee.setPackagee(employee.getPackagee());

	
	return employeerepository.save(existingemployee);
}

@Override
public void deleteEmployee(Long id) {
	// TODO Auto-generated method stub
	employeerepository.deleteById(id);
}



}
