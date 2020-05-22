package com.javaex.ex01_TS_01;

public class Person {

//--------------------------------------------------------					필드	

	protected String name;
	protected String hp;

//--------------------------------------------------------					생성자

	public Person() {

	}

	public Person(String name, String hp) {
		super();
		this.name = name;
		this.hp = hp;
	}

//--------------------------------------------------------					getter, setter

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getHp() {
		return hp;
	}

	public void setHp(String hp) {
		this.hp = hp;
	}

//--------------------------------------------------------					showInfo()

	public void showInfo() {
		System.out.println("#Name_[ " + name + " ],   #Hp_[ " + hp + " ]");
	}

}
