package com.library.service;

import com.library.repository.BookRepository;

public class BookService {

    private BookRepository repository;

    // Constructor Injection
    public BookService(BookRepository repository) {
        this.repository = repository;
    }

    // Setter Injection
    public void setRepository(BookRepository repository) {
        this.repository = repository;
    }

    public void showBooks() {

        System.out.println("Book Service Called");

        repository.display();
    }
}