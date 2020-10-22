/**
 * 
 */
package com.knowledge.cluster.java.oops;

import java.util.ArrayList;
import java.util.List;

/**
 * @author vikas
 *
 */
public class Company {
	private List<Department> departments = new ArrayList<Department>();

	public Company() {
		Department engineering = new Department("Engineering");
		engineering.setEmployees(new ArrayList<Employee>());
		Department operations = new Department("Operations");
		operations.setEmployees(new ArrayList<Employee>());
		departments.add(engineering);
		departments.add(operations);
	}

}
