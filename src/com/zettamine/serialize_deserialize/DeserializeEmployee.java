package com.zettamine.serialize_deserialize;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

public class DeserializeEmployee {

	private static final String PATH = "C:\\Users\\Harinath\\Desktop\\CustFolder\\EmployeeData.ser";

	public static void main(String[] args) {
		
		Map<Employee, Set<Certification>> map;
		
		try(FileInputStream fis = new FileInputStream(PATH); 
				ObjectInputStream ois = new ObjectInputStream(fis);){
			try {
				map = (Map<Employee, Set<Certification>>) ois.readObject();
				Set<Map.Entry<Employee, Set<Certification>>> entrySet = map.entrySet();
				
				for(Entry entry : entrySet) {
					System.out.println(entry.getKey()+"--->");
					System.out.println(entry.getValue());
					System.out.println();
				}
				
				System.out.println("Deserialization completed......");
			} catch (ClassNotFoundException e) {
				e.printStackTrace();
			}
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
