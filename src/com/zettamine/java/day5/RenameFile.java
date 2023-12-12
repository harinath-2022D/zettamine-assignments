package com.zettamine.java.day5;

import java.io.File;
import java.util.Scanner;

public class RenameFile {

	public static void main(String[] args) {
		File file = new File("C:\\CJava\\java\\java.txt");
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter new file name: ");
		var newFileName = sc.next();
		System.out.print("Enter extension of new file: ");
		String ext = sc.next();
		
		File renameFile = new File(file.getParentFile()+"\\"+newFileName+"."+ext);
		if(file.renameTo(renameFile)) {
			System.out.println("file name changed");
		}else {
			System.out.println("there is no file with path: "+ file.getAbsolutePath());
		}
		
		
		

	}

}
