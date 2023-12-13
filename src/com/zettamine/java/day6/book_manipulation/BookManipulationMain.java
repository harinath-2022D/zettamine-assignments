package com.zettamine.java.day6.book_manipulation;

import java.util.List;
import java.util.Scanner;

public class BookManipulationMain {
	
	private static Library lib = new Library();
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while(true) {
		printOptions();
		
		
		System.out.print("Enter option: ");
		int option = sc.nextInt();
		
		switch(option) {
		case 1:
			System.out.print("Enter isbnNo: ");
			long isbnNo = sc.nextLong();
			
			System.out.print("Enter Book Title: ");
			String title = sc.nextLine();
			
			sc.nextLine();
			System.out.print("Enter Book Author: ");
			String author = sc.nextLine();
			
			Book book = new Book(isbnNo,title,author);
			lib.addBook(book);
			System.out.print("Book added");
			break;
		case 2:
			List<Book> allBooks = lib.viewAllBooks();
			for(Book b : allBooks) {
				System.out.println(b);
			}
			break;
		case 3:
			sc.nextLine();
			System.out.print("Enter Autor Name: ");
			String authorName = sc.nextLine();
			List<Book> authorBooks = lib.viewBooksByAuthor(authorName);
			if(authorBooks.size() > 0) {
			for(Book b : authorBooks) {
				System.out.println(b);
			}
			}else {
				System.out.print("None of the book published by the author "+authorName);
			}
			break;
		case 4:
			sc.nextLine();
			System.out.print("Enter Book Name: ");
			String bookName = sc.nextLine();
			
			int count = lib.countNoBooks(bookName);
			System.out.print("Number of Books " + bookName +"---> " + count);
			break;
		case 5:
			System.exit(0);
		default:
			System.err.println("Invalid option ----  TRY AGIAN ----");
			break;
			
		}
		
		}// while
	}

	private static void printOptions() {
		System.out.println("1. Add Book\n"
				+ "2. Display all Book Details\n"
				+ "3. Search Book by Author\n"
				+ "4. Count Number of books - by book name\n"
				+ "5. Exit\n"
				);
		
	}

}
