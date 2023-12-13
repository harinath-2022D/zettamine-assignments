package com.zettamine.java.day6.book_manipulation;

public class Book {
	
	private long isbnNo;
	private String bookTitle;
	private String bookAuthor;
	
	public Book(long No, String title, String author) {
		super();
		this.isbnNo = No;
		this.bookTitle = title;
		this.bookAuthor = author;
	}
	
	public String getAuthor() {
		return bookAuthor;
	}
	public String getBookName() {
		return bookTitle;
	}

	@Override
	public String toString() {
		return "Book [isbnNo=" + isbnNo + ", bookTitle=" + bookTitle + ", bookAuthor=" + bookAuthor + "]";
	}
}
