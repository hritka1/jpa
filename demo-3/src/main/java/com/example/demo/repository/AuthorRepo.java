package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.Author;

@Repository
public interface AuthorRepo extends JpaRepository<Author, Long>{
	
	List<Author> findByLastNameIgnoreCase(String lastName);
	
	List<Author> findByLastNameOrderByFirstNameAsc(String lastName);
}
