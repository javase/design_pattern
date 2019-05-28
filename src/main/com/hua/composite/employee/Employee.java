package com.hua.composite.employee;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by lerry on 2017/11/9.
 * @author lerry
 */
public class Employee {
	private String name;

	private String dept;

	private int salary;

	private List<Employee> subordinates;

	public Employee(String name, String dept, int salary) {
		this.name = name;
		this.dept = dept;
		this.salary = salary;
		this.subordinates = new ArrayList<>();
	}

	public void add(Employee employee) {
		subordinates.add(employee);
	}

	public void remove(Employee employee) {
		subordinates.remove(employee);
	}

	public List<Employee> getSubordinates() {
		return subordinates;
	}

	@Override
	public String toString() {
		return "Employee{" +
				"name='" + name + '\'' +
				", dept='" + dept + '\'' +
				", salary=" + salary +
				'}';
	}
}
