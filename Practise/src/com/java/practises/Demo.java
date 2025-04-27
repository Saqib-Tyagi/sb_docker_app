package com.java.practises;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

class Employee {

	private int id;
	private String name;
	private String email;
	private Double salary;
	private String deptName;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Double getSalary() {
		return salary;
	}

	public void setSalary(Double salary) {
		this.salary = salary;
	}

	public String getDeptName() {
		return deptName;
	}

	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}

	public Employee(int id, String name, String email, Double salary, String deptName) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.salary = salary;
		this.deptName = deptName;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", email=" + email + ", salary=" + salary + ", deptName="
				+ deptName + "]";
	}
}

public class Demo {

	public static void main(String[] args) {
		Employee employee1 = new Employee(1, "Raj", "Raj@123", 70000.0, "Dev");
		Employee employee2 = new Employee(2, "Saqib", "Saqj@123", 60000.0, "Test");
		Employee employee3 = new Employee(3, "Rahul", "Raj@123", 50000.0, "Dev");
		Employee employee4 = new Employee(4, "Vivek", "Saqj@123", 60000.0, "HR");
		Employee employee5 = new Employee(5, "Rishab", "Raj@123", 70000.0, "HR");
		Employee employee6 = new Employee(6, "Rishab", "Saqj@123", 40000.0, "Test");

		List<Employee> list = Arrays.asList(employee1, employee2, employee3, employee4, employee5, employee6);
		Map<String, Double> map = list.stream()
				.collect(Collectors.groupingBy(Employee::getDeptName, Collectors.averagingDouble(Employee::getSalary)));

		System.out.println(map);

		// max avg salary paid by which dept
		Map.Entry<String, Double> max = map.entrySet().stream().max(Map.Entry.comparingByValue()).orElseThrow();

		System.out.println(max.getKey());
		System.out.println(max);
	}

}
