/**
 * 
 */
package com.knowledge.cluster.java.oops;

/**
 * @author vikas
 *
 */
public class Employee implements EmployeeIfc {
	private String name;
	private int salary;
	private int bonus;
	private String department;
	private String role;
	
	public Employee(String name, String role) {
		this.name = name;
		this.role = role;
	}
	/**
	 * @return the name
	 */
	@Override
	public String getName() {
		return name;
	}
	/**
	 * @return the salary
	 */
	@Override
	public int getSalary() {
		return salary;
	}
	/**
	 * @param salary the salary to set
	 */
	@Override
	public void setSalary(int salary) {
		this.salary = salary;
	}
	/**
	 * @return the bonus
	 */
	@Override
	public int getBonus() {
		return bonus;
	}
	/**
	 * @param bonus the bonus to set
	 */
	@Override
	public void setBonus(int bonus) {
		this.bonus = bonus;
	}
	/**
	 * @return the department
	 */
	@Override
	public String getDepartment() {
		return department;
	}
	/**
	 * @param department the department to set
	 */
	@Override
	public void setDepartment(String department) {
		this.department = department;
	}
	/**
	 * @return the role
	 */
	@Override
	public String getRole() {
		return role;
	}
	/**
	 * @param role the role to set
	 */
	@Override
	public void setRole(String role) {
		this.role = role;
	}
	@Override
	public int totalAnnualSalary() {
		return salary * 12 + getBonus();
	}
}
