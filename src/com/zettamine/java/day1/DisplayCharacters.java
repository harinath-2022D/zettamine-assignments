package com.zettamine.java.day1;

import java.util.Scanner;

public class DisplayCharacters {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter 4 Numbers:");
		int first = sc.nextInt();
		int second = sc.nextInt();
		int third = sc.nextInt();
		int fourth = sc.nextInt();
		
		System.out.println(first+"-"+(char) first);
		System.out.println(second+"-"+(char) second);
		System.out.println(third+"-"+(char) third);
		System.out.println(fourth+"-"+(char) fourth);

	}

}
