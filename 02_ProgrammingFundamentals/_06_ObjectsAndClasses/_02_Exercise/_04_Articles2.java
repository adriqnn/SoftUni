package _02_ProgrammingFundamentals._06_ObjectsAndClasses._02_Exercise;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class _04_Articles2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Read input value
        int n = Integer.parseInt(scan.nextLine());

        // add variable
        List<ArticlesDatabase> articles = new ArrayList<>();

        // Collect data for all the articles
        for (int i = 0; i < n; i++) {
            String[] articleLines = scan.nextLine().split(", ");
            String title = articleLines[0];
            String content = articleLines[1];
            String author = articleLines[2];

            ArticlesDatabase article = new ArticlesDatabase(title, content, author);
            articles.add(article);
        }

        String command = scan.nextLine();

        // Print result
        if (command.equals("title")) {
            articles.sort(Comparator.comparing(ArticlesDatabase::getTitle));
            articles.forEach(e -> System.out.printf("%s - %s: %s%n", e.getTitle(), e.getContent(), e.getAuthor()));
        } else if (command.equals("content")) {
            articles.sort(Comparator.comparing(ArticlesDatabase::getContent));
            articles.forEach(e -> System.out.printf("%s - %s: %s%n", e.getTitle(), e.getContent(), e.getAuthor()));
        } else if (command.equals("author")) {
            articles.sort(Comparator.comparing(ArticlesDatabase::getAuthor));
            articles.forEach(e -> System.out.printf("%s - %s: %s%n", e.getTitle(), e.getContent(), e.getAuthor()));
        }

        scan.close();
    }
}

// Create practice ArticleDatabase class
class ArticlesDatabase {
    private String title;
    private String content;
    private String author;

    public ArticlesDatabase(String title, String content, String author) {
        this.title = title;
        this.content = content;
        this.author = author;
    }

    public String getTitle() {
        return this.title;
    }

    public String getContent() {
        return this.content;
    }

    public String getAuthor() {
        return this.author;
    }
}
