package com.ext.info.controller;

import com.ext.info.record.Book;
import com.ext.info.repository.BookRepository;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.graphql.data.method.annotation.SchemaMapping;
import org.springframework.stereotype.Controller;

import java.util.List;

@Controller
public class BookController {

    private final BookRepository bookRepository;

    public BookController(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

//    public List<Book> findAll() {
//        return bookRepository.findAll();
//    }

//    @SchemaMapping(typeName = "Query",value = "allBooks") //allBooks: [Book]
//    public List<Book> findAll() {
//        return bookRepository.findAll();
//    }

//    @SchemaMapping(typeName = "Query", value="findOne")
//    public Book findOne(@Argument Integer id) {
//        return bookRepository.findOne(id);
//    }

    @QueryMapping
    public List<Book> allBooks() { ////allBooks: [Book]
        return bookRepository.findAll();
    }

    @QueryMapping
    public Book findOne(@Argument Integer id) { // findOne(id: ID!): should be same
        return bookRepository.findOne(id);
    }
}