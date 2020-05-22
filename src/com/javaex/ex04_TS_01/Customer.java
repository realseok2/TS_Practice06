package com.javaex.ex04_TS_01;

public class Customer extends User {

//------------------------------------------------------					필터

	private int point;

//------------------------------------------------------					생성자

	public Customer(String id, String password, String name, int point) {
		super(id, password, name);
		this.point = point;
	}

//------------------------------------------------------					setter, getter

	public int getPoint() {
		return point;
	}

	public void setPoint(int point) {
		this.point = point;
	}

//------------------------------------------------------					showInfo()

	public void showInfo() {
		System.out.println("#Id_[ " + id + " ],   #Password_[ " + password + " ],   #Name_[ " + name + " ],   #Point_[ "
				+ point + " ]");
	}

}
