/**
 * 
 */
package com.knowledge.cluster.java.oops;

/**
 * @author vikas
 *
 */
public class Director extends Employee {

	public Director(String name) {
		super(name, "Director");
	}

	@Override
	public int getBonus() {
		return (int) (super.getSalary()*0.5);
	}
}
