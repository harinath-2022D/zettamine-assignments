package com.zettamine.java.day6;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class CountOfEachWord {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter student's Articles: ");
		String article = sc.nextLine();
		sc.close();
		
		String[] arr = article.split("[.,;:!? ]+");
//Hello everybody, welcome to collection in JAVA. Collection is like a container and powerful concept in Java!
		System.out.println("Total words: " + arr.length);
		Map<String, Integer> freMap = new TreeMap<>();
		for(String str : arr) {
			freMap.put(str.toLowerCase(), freMap.getOrDefault(str.toLowerCase(), 0)+1);
		}
		
		System.out.println("words       :    count");
		System.out.println("-".repeat(30));
		for(Map.Entry<String, Integer> entry : freMap.entrySet()) {
			
			System.out.printf("%-20s %d\n",entry.getKey(), entry.getValue());
		}
		
		
	}

}
