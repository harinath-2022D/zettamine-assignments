package com.zettamine.java.day4;

public class Triangle extends Shape{
	private int base;
	private int height;
	
	public Triangle(int b, int h, String color) {
		this.base= b;
		this.height = h;
		super.setColor(color);
	}
	@Override
	float area() {
		// TODO Auto-generated method stub
		float ans = 0.5f * this.base * this.height;
		return ans;
	}
	@Override
	public double volume() {
		// TODO Auto-generated method stub
		return -1;
	}

}
