package com.zettamine.java.day4;

public class Rectangle extends Shape{
	
	private int length;
	private int breadth;
	
	public Rectangle(int l, int b, String color) {
		this.length = l;
		this.breadth = b;
		super.setColor(color);
	}
	@Override
	float area() {
		float area = this.length * this.breadth;
		return area;
	}
	@Override
	public double volume() {
		return -1;
	}
	

}
