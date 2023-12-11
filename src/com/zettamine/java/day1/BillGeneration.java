package com.zettamine.java.day1;

import java.util.Scanner;

public class BillGeneration {
	private static int pizza = 100;
	private static int puffs = 20;
	private static int coolDrinks = 10;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("enter the no of pizzas bought: ");
		int pizzaCount = sc.nextInt();
		System.out.print("enter the no of puffs bought: ");
		int puffsCount = sc.nextInt();
		System.out.print("enter the no of cool drinks bought: ");
		int coolDrinksCount = sc.nextInt();
		
		sc.close();
		generateBill(pizzaCount, puffsCount, coolDrinksCount);

	}
	
	private static void generateBill(int pizzaCount, int puffsCount, int coolDrinksCount) {
		System.out.println();
		
		System.out.println("Bill Details");
		
		System.out.println("No of pizzas: \t\t"+pizzaCount+"\t cost:"+ pizzaCount * pizza);
		
		System.out.println("No of puffs: \t\t"+puffsCount+"\t cost:"+ puffsCount * puffs);
		
		System.out.println("No of Cool Drinks: \t"+coolDrinksCount+"\t cost:"+ coolDrinksCount * coolDrinks);
		
		System.out.println();
		float total = (float)((pizzaCount * pizza) + (puffsCount * puffs) + (coolDrinksCount * coolDrinks));
		System.out.printf("Total price = %.2f", total);
		System.out.print("\nENJOY THE SHOW!!!");
		
	}

}
