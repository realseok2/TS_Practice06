package com.javaex.ex03;

public class Shape {

//-----------------------------------------------------------				필터

	protected String fillColor;
	protected String lineColor;

//-----------------------------------------------------------				생성자

	public Shape(String fillColor, String lineColor) {
		this.fillColor = fillColor;
		this.lineColor = lineColor;
	}

//-----------------------------------------------------------				setter, getter

	public void setFillColor(String fillColor) {
		this.fillColor = fillColor;
	}

	public void setLineColor(String lineColor) {
		this.lineColor = lineColor;
	}

//-----------------------------------------------------------				showInfo()

	public void showInfo() {

	}

}
