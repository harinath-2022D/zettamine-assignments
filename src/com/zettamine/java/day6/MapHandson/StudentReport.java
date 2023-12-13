package com.zettamine.java.day6.MapHandson;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class StudentReport {
	
	public static Map<String, Integer> getReport(List<Student> list){
		
		Map<String, Integer> map = new HashMap<>();
		
		for(int i = 0; i < list.size(); i++) {
			Student stu = list.get(i);
			map.put(stu.getLocation(), map.getOrDefault(stu.getLocation(), 0) + 1);
		}
		return map;
	}
}
