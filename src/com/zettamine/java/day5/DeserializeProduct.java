package com.zettamine.java.day5;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.Scanner;

public class DeserializeProduct {
	
	private static Scanner sc = new Scanner(System.in);
	private static final String PATH = "C:\\Users\\Harinath\\Desktop\\CustFolder\\Stocks.ser";
	
	public static void main(String[] args) {
		
		FileInputStream fis;
		ObjectInputStream ois;

		Product pro = null;
		
		ArrayList<Product> list = new ArrayList<>();

		try {
			fis = new FileInputStream(PATH);
			ois = new ObjectInputStream(fis);

			try {
				while (true) {
					pro = (Product)ois.readObject();
					if(pro != null)
					  list.add(pro);
				}

			} catch (EOFException ex) {
				// ex.printStackTrace();
			}
			
			if(list.size()  == 0) {
				System.out.println("No products are available in stocks");
			}else {
				System.out.print("Enter Product Id: ");
				int productId = sc.nextInt();
				boolean result = false;
				for(Product p : list) {
					if(p.getId() == productId) {
						System.out.println("Product name: " + p.getProductName());
						result = true;
					}
				}
				
				if(result == false) {
					System.out.println("Product id not found");
				}
				
				
			}

			ois.close();
			fis.close();
		} catch (FileNotFoundException e) {
			System.out.println("stocks file not found");
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

}
