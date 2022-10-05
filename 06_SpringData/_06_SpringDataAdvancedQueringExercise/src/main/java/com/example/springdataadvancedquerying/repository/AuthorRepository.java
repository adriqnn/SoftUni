package com.example.springdataadvancedquerying.repository;

import com.example.springdataadvancedquerying.model.entity.Author;
import com.example.springdataadvancedquerying.model.entity.AuthorNamesWithTotalCount;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AuthorRepository extends JpaRepository<Author, Long> {

    @Query("SELECT a FROM Author a ORDER BY a.books.size DESC")
    List<Author> findAllByBooksSizeDESC();

    List<Author> findByFirstNameEndingWith(String endsWith);

    @Query("SELECT a.firstName AS firstName, a.lastName as lastName, sum(b.copies) AS totalCopies FROM Author a" +
            " JOIN a.books AS b" +
            " GROUP BY b.author" +
            " ORDER BY totalCopies DESC")
    List<AuthorNamesWithTotalCount> getWithTotalCopies();
}

