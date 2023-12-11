package com.zettamine.java.day4;

public class Sphere extends Shape implements Spatial{
	private double radious;
	
	public Sphere(double r) {
		this.radious = r;
	}

	@Override
	float area() {
		float result = (float) (4 * Math.PI * Math.pow(radious, 2));
		return result;
	}

	@Override
	public double volume() {
		double result = 4 * Math.PI * Math.pow(radious,3);
		return result;
	}
}
