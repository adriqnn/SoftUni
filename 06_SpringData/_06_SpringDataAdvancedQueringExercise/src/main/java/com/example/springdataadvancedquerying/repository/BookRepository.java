package com.example.springdataadvancedquerying.repository;

import com.example.springdataadvancedquerying.model.entity.AgeRestriction;
import com.example.springdataadvancedquerying.model.entity.Book;
import com.example.springdataadvancedquerying.model.entity.BookSummary;
import com.example.springdataadvancedquerying.model.entity.EditionType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

@Repository
public interface BookRepository extends JpaRepository<Book, Long> {

    List<Book> findAllByReleaseDateAfter(LocalDate releaseDateAfter);

    List<Book> findAllByReleaseDateBefore(LocalDate releaseDateBefore);

    List<Book> findAllByAuthor_FirstNameAndAuthor_LastNameOrderByReleaseDateDescTitle(String author_firstName, String author_lastName);

    List<Book> findByAgeRestriction(AgeRestriction restriction);

    @Query("SELECT b.title FROM Book b WHERE b.ageRestriction = :ageRestriction")
    List<String> findTitleByAgeRestriction(AgeRestriction ageRestriction);

    List<Book> findByEditionTypeAndCopiesLessThan(EditionType type, int copies);

    List<Book> findByPriceLessThanOrPriceGreaterThan(BigDecimal lowerBound, BigDecimal upperBound);

    List<Book> findByReleaseDateBeforeOrReleaseDateAfter(LocalDate before,LocalDate after);

    List<Book> findByTitleContaining(String search);

    List<Book> findByAuthorLastNameStartingWith(String search);

    @Query("SELECT count(b) FROM Book b WHERE length( b.title) > :length")
    int countBooksWithTitleLongerThan(int length);

    @Query("SELECT b.title AS title, b.editionType AS editionType, b.ageRestriction AS ageRestriction, b.price AS price FROM Book b" +
            " WHERE b.title = :title")
    BookSummary findSummaryForTitle(String title);

    @Modifying
    @Transactional
    //if it's a query it needs to be specified if it's modifying
    @Query("Update Book b Set b.copies = b.copies + :amount WHERE b.releaseDate > :date")
    int addCopiesToBooksAfter(LocalDate date, int amount);

    //when spring is doing the query modifying is not needed;
    @Transactional
    int deleteByCopiesLessThan(int amount);
}

