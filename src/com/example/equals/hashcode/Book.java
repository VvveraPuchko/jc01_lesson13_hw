package com.example.equals.hashcode;

import java.util.Objects;

public class Book {
	private int id;
	private String title;
	private String author;
	private double price;
	private String publisher;
	private int publicationYear;
	private int numberOfPages;
	private String coverType;

	public Book() {
	}

	public Book(int id, String title, String author, double price) {

		super();
		this.id = id;
		this.title = title;
		this.author = author;
		this.price = price;
	}
	
	public Book(int id, String title, String author, double price, String publisher,
			    int publicationYear, int numberOfPages,String coverType) {

		this.id = id;
		this.title = title;
		this.author = author;
		this.price = price;
		this.coverType = coverType;
		this.numberOfPages = numberOfPages;
		this.publicationYear = publicationYear;
		this.publisher = publisher;
	}

	@Override
	public String toString() {
		return "Book [id=" + id + ", title=" + title + ", author=" + author + ", price=" + price + ", publisher="
				+ publisher + ", publicationYear=" + publicationYear + ", numberOfPages=" + numberOfPages
				+ ", coverType=" + coverType + "]";
	}

	public String getPublisher() {
		return publisher;
	}

	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}

	public int getPublicationYear() {
		return publicationYear;
	}

	public void setPublicationYear(int publicationYear) {
		this.publicationYear = publicationYear;
	}

	public int getNumberOfPages() {
		return numberOfPages;
	}

	public void setNumberOfPages(int numberOfPages) {
		this.numberOfPages = numberOfPages;
	}

	public String getCoverType() {
		return coverType;
	}

	public void setCoverType(String coverType) {
		this.coverType = coverType;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	@Override
	public int hashCode() {
		return Objects.hash(author, id, price, title);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Book other = (Book) obj;
		return Objects.equals(author, other.author) && id == other.id
				&& Double.doubleToLongBits(price) == Double.doubleToLongBits(other.price)
				&& Objects.equals(title, other.title);
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
}
