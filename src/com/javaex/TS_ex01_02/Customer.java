package com.javaex.TS_ex01_02;

public class Customer extends Person {

//---------------------------------------------						필드

	private int cNo;
	private int point;

//---------------------------------------------						필드

	public Customer() {

	}

	public Customer(String name, String hp, int cNo, int point) {
		super(name, hp);
		this.cNo = cNo;
		this.point = point;
	}

//---------------------------------------------						필드

	public int getcNo() {
		return cNo;
	}

	public void setcNo(int cNo) {
		this.cNo = cNo;
	}

	public int getPoint() {
		return point;
	}

	public void setPoint(int point) {
		this.point = point;
	}

//---------------------------------------------						필드

	public void showInfo() {
		System.out.println("#Name_[ " + name + " ],   #Hp_[ " + hp + " ],   #cNo_[ " + cNo + " ],   #Point_[ " + point + " ]");
	}

}
