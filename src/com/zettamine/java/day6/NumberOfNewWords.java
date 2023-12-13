package com.zettamine.java.day6;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class NumberOfNewWords {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter student's Articles: ");
		String article = sc.nextLine();
		sc.close();
		
		String[] arr = article.split("[.,;:!? ]+");

		System.out.println("Total words: " + arr.length);
		Map<String, Integer> freMap = new TreeMap<>();
		for(String str : arr) {
			freMap.put(str.toLowerCase(), freMap.getOrDefault(str.toLowerCase(), 0)+1);
		}
		System.out.println("unique words: " +freMap.size());
		System.out.println("The Words are: ");
		int count = 0;
		for(String key : freMap.keySet()) {
			System.out.println(++count +" " + key);
		}
		
		
	}

}
