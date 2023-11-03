package com.emp.repo;

//import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
//import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.emp.beans.Employee;

@EnableJpaRepositories
public interface EmployeeDao extends JpaRepository<Employee, Integer> {
   @Query("SELECT e FROM Employee e WHERE e.emp_id = :emp_id")
	public Employee findByEmp_id(int emp_id);
}
