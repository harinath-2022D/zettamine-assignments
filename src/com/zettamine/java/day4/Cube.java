package com.zettamine.java.day4;

public class Cube extends Shape implements Spatial{
	private double length;
    private double width;
    private double height;
    
    public Cube(double l, double w, double h) {
    	this.length = l;
    	this.width = w;
    	this.height = h;
    }
	@Override
	float area() {
		float result =(float) ((2 * length * width) + (2 * length * height) + (2* width * height));
		return result;
	}
	@Override
	public double volume() {
		return length * width * height ;
	}

}
