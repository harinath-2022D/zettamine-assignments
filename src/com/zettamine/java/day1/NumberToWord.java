package com.zettamine.java.day1;

public class NumberToWord {
	
	public static String digitToWord(int n) {
		String result = "";
		if(n == 0) return "Zero";
		while(n > 0) {
			int digit = n % 10;
			String s = findWord(digit);
			result = s+" " + result;
			
			n = n/10;
		}
		
		return result;
	}
	
	public static String findWord(int digit) {
		switch(digit) {
		case 0:
			return "zero";
		case 1:
			return "one";
		case 2:
			return "two";
		case 3:
			return "three";
		case 4:
			return "four";
		case 5:
			return "five";
		case 6:
			return "six";
		case 7:
			return "seven";
		case 8:
			return "eight";
		case 9:
			return "nine";
		default:
			return "";
		}
	}

}
