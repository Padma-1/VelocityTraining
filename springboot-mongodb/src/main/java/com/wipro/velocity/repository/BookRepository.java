package com.wipro.velocity.repository;

import com.wipro.velocity.model.Book;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface BookRepository extends MongoRepository<Book, Integer>{

}
