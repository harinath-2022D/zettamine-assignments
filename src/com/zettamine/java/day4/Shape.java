package com.zettamine.java.day4;

public abstract class Shape {
	private String color;
	
	public void setColor(String color) {
		this.color = color;
	}
	
	public String getColor() {
		return color;
	}
	
	abstract float area();
	
	public abstract double volume();
}
