package com.emp.service;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.emp.beans.Employee;
import com.emp.repo.EmployeeDao;

import jakarta.transaction.Transactional;

@Service
public class EmployeeService {
	
	@Autowired
	private EmployeeDao dao;
	
	public Employee saveEmployee(Employee emp) {
		return dao.save(emp);
	}
	@Transactional
	public Employee findByEmp_id(int id) {
	    return dao.findByEmp_id(id);
	}

	
	
}
