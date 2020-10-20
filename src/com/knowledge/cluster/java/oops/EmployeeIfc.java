/**
 * 
 */
package com.knowledge.cluster.java.oops;

/**
 * @author vikas
 *
 */
public interface EmployeeIfc {

	String getName();

	void setRole(String role);

	String getRole();

	void setDepartment(String department);

	String getDepartment();

	void setBonus(int bonus);

	int getBonus();

	void setSalary(int salary);

	int getSalary();
	
	int totalAnnualSalary();
}
