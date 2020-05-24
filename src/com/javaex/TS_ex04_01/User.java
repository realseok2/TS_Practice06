package com.javaex.TS_ex04_01;

public class User {

//------------------------------------------------------					필터

	protected String id;
	protected String password;
	protected String name;

//------------------------------------------------------					생성자

	public User() {

	}

	public User(String id, String password, String name) {
		this.id = id;
		this.password = password;
		this.name = name;
	}

//------------------------------------------------------					setter, getter

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

//------------------------------------------------------					showInfo()	

	public void showInfo() {
		System.out.println("운영자의 월급은 5,000,000원 입니다.");
	}

}
