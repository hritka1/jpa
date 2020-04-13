package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.Author;
import com.example.demo.model.Book;

@Repository
public interface BookRepo extends JpaRepository<Book, Long> {

	 List<Book> findByTitle(String title);
	 
	 List<Book> findByPriceGreaterThan(Double price);

	 //List<Book> findbyAuthorByFirstName(String name);
	 
	 //List<Book> find
}
