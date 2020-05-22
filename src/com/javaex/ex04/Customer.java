package com.javaex.ex04;

public class Customer extends User {

//------------------------------------------------------------				필드

	private int point;

//------------------------------------------------------------				생성자

	public Customer(String id, String password, String name, int point) {
		super(id, password, name);
		this.point = point;
	}

	// ------------------------------------------------------------ setter, getter

	public int getPoint() {
		return point;
	}

	public void setPoint(int point) {
		this.point = point;
	}

	// ------------------------------------------------------------ 필드

	public void showInfo() {
		System.out.println(
				"#ID_[ " + id + " ],   #PASSWORD_[ " + password + " ],   #NAME_[ " + name + " ],   #POINT_[ " + point +" ]");
	}

}
