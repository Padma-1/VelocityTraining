package com.wipro.demo.repository;
import com.wipro.demo.model.Book;
import org.springframework.data.mongodb.repository.MongoRepository;
public interface BookRepository extends MongoRepository<Book, Integer>{

}
