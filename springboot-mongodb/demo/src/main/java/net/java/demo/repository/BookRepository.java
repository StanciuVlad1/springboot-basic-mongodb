package net.java.demo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import net.java.demo.model.Book;
public interface BookRepository extends MongoRepository<Book,Integer> {
}
