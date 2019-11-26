package com.accenture;

class Book{
	private String author;
	private int pages;
	private String title;
	
	public Book (){
		this("Author unknown", 0, "title not defined");
	}
	
	public Book(String author, int pages, String title){
		this.author = author;
		this.pages = pages;
		this.title = title;
	}
	public Book(String title){
		this.author = "Rainis";
		this.pages = 67;
		this.title = title;
	}
	public Book(String title, int pages){
		this.author = "Aspazija";
		this.pages = pages;
		this.title = title;
	}
	void printStatus(){
		System.out.println("Author: " + this.author + ", No.of pages: " + this.pages + ", title of the book: " + this.title + ".");
	}
}

public class TaskConstructor {

	
	public static void main(String[] args) {
		Book book = new Book();
		book.printStatus();
		
		Book book1 = new Book("Edzus", 54, "Lets go home");
		book1.printStatus();
		
		Book book2 = new Book("Its raining");
		book2.printStatus();
		
		Book book3 = new Book("Computer", 38);
		book3.printStatus();
	}

}
