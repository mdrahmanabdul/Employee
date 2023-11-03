package com.emp.beans;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table
public class Employee {
	
	@Id
	@Column(name="emp_id")
	private int emp_id;
	
	@Column(name="emp_name")
	private String emp_name;

	public Employee(int emp_id, String emp_name) {
		super();
		this.emp_id = emp_id;
		this.emp_name = emp_name;
	}
	

	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}


	public int getEmp_id() {
		return emp_id;
	}

	public void setEmp_id(int emp_id) {
		this.emp_id = emp_id;
	}

	public String getEmp_name() {
		return emp_name;
	}

	public void setEmp_name(String emp_name) {
		this.emp_name = emp_name;
	}
	
	
	
}
