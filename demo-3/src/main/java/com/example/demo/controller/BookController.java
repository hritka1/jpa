package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Author;
import com.example.demo.model.Book;
import com.example.demo.repository.AuthorRepo;
import com.example.demo.repository.BookRepo;

@RestController
@RequestMapping("/books")
public class BookController {

	@Autowired
	BookRepo bookrepo;
	
	@Autowired
	AuthorRepo authorrepo;
	
	@GetMapping("/")
	public List<Book> getBooks(){
	
	 for(Book book:bookrepo.findAll()) 
	 { 
		 System.out.println(book); 
		 }
		 
		return bookrepo.findAll();	
	}
	
	@GetMapping("/findByTitle/{title}")
	 public List<Book> getByTitle(@PathVariable(name ="title") String title){
		return bookrepo.findByTitle(title);
	}
	
	@GetMapping("/findByPrice/{price}")
	public List<Book> getByTitle(@PathVariable(name="price") Double price){
		return bookrepo.findByPriceGreaterThan(price);
	}
	
	
	/*
	 * @GetMapping("findByAuthor/{author}") public List<Book>
	 * getByAuthor(@PathVariable(name="author") String author){ return
	 * bookrepo.findbyAuthorByFirstName(author); }
	 */
	
	
	@RequestMapping(value = "/", method = RequestMethod.POST)
	public ResponseEntity<Book> createauthor(@RequestBody Book bookToBeCreated) {

		Book newlyCreatedBook = bookrepo.save(bookToBeCreated);
		ResponseEntity response = new ResponseEntity<Book>(newlyCreatedBook, HttpStatus.CREATED);
		return response;
	}
}
