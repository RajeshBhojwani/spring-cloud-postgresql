package org.acn.domain;

import org.springframework.data.annotation.Id;


public class Employee {
	
	@Id
	private volatile String id;
	
	
    private String employeeName;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public Employee(String id, String employeeName) {
		this.id = id;
		this.employeeName = employeeName;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", employeeName=" + employeeName + "]";
	}

	
}

