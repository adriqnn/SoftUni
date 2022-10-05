package com.example.springdataintro;

import com.example.springdataintro.entities.Author;
import com.example.springdataintro.entities.Book;
import com.example.springdataintro.repositories.AuthorRepository;
import com.example.springdataintro.repositories.BookRepository;
import com.example.springdataintro.services.SeedService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.util.List;

@Component
public class ConsoleRunner implements CommandLineRunner {

    /*@Autowired
    private SeedService seedService;*/

    private final SeedService seedService;
    private final BookRepository bookRepository;
    private final AuthorRepository authorRepository;

    @Autowired
    public ConsoleRunner(SeedService seedService, BookRepository bookRepository, AuthorRepository authorRepository){
        this.seedService = seedService;
        this.bookRepository = bookRepository;
        this.authorRepository = authorRepository;
    }

    private void booksAfter2000(){
        LocalDate year2000 = LocalDate.of(2000,12,31);
        List<Book> books = this.bookRepository.findByReleaseDateAfter(year2000);
        books.forEach(b -> System.out.println(b.getTitle()));
        int count = this.bookRepository.countByReleaseDateAfter(year2000);
        System.out.println("Total count: " + count);
    }

    private void allAuthorsWithBookBefore1990() {
        LocalDate year1990 = LocalDate.of(1990, 1, 1);
        List<Author> authors = this.authorRepository.findDistinctByBooksReleaseDateBefore(year1990);

        authors.forEach(a -> System.out.println(a.getFirstName() + " " + a.getLastName()));
        System.out.println(authors.size());
    }
    private void allAuthorsOrderedByBookCount() {
        List<Author> authors = this.authorRepository.findAll();

        authors.stream().sorted((l, r) -> r.getBooks().size() - l.getBooks().size()).forEach(author ->
                System.out.printf("%s %s -> %d%n", author.getFirstName(), author.getLastName(), author.getBooks().size()));

        /*authors.stream().sorted(Comparator.comparingInt(a -> a.getBooks().size())).forEach(author ->
                System.out.printf("%s %s -> %d%n", author.getFirstName(), author.getLastName(), author.getBooks().size()));*/
    }

    @Override
    //@Transactional - can be used instead of fetch type
    public void run(String... args) throws Exception {
        //this.seedService.seedAuthors();
        //this.seedService.seedCategories();
        //this.seedService.seedAll();
        //this.booksAfter2000();
        //this.allAuthorsWithBookBefore1990();
        this.allAuthorsOrderedByBookCount();
    }

}
