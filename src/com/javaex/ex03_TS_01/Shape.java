package com.javaex.ex03_TS_01;

public class Shape {

//--------------------------------------------------------						필터

	protected String fillColor;
	protected String lineColor;

//--------------------------------------------------------						생성자

	public Shape(String fillColor, String lineColor) {
		this.fillColor = fillColor;
		this.lineColor = lineColor;
	}

//--------------------------------------------------------						setter, getter

	public String getFillColor() {
		return fillColor;
	}

	public void setFillColor(String fillColor) {
		this.fillColor = fillColor;
	}

	public String getLineColor() {
		return lineColor;
	}

	public void setLineColor(String lineColor) {
		this.lineColor = lineColor;
	}
}
