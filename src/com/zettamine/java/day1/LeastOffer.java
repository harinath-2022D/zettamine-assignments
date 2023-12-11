package com.zettamine.java.day1;

import java.util.Scanner;

public class LeastOffer {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("enter the number of items: ");
		int noOfItems = sc.nextInt();
		String[] items = new String[noOfItems];
		
		for(int i = 0; i < noOfItems; i++) {
			items[i] = sc.next();
		}
		
		int[] discounts = new int[noOfItems];
		int minDiscount = Integer.MAX_VALUE;
		
		for(int i = 0; i < noOfItems; i++) {
			String item = items[i];
			String[] itemSplit = item.split(",");
			int price = Integer.valueOf(itemSplit[1]);
			int discountPer = Integer.valueOf(itemSplit[2]);
			discounts[i] = ((price * discountPer) / 100);
			int temp = minDiscount;
			minDiscount = Math.min(minDiscount, (price * discountPer) / 100);
		}
		
		String res = "";
		for(int i = 0; i < noOfItems; i++) {
			if(minDiscount == discounts[i]) {
				res += items[i].split(",")[0] + " " ;
			}
		}
		
		System.out.print("\nItems with Minimum Discount: " + res);

	}

}
