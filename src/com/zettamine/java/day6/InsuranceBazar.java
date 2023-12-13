package com.zettamine.java.day6;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class InsuranceBazar {
	
	private static Scanner sc = new Scanner(System.in);
	private static Map<Integer, String> map = new HashMap<>();
	
	public static void main(String[] args) {
		addPolicyDetails();
	}
	private static void addPolicyDetails() {
		System.out.print("Enter no of policies: ");
		int noOfPolicies = sc.nextInt();
		
		while(noOfPolicies > 0) {
			
			System.out.print("Enter policy Id: ");
			int id = sc.nextInt();
			
			sc.nextLine();
			System.out.print("Enter policy name: ");
			String name = sc.nextLine();
			System.out.println();
			
			map.put(id,  name.toLowerCase());
			
			noOfPolicies--;
		}// while close
		
		System.out.print("Enter policy name to be search: ");
		String policyName = sc.nextLine();
		
		searchPolicy(policyName);
	}
	private static void searchPolicy(String policyName) {
		policyName = policyName.trim().toLowerCase();
		
		for(Integer key : map.keySet()) {
			String policy = map.get(key);
			if(policy.contains(policyName)) {
				System.out.println(key);
			}
		}
		
	}

}
