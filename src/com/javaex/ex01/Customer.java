package com.javaex.ex01;

public class Customer extends Person {

//--------------------------------------------------------			필드

	private int cNo;
	private int point;

//--------------------------------------------------------			생성자

	public Customer() {
	}

	public Customer(String name, String hp, int cNo, int point) {
		super(name, hp);
		this.cNo = cNo;
		this.point = point;
	}

//--------------------------------------------------------			setter, getter

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

//--------------------------------------------------------			showInfo()

	public void showInfo() {
		System.out.println(
				"#Name_[ " + name + " ],   #H.P_[ " + hp + " ],   #CustomerNo_[ " + cNo + " ],   #Point_[ " + point + " ]");
	}

}
