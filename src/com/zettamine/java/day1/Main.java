package com.zettamine.java.day1;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
//		int n = 1;
//		while( n++ >= 5);
//		System.out.println(n);
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number : ");
		int num = sc.nextInt();
		sc.close();
		String result = NumberToWord.digitToWord(num);
		System.out.println(num + " in words --> " + result);

	}

}
