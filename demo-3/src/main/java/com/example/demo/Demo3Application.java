package com.example.demo;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.model.Author;
import com.example.demo.model.Book;
import com.example.demo.repository.AuthorRepo;
import com.example.demo.repository.BookRepo;

@SpringBootApplication
public class Demo3Application {

	public static void main(String[] args) {
		SpringApplication.run(Demo3Application.class, args);
	
	
	}
	@Autowired
	BookRepo bookrepo;
	
	@Autowired
	AuthorRepo authorRepo;
	
	@PostConstruct
	public void insertData() {
	Author author1= new Author("Author1","a", "aemail");
	Author author2= new Author("Author2","a2", "aemail2");	
	authorRepo.save(author1);
	authorRepo.save(author2);
	
	Book book1= new Book("book1","b1", author1, 500.2);
	Book book2= new Book("book2","b2", author2, 100.2);
	bookrepo.save(book1);
	bookrepo.save(book2);
	}
}