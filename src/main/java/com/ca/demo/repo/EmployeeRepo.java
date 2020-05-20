package com.ca.demo.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ca.demo.model.Employee;
@Repository
public interface EmployeeRepo extends JpaRepository<Employee, Integer>{

	List<Employee> findByDept(String dept);
	

}
