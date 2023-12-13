package com.zettamine.java.day5;

import java.io.File;
import java.io.IOException;

public class CreateNewFile {

	public static void main(String[] args) {
		File file = new File("C:\\CJava");
		boolean status = file.mkdir();
		if(status) {
			System.out.println("CJava dir created");
		}else {
			System.out.println("CJava dir already exists");
		}
		
		file = new File(file.getAbsolutePath()+"\\java");
		status = file.mkdirs();
		if(status) {
			System.out.println("sub dir created in CJava");
		}else {
			System.out.println("sub dir java already exists");
		}
		
		file = new File(file.getAbsolutePath()+"\\javanotes2.txt");
		try {
			status = file.createNewFile();
			if(status) {
				System.out.println("new java.txt file created");
			}else {
				System.out.println("java.txt already exists");
			}
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
