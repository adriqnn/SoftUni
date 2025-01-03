package _03_JavaAdvanced._09_IteratorsAndComparators._01_02_03_04_Book;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Book implements Comparable<Book>{
    private String title;
    private int year;
    private List<String> authors;

    public Book(String title, int year, String... authors){
        this.setTitle(title);
        this.setYear(year);
        this.setAuthors(authors);
    }

    public String getTitle() {
        return this.title;
    }

    public int getYear() {
        return this.year;
    }

    public List<String> getAuthors() {
        return this.authors;
    }

    private void setTitle(String title) {
        this.title = title;
    }

    private void setYear(int year){
        this.year = year;
    }

    private void setAuthors(String... authors){
        this.authors = Arrays.stream(authors).collect(Collectors.toList());
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + this.title + '\'' +
                ", year=" + this.year +
                ", authors=" + this.authors + '}';
    }

    @Override
    public int compareTo(Book other) {
        int compared = this.title.compareTo(other.title);

        if(compared == 0){
            compared = Integer.compare(this.year, other.year);
        }

        return compared;
    }
}
