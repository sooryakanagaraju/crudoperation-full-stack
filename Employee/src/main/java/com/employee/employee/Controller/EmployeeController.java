package com.employee.employee.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.employee.employee.entity.EmployeeEntity;
import com.employee.employee.service.EmployeeService;

@CrossOrigin(origins="http://localhost:63236")
@RestController
public class EmployeeController {
	
	@Autowired
	EmployeeService employeeservice;
	
	@PostMapping("/createTodo")
	
    public EmployeeEntity createEmployee(@RequestBody EmployeeEntity emp)
    {
        return employeeservice.createEmp(emp);

    }
	
	
	@GetMapping("/listleave")
    public List<EmployeeEntity> getAllLeave() {
    // TODO Auto-generated method stub
		return employeeservice.getAllLeave();
	
}
	
	@PutMapping("/updateemployee/{id}")
	public ResponseEntity<EmployeeEntity> updateEmployee(@PathVariable("id") Long id,@RequestBody EmployeeEntity employee)
	{
		employee.setId(id);	
		EmployeeEntity updatedemplpoyee = employeeservice.updateemployee(employee);
		return new ResponseEntity<>(updatedemplpoyee,HttpStatus.OK);
	}
	
	
	@DeleteMapping("/deleteemployee/{id}")
	public ResponseEntity<String> DeleteEmployee(@PathVariable("id") Long id)
	{		
		employeeservice.deleteEmployee(id);
		return new ResponseEntity<>("Employee successfully deleted!",HttpStatus.OK);
	}
	
	
}
