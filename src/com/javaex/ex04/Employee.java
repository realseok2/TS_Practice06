package com.javaex.ex04;

public class Employee extends User {

//------------------------------------------------------------				필드

	private int salary;

	// ------------------------------------------------------------ 생성자

	public Employee(String id, String password, String name, int salary) {
		super(id, password, name);
		this.salary = salary;
	}

	// ------------------------------------------------------------ setter, getter

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	// ------------------------------------------------------------ showInfo()

	public void showInfo() {
		System.out.println("#ID_[ " + id + " ],   #PASSWORD_[ " + password + " ],   #NAME_[ " + name
				+ " ],   #SALARY_[ " + salary + " ]");
	}

}
