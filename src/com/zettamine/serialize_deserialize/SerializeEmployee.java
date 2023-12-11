package com.zettamine.serialize_deserialize;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class SerializeEmployee {

	private static final String PATH = "C:\\Users\\Harinath\\Desktop\\CustFolder\\EmployeeData.ser";

	public static void main(String[] args) {
        Map<Employee, Set<Certification>> map = new HashMap<>();
		
		Certification cer1 = new Certification(1213,"JAVA",2);
		Certification cer2 = new Certification(102,"RUBY",1);
		
		Certification cer3 = new Certification(1042,"SQL",5);
		Certification cer4 = new Certification(1281, "JAVA", 2);
		Certification cer5 = new Certification(1059, "C++", 5);
		
		Certification cer6 = new Certification(1102, "C++", 10);
		Certification cer7 = new Certification(1239,"DSA", 2);
		Certification cer8 = new Certification(1314, "PYTHON", 16);
		
		
		Set<Certification> set1 = new HashSet<>();
		set1.add(cer1);
		set1.add(cer2);
		
		
		Set<Certification> set2 = new HashSet<>();
		set2.add(cer3);
		
		Set<Certification> set3 = new HashSet<>();
		set3.add(cer4);
		set3.add(cer5);
		set3.add(cer6);
		set3.add(cer7);
		
		Set<Certification> set4 = new HashSet<>();
		set4.add(cer8);
		
		map.put(new Employee(100,"Arjun",10), set1);
		
		map.put(new ContractEmployee(96, "Virat", 30, 1003), new HashSet<Certification>());
		map.put(new ContractEmployee(95, "Rohit" , 20, 1002), set1);
		map.put(new ContractEmployee(94, "Divi", 20, 1001), set2);
		
		map.put(new RegularEmployee(99, "Jadeja", 10, "PF9998"), new HashSet<Certification>());
		map.put(new RegularEmployee(98,"Ashwin",30,"PF999"), set3);
		map.put(new RegularEmployee(97,"Prasidh", 10, "PF997"), set4);
		
		Set<Map.Entry<Employee, Set<Certification>>> entrySet = map.entrySet();
		
		for(Entry entry : entrySet) {
			System.out.println(entry.getKey()+"--->");
			System.out.println(entry.getValue());
			System.out.println();
		}
		
		
		
		try(
			FileOutputStream fos = new FileOutputStream(PATH);
			ObjectOutputStream oos = new ObjectOutputStream(fos)){
			
			oos.writeObject(map);
			System.out.println("serialization completed........");
			
		}catch(Exception ex) {
			ex.printStackTrace();
		}

	}

}
