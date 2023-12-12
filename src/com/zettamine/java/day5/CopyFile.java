package com.zettamine.java.day5;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class CopyFile {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter source file path: ");
		String source = sc.next();  // C:\\CJava\\java\\javanotes.txt
		System.out.print("Enter destinatioin file path: ");
		String dest = sc.next();   // C:\\CJava\\java\\javanotes1.txt
		 
		try(FileInputStream fis = new FileInputStream(source);
			FileOutputStream fos = new FileOutputStream(dest);){
			int ch = fis.read(); // read byte 
			while(ch  != -1) {
				fos.write(ch);
				ch = fis.read();
			}
			System.out.println("New file is created at destination");
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		sc.close();

	}

}
