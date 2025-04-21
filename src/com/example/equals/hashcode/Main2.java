package com.example.equals.hashcode;

import java.util.List;
import java.util.ArrayList;

public class Main2 {

	public static void main(String[] args) {
		Book b1 = new Book(1, "TestBook", "TestAuthor", 70, "Test Publisher", 1990, 542, "Test Cover");
		Book b2 = new Book(2, "C++", "Straustrup", 300, "Test Publisher",1995, 673, "Test Cover2");
		Book b3 = new Book(3, "TestBook2", "TestAuthor", 54, "Test Publisher 2", 1992, 130, "Test Cover3");
		
		List<Book> books = new ArrayList<Book>();
		
		books.add(b1);
		books.add(b2);
		books.add(b3);
				
		Library library = new Library(books);
		
		List<Book> booksByAuthor = library.booksOfOnePublisher("Test Publisher");
		
		library.printBooks(booksByAuthor);
		

	}

}
