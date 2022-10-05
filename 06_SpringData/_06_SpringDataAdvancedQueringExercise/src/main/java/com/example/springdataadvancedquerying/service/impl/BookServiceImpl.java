package com.example.springdataadvancedquerying.service.impl;

import com.example.springdataadvancedquerying.model.entity.*;
import com.example.springdataadvancedquerying.repository.BookRepository;
import com.example.springdataadvancedquerying.service.AuthorService;
import com.example.springdataadvancedquerying.service.BookService;
import com.example.springdataadvancedquerying.service.CategoryService;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.math.BigDecimal;
import java.nio.file.Files;
import java.nio.file.Path;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

@Service
public class BookServiceImpl implements BookService {

    private static final String BOOKS_FILE_PATH = "src/main/resources/files/books.txt";

    private final BookRepository bookRepository;
    private final AuthorService authorService;
    private final CategoryService categoryService;

    public BookServiceImpl(BookRepository bookRepository, AuthorService authorService, CategoryService categoryService) {
        this.bookRepository = bookRepository;
        this.authorService = authorService;
        this.categoryService = categoryService;
    }

    @Override
    public List<String> findAllTitlesByAgeRestriction(String ageRestriction) {
        AgeRestriction restriction = AgeRestriction.valueOf(ageRestriction.toUpperCase());
        //1.
        return this.bookRepository.findByAgeRestriction(restriction).stream().map(Book::getTitle).collect(Collectors.toList());

        //1.
        //return this.bookRepository.findTitleByAgeRestriction(restriction);
    }

    @Override
    public List<String> findAllTitlesByEditionAndCopies(EditionType type, int copies) {
        //2.
        return this.bookRepository.findByEditionTypeAndCopiesLessThan(type,copies).stream().map(Book::getTitle).collect(Collectors.toList());
    }

    @Override
    public List<Book> findAllWithPriceNotBetween(double lowerBound, double upperBound) {
        //3.
        return this.bookRepository.findByPriceLessThanOrPriceGreaterThan(BigDecimal.valueOf(lowerBound),BigDecimal.valueOf(upperBound));
    }

    @Override
    public List<Book> findNotReleasedIn(int releaseYear) {
        LocalDate beforeYear = LocalDate.of(releaseYear,1,1);
        LocalDate afterYear = LocalDate.of(releaseYear,12,31);

        return this.bookRepository.findByReleaseDateBeforeOrReleaseDateAfter(beforeYear,afterYear);
    }

    @Override
    public List<Book> findBooksReleaseBefore(String date) {
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        LocalDate before = LocalDate.parse(date,dateTimeFormatter);
        return this.bookRepository.findAllByReleaseDateBefore(before);
    }

    @Override
    public List<String> findAllTitlesContaining(String search) {
        return this.bookRepository.findByTitleContaining(search).stream().map(Book::getTitle).collect(Collectors.toList());
    }

    @Override
    public List<Book> findByAuthorLastNameStartsWith(String search) {
        return this.bookRepository.findByAuthorLastNameStartingWith(search);
    }

    @Override
    public int countBooksWithTitleLongerThan(int length) {
        return this.bookRepository.countBooksWithTitleLongerThan(length);
    }

    @Override
    public BookSummary getInformationForTitle(String title) {
        return this.bookRepository.findSummaryForTitle(title);
    }

    @Override
    public int addCopiesToBooksAfter(String date, int amount) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd MMM yyyy");
        LocalDate after = LocalDate.parse(date,formatter);
        return this.bookRepository.addCopiesToBooksAfter(after, amount);
    }

    @Override
    public int deleteWithCopiesLessThan(int amount) {
        return this.bookRepository.deleteByCopiesLessThan(amount);
    }


    @Override
    public void seedBooks() throws IOException {
        if (bookRepository.count() > 0) {
            return;
        }

        Files
                .readAllLines(Path.of(BOOKS_FILE_PATH))
                .forEach(row -> {
                    String[] bookInfo = row.split("\\s+");

                    Book book = createBookFromInfo(bookInfo);

                    bookRepository.save(book);
                });
    }

    @Override
    public List<Book> findAllBooksAfterYear(int year) {
        return bookRepository
                .findAllByReleaseDateAfter(LocalDate.of(year, 12, 31));
    }

    @Override
    public List<String> findAllAuthorsWithBooksWithReleaseDateBeforeYear(int year) {
        return bookRepository
                .findAllByReleaseDateBefore(LocalDate.of(year, 1, 1))
                .stream()
                .map(book -> String.format("%s %s", book.getAuthor().getFirstName(),
                        book.getAuthor().getLastName()))
                .distinct()
                .collect(Collectors.toList());
    }

    @Override
    public List<String> findAllBooksByAuthorFirstAndLastNameOrderByReleaseDate(String firstName, String lastName) {
        return bookRepository
                .findAllByAuthor_FirstNameAndAuthor_LastNameOrderByReleaseDateDescTitle(firstName, lastName)
                .stream()
                .map(book -> String.format("%s %s %d",
                        book.getTitle(),
                        book.getReleaseDate(),
                        book.getCopies()))
                .collect(Collectors.toList());
    }


    private Book createBookFromInfo(String[] bookInfo) {
        EditionType editionType = EditionType.values()[Integer.parseInt(bookInfo[0])];
        LocalDate releaseDate = LocalDate
                .parse(bookInfo[1], DateTimeFormatter.ofPattern("d/M/yyyy"));
        Integer copies = Integer.parseInt(bookInfo[2]);
        BigDecimal price = new BigDecimal(bookInfo[3]);
        AgeRestriction ageRestriction = AgeRestriction
                .values()[Integer.parseInt(bookInfo[4])];
        String title = Arrays.stream(bookInfo)
                .skip(5)
                .collect(Collectors.joining(" "));

        Author author = authorService.getRandomAuthor();
        Set<Category> categories = categoryService
                .getRandomCategories();

        return new Book(editionType, releaseDate, copies, price, ageRestriction, title, author, categories);

    }
}