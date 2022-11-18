package com.Sprint1.day1.question3;

public class Library {
	
	int bookID;
	String BookName;
	String BookAuthor;
	
	
	
	
	public Library() {
		super();
	}




	public Library(int bookID, String bookName, String bookAuthor) {
		super();
		this.bookID = bookID;
		BookName = bookName;
		BookAuthor = bookAuthor;
	}




	public int getBookID() {
		return bookID;
	}




	public void setBookID(int bookID) {
		this.bookID = bookID;
	}




	public String getBookName() {
		return BookName;
	}




	public void setBookName(String bookName) {
		BookName = bookName;
	}




	public String getBookAuthor() {
		return BookAuthor;
	}




	public void setBookAuthor(String bookAuthor) {
		BookAuthor = bookAuthor;
	}




	@Override
	public String toString() {
		return "Library [bookID=" + bookID + ", BookName=" + BookName + ", BookAuthor=" + BookAuthor + "]";
	}
	
	
}
