package com.example.springdataadvancedquerying;

import com.example.springdataadvancedquerying.model.entity.Book;
import com.example.springdataadvancedquerying.service.AuthorService;
import com.example.springdataadvancedquerying.service.BookService;
import com.example.springdataadvancedquerying.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.io.IOException;
import java.time.LocalDate;
import java.util.Scanner;

@Component
public class CommandLineRunnerImpl implements CommandLineRunner {

    private final CategoryService categoryService;
    private final AuthorService authorService;
    private final BookService bookService;

    @Autowired
    public CommandLineRunnerImpl(CategoryService categoryService, AuthorService authorService, BookService bookService) {
        this.categoryService = categoryService;
        this.authorService = authorService;
        this.bookService = bookService;
    }

    @Override
    public void run(String... args) throws Exception {
        Scanner scan = new Scanner(System.in);

        /* 13.
        int amount = Integer.parseInt(scan.nextLine());
        int  deleted = this.bookService.deleteWithCopiesLessThan(amount);
        System.out.println(deleted);
        */

        /* 12.
        String date = scan.nextLine();
        int amount = Integer.parseInt(scan.nextLine());
        int booksUpdated = this.bookService.addCopiesToBooksAfter(date,amount);
        System.out.println(amount * booksUpdated);
        */

        /* 11.
        String title = scan.nextLine();
        BookSummary summary = this.bookService.getInformationForTitle(title);
        System.out.println(summary.getTitle() + " " + summary.getEditionType() + " " + summary.getAgeRestriction() + " " + summary.getPrice());
        */

        /* 10.
        this.authorService.getWithTotalCopies().forEach(a -> System.out.printf("%s %s - %d%n",a.getFirstName(),a.getLastName(),a.getTotalCopies()));
         */

        /* 9.
        int length = Integer.parseInt(scan.nextLine());
        int totalBooks = this.bookService.countBooksWithTitleLongerThan(length);
        System.out.println(totalBooks);
        */

        /* 8.
        String search = scan.nextLine();
        this.bookService.findByAuthorLastNameStartsWith(search).forEach(b -> System.out.printf("%s (%s %s)%n",b.getTitle(),b.getAuthor().getFirstName(),b.getAuthor().getLastName()));
        */

        /* 7.
        String search = scan.nextLine();
        this.bookService.findAllTitlesContaining(search).forEach(System.out::println);
        */

        /* 6.
        String endsWith = scan.nextLine();
        this.authorService.findByFirstNameEndingWith(endsWith).stream().map(a -> a.getFirstName() + " " + a.getLastName()).forEach(System.out::println);
        */

        /* 5.
        String date = scan.nextLine();
        this.bookService.findBooksReleaseBefore(date).forEach(b -> System.out.printf("%s %s %.2f%n",b.getTitle(),b.getEditionType(),b.getPrice()));
        */

        /* 4.
        int releaseYear = Integer.parseInt(scan.nextLine());
        this.bookService.findNotReleasedIn(releaseYear).forEach(b -> System.out.println(b.getTitle()));
        */

        /* 3.
        this.bookService.findAllWithPriceNotBetween(5,40).forEach(b -> System.out.println(b.getTitle() + " - " + b.getPrice()));
        */

        /* 2.
        this.bookService.findAllTitlesByEditionAndCopies(EditionType.GOLD,5000).forEach(System.out::println);
        */

        /* 1.
        String restriction = scan.nextLine();
        this.bookService.findAllTitlesByAgeRestriction(restriction).forEach(System.out::println);
        */

        //seedData();
        //printAllBooksAfterYear(2000);
        //printAllAuthorsNamesWithBooksWithReleaseDateBeforeYear(1990);
        //printAllAuthorsAndNumberOfTheirBooks();
        //printALlBooksByAuthorNameOrderByReleaseDate("George", "Powell");

    }

    private void printALlBooksByAuthorNameOrderByReleaseDate(String firstName, String lastName) {
        bookService
                .findAllBooksByAuthorFirstAndLastNameOrderByReleaseDate(firstName, lastName)
                .forEach(System.out::println);
    }

    private void printAllAuthorsAndNumberOfTheirBooks() {
        authorService
                .getAllAuthorsOrderByCountOfTheirBooks()
                .forEach(System.out::println);
    }

    private void printAllAuthorsNamesWithBooksWithReleaseDateBeforeYear(int year) {
        bookService
                .findAllAuthorsWithBooksWithReleaseDateBeforeYear(year)
                .forEach(System.out::println);
    }

    private void printAllBooksAfterYear(int year) {
        bookService
                .findAllBooksAfterYear(year)
                .stream()
                .map(Book::getTitle)
                .forEach(System.out::println);
    }

    private void seedData() throws IOException {
        categoryService.seedCategories();
        authorService.seedAuthors();
        bookService.seedBooks();
    }
}
