package com.javaex.TS_ex02_01;

public class Shape {

//-------------------------------------------------					필드

	protected String fillColor;
	protected String lineColor;

//-------------------------------------------------					생성자

	public Shape() {
		System.out.println("생성자 Shape(0) 실행");
	}

	public Shape(String fillColor, String lineColor) {
		super();
		this.fillColor = fillColor;
		this.lineColor = lineColor;
		System.out.println("생성자 Shape(2) 실행");
	}

}
