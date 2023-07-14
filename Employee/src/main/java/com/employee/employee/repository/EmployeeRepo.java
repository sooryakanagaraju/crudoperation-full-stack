package com.employee.employee.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.employee.employee.entity.EmployeeEntity;

@Repository
public interface EmployeeRepo extends CrudRepository<EmployeeEntity,Long>{

}
