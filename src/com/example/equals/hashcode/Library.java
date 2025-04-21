package com.example.equals.hashcode;

import java.util.List;
import java.util.ArrayList;

public class Library {
	private List<Book> books;
	
	public Library() {
		books = new ArrayList<Book>();
	}
	
	public Library(List<Book> books) {
		this.books = books;
	}
	
	public boolean add(Book b) {
		return books.add(b);
	}
	
	public boolean delete(int idBook) {
		int deleteIndex = -1;
		
		for(int i = 0;i < books.size(); i++) {
			Book b = books.get(i);
			
			if(b.getId() == idBook) {
				deleteIndex = i;
				break;
			}		
		}
		
		if (deleteIndex < 0) {
			return false;
		}

		books.remove(deleteIndex);
		return true;
	}
	
	public List<Book> booksByAuthor(String author){
		
		List<Book> booksByAuthorList = new ArrayList<Book>();
		for(int i = 0; i < books.size(); i++) {
			Book b = books.get(i);
			
			if(b.getAuthor().equals(author)) {
				booksByAuthorList.add(b);
			}
		}
		
		return booksByAuthorList;
	}
	
	public List<Book> booksOfOnePublisher(String publisher){
		
		List<Book> booksByPublisherList = new ArrayList<Book>();
		for(int i = 0; i < books.size(); i++) {
			Book b = books.get(i);
			
			if(b.getPublisher().equals(publisher)) {
				booksByPublisherList.add(b);
			}
		}
		
		return booksByPublisherList;
	}
	
	public List<Book> booksAfterYear(int year){
		
		List<Book> booksAfterYearList = new ArrayList<Book>();
		
		for(int i = 0; i < books.size(); i++) {
			Book b = books.get(i);
			
			if(b.getPublicationYear() >= year) {
				booksAfterYearList.add(b);
			}
			
		}
		
		return booksAfterYearList;
	}
	
	public void printBooks(List<Book> books) {
		for(int i = 0; i < books.size(); i++) {
			System.out.println(books.get(i));
		}
	}

}
