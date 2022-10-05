package com.example.springdataadvancedquerying.service;

import com.example.springdataadvancedquerying.model.entity.Book;
import com.example.springdataadvancedquerying.model.entity.BookSummary;
import com.example.springdataadvancedquerying.model.entity.EditionType;

import java.io.IOException;
import java.util.List;

public interface BookService {
    void seedBooks() throws IOException;

    List<Book> findAllBooksAfterYear(int year);

    List<String> findAllAuthorsWithBooksWithReleaseDateBeforeYear(int year);

    List<String> findAllBooksByAuthorFirstAndLastNameOrderByReleaseDate(String firstName, String lastName);

    List<String> findAllTitlesByAgeRestriction(String ageRestriction);

    List<String> findAllTitlesByEditionAndCopies(EditionType type, int copies);

    List<Book> findAllWithPriceNotBetween(double lowerBound, double upperBound);

    List<Book> findNotReleasedIn(int releaseYear);

    List<Book> findBooksReleaseBefore(String date);

    List<String> findAllTitlesContaining(String search);

    List<Book> findByAuthorLastNameStartsWith(String search);

    int countBooksWithTitleLongerThan(int length);

    BookSummary getInformationForTitle(String title);

    int addCopiesToBooksAfter(String date, int amount);

    int deleteWithCopiesLessThan(int amount);
}




