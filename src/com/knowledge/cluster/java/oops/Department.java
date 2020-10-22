/**
 * 
 */
package com.knowledge.cluster.java.oops;

import java.util.List;

/**
 * @author vikas
 *
 */
public class Department {
	private List<Employee> employees;
	private String department;

	public Department(String department) {
		this.department = department;
	}
	
	public String getDepartment() {
		return department;
	}

	/**
	 * @return the employees
	 */
	public List<Employee> getEmployees() {
		return employees;
	}

	/**
	 * @param employees the employees to set
	 */
	public void setEmployees(List<Employee> employees) {
		this.employees = employees;
	}
}
