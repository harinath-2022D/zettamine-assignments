package com.zettamine.java.day4;

import java.util.Scanner;

public class DrawingApp {
	private static Scanner sc = new Scanner(System.in);
	private static Shape[] arr;
	private static int pointer = 0;
	public static void main(String[] args) {
		
		System.out.print("enter no of shapes: ");
		int noOfObj = sc.nextInt();
		arr = new Shape[noOfObj];
		
		while(noOfObj > 0) {
		System.out.print("Enter option 1.Rectanglr | 2.Cicle | 3.Triangle | 4.Cube | 5.Sphere: ");
		int n = sc.nextInt();
		String color;
		Shape sh;
		
		switch(n) {
		case 1:
			System.out.print("enter color of Rectangle: ");
			sc.nextLine();
			color = sc.nextLine();
			
			System.out.print("enter length of Rectangle: ");
			int length = sc.nextInt();
			System.out.print("enter breadth of Rectangle: ");
			int breadth = sc.nextInt();
			sh = new Rectangle(length, breadth, color);
			saveShapes(sh);
			break;
		case 2:
			System.out.print("Enter color of Circle: ");
			sc.nextLine();
			color = sc.nextLine();
			System.out.print("Enter radious of Circle: ");
			int radious = sc.nextInt();
			sh = new Circle(radious, color);
			saveShapes(sh);
			break;
		case 3:
			System.out.print("Enter color of Triangle: ");
			sc.nextLine();
			color = sc.nextLine();
			System.out.print("enter height of triangle: ");
			int h = sc.nextInt();
			System.out.print("enter base of triangle: ");
			int b = sc.nextInt();
			sh = new Triangle(b, h, color);
			saveShapes(sh);
			break;
		case 4:
			System.out.print("Enter color of Cube: ");
			sc.nextLine();
			color = sc.nextLine();
			System.out.print("enter height of Cube: ");
			double height = sc.nextDouble();
			System.out.print("enter width of Cube: ");
			double width = sc.nextDouble();
			System.out.print("enter length of Cube: ");
			double length1 = sc.nextDouble();
			sh = new Cube(length1, width, height);
			saveShapes(sh);
			break;
		case 5:
			System.out.print("Enter color of Sphere: ");
			sc.nextLine();
			color = sc.nextLine();
			System.out.print("enter radious of Sphere: ");
			double radious1 = sc.nextDouble();
			sh = new Sphere(radious1);
			saveShapes(sh);
			break;
		default:
			System.out.println("Invalid operation --- try again ---");
			break;
		}
		 noOfObj--;
		}// while
		printShapes();
		sc.close();

	}
	
	private static void saveShapes(Shape sh) {
		arr[pointer++] = sh;
	}
	
	private static void printShapes() {
		for(int i = 0; i < arr.length; i++) {
			Shape sh = arr[i];
			System.out.println("color of "+ sh.getClass().getSimpleName().toUpperCase() +" is "+ sh.getColor());
			System.out.println("area of " + sh.getClass().getSimpleName().toUpperCase() + " is = " + sh.area());
			if(sh instanceof Spatial) {
			System.out.println("volume of " + sh.getClass().getSimpleName().toUpperCase() + " is = " + sh.volume());
			}
			System.out.println();
		}
	}

	private static void print(Shape sh) {
		String[] classArr = sh.getClass().getName().split("\\.");
		String className = classArr[classArr.length - 1].toUpperCase();
		// className = sh.getClass().getSimpleName();
		
		System.out.println();
		System.out.println("=".repeat(5) + "   SHAPE SELECTED : " + className+"   " + "=".repeat(5));
		System.out.println("color of "+ className +" is "+ sh.getColor());
		System.out.print("Do you want change the color of " + className + ": ");
		String response = sc.next();
		if(response.equalsIgnoreCase("y")) {
			System.out.print("enter new color name: ");
			sc.nextLine();
			String color = sc.nextLine();
			sh.setColor(color);
			System.out.println("New color of " + className + " is : " + color);
		}
		System.out.println("area of " + className + " is = " + sh.area());
	}


}
