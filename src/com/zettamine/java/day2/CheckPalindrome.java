package com.zettamine.java.day2;

import java.util.Scanner;

public class CheckPalindrome {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter input: ");
		String input = sc.nextLine();
		
		StringBuffer sb = new StringBuffer(input);
		sb.reverse();
		
		if(input.equals(sb.toString())) {
			System.out.println("Given String " + input + " is palindrome.");
		}else {
			System.out.println("Not palindrome.");
		}
		System.out.println(sb);
		

	}

}
