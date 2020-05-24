package com.javaex.TS_ex05_02;

public class Depart extends Employee {

	// 코드작성

//---------------------------------------------							필드

	private String department;

//	---------------------------------------------							생성자

	public Depart(String name, int salary, String department) {
		super(name, salary);
		this.department = department;
	}

//	---------------------------------------------							setter, getter

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

//	---------------------------------------------							showInformation()

	public void showInformation() {
		System.out.println("#Name_[ " + super.getName() + " ] , #Salary_[ " + super.getSalary() + " ],   #Department_[ "
				+ department + " ]");
	}

}
