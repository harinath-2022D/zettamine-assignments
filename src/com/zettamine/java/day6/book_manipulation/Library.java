package com.zettamine.java.day6.book_manipulation;

import java.util.ArrayList;
import java.util.List;

public class Library {
	private List<Book> booksList ;
	
	public Library() {
		this.booksList = new ArrayList<>();
	}
	
	public void addBook(Book obj) {
		booksList.add(obj);
	}
	
	public boolean isEmpty() {
		if(booksList.size() == 0) {
			return true;
		}
		return false;
	}
	
	public List<Book> viewAllBooks(){
		List<Book> list = new ArrayList<>();
		for(Book b : booksList) {
			list.add(b);
		}
		return list;
	}
	
	public List<Book> viewBooksByAuthor(String aName){
		List<Book> list = new ArrayList<>();
		for(Book b : booksList) {
			if(b.getAuthor().equals(aName)) {
			   list.add(b);
			}
		}
		return list;
	}
	
	public int countNoBooks(String bName) {
		int count = 0;
		for(Book b : booksList) {
			if(b.getBookName().equals(bName)) {
				count++;
			}
		}
		return count;
	}
}
