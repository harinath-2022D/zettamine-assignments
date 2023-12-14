package com.zettamine.java.day6;

import java.util.Comparator;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetAssignment {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Set<String> set = new TreeSet<>(sort());
		
		System.out.print("Enter name: ");
		String name = sc.nextLine();
		set.add(name);
		while(true) {
		System.out.print("Dou you want to add more names [Y/N]: ");
		String option = sc.next();
		if(!option.equalsIgnoreCase("y")) {
			break;
		}else {
			sc.nextLine();
			System.out.print("Enter name: ");
			name = sc.nextLine();
			set.add(name);
		}
		}
		
		int i = 1;
		for(String str : set) {
			System.out.println(i++ +". " + str);
		}
		
	}
	
	public static Comparator<String> sort(){
		return new Comparator<String>() {

			@Override
			public int compare(String o1, String o2) {
				if(o1.length() == o2.length()) {
					return o1.compareTo(o2);
				}else {
					return o1.length() - o2.length();
				}
			}
			
		};
	}

}
