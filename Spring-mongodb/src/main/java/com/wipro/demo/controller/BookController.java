package com.wipro.demo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.wipro.demo.model.Book;
import com.wipro.demo.repository.BookRepository;

@RestController
public class BookController {
	
	@Autowired
	private BookRepository brepo;
	
	@PostMapping("/addBook")
	public String saveBook(@RequestBody Book book) {
		brepo.save(book);
		return "Book Added Successfully with Id";		
	}
	@GetMapping("/findAllBooks")
	public List<Book> getBooks(){
		return brepo.findAll();
	}
	@GetMapping("/findAllBooks/{id}")
	public Optional<Book>getBook(@PathVariable int id){
		return brepo.findById(id);
	}
	
	@DeleteMapping("/deleteBook/{id}")
	public String deleteBook(@PathVariable int id) {
		brepo.deleteById(id);
		return "book deleted Successully";
				
	}
	
}
