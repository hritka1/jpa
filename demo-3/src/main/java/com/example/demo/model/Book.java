package com.example.demo.model;


import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class Book {

	@Id
	@GeneratedValue
	private Long id;
	private String title;
	private String publisher;
	
	@OneToOne
	private Author author;
	private Double price;
	public Long getId() {
		return id;
	}
	@OneToMany(mappedBy="author")
	private List<Book> books;
	
	public List<Book> getBooks(){
		return books;
	}
	
	public void setId(Long id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getPublisher() {
		return publisher;
	}
	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}
	public Author getAuthor() {
		return author;
	}
	public void setAuthor(Author author) {
		this.author = author;
	}
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
	public Book(String title, String publisher, Author author, Double price) {
		super();
	
		this.title = title;
		this.publisher = publisher;
		this.author = author;
		this.price = price;
	}
	public Book() {
		super();
	}

	@Override
	public String toString() {
		return "Book [id=" + id + ", title=" + title + ", publisher=" + publisher + ", author=" + author + ", price="
				+ price + ", books=" + books + "]";
	}
	
	
}

