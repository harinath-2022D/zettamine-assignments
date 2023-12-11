package com.zettamine.java.day4;

public class Circle extends Shape{
	
	private int radious;
	
	public Circle(int r , String color) {
		this.radious = r;
		super.setColor(color);
	}

	@Override
	float area() {
		float ans = (22/7) * (this.radious * this.radious);
		return ans;
	}

	@Override
	public double volume() {
		// TODO Auto-generated method stub
		return -1;
	}

}
