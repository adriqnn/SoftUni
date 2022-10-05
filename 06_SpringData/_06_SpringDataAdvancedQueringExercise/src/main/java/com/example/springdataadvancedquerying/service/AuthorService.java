package com.example.springdataadvancedquerying.service;

import com.example.springdataadvancedquerying.model.entity.Author;
import com.example.springdataadvancedquerying.model.entity.AuthorNamesWithTotalCount;

import java.io.IOException;
import java.util.List;

public interface AuthorService {
    void seedAuthors() throws IOException;

    Author getRandomAuthor();

    List<String> getAllAuthorsOrderByCountOfTheirBooks();

    List<Author> findByFirstNameEndingWith(String endsWith);

    List<AuthorNamesWithTotalCount> getWithTotalCopies();
}

