package com.zettamine.java.day5;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.Scanner;

public class SerializeProduct {
	
	private static final String PATH = "C:\\Users\\Harinath\\Desktop\\CustFolder\\Stocks.ser";
	private static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		FileOutputStream fos = null;
		ObjectOutputStream oos = null;
		Product pro = null;
		try {
			
			fos = new FileOutputStream(PATH);
			oos = new ObjectOutputStream(fos);
			
			
			System.out.print("Enter no of products: ");
			int noOfProducts = sc.nextInt();
			sc.nextLine();
			while(noOfProducts != 0) {
			System.out.print("Enter product id & product name of Product-2: ");
			String productInfo = sc.nextLine();
			
			String[] arr = productInfo.split(" ");
			 
			oos.writeObject(new Product(Integer.parseInt(arr[0]), arr[1]));
			noOfProducts--;
			}
			
			System.out.println("Serialization completed......");
			sc.close();
			
			oos.writeObject(pro);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			try {
				fos.close();
				oos.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
			
		}
		

	}

}
