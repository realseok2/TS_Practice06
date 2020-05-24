package com.javaex.TS_ex02_02;

public class Shape {

//----------------------------------------------------						필드

	private String fillColor;
	private String lineColor;

//----------------------------------------------------						생성자

	public Shape() {
		System.out.println("생성자 Shape (0개) 실행");
	}

	public Shape(String fillColor, String lineColor) {
		this.fillColor = fillColor;
		this.lineColor = lineColor;
		System.out.println("생성자 Shape (2개) 실행");
	}

}
