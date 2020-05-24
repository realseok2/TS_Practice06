package com.javaex.TS_ex04_01;

public class Employee extends User {

//------------------------------------------------------					필터

	private int salary;

//------------------------------------------------------					생성자

	public Employee(String id, String password, String name, int salary) {
		super(id, password, name);
		this.salary = salary;
	}

//------------------------------------------------------					setter, getter

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

//------------------------------------------------------					showInfo()

	public void showInfo() {
		System.out.println("#Id_[ " + id + " ],   #Password_[ " + password + " ],   #Name_[ " + name
				+ " ],   #Salary_[ " + salary + " ]");
	}

}
