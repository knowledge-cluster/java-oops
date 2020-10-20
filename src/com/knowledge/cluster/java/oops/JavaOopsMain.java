/**
 * 
 */
package com.knowledge.cluster.java.oops;

/**
 * @author vikas
 *
 */
public class JavaOopsMain {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		EmployeeIfc employee = new Employee("Vikash", "Software Engineer");
		employee.setDepartment("Software");
		employee.setBonus(1000);
		employee.setSalary(50000);
		System.out.println(employee.totalAnnualSalary());
		
		EmployeeIfc employeeDir = new Director("Vikash");
		employeeDir.setDepartment("Software");
		employeeDir.setBonus(1000);
		employeeDir.setSalary(50000);
		System.out.println(employeeDir.totalAnnualSalary());
	}

}
