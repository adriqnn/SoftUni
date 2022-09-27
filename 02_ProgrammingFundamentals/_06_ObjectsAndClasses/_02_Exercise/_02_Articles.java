package _02_ProgrammingFundamentals._06_ObjectsAndClasses._02_Exercise;

import java.util.Scanner;

public class _02_Articles {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String[] console = scan.nextLine().split(", ");

        String title = console[0];
        String content = console[1];
        String author = console[2];
        Article myArticle = new Article(title,content,author);

        int n = Integer.parseInt(scan.nextLine());

        for (int i = 0; i < n; i++) {
            String[] commandLine = scan.nextLine().split(": ");
            String command = commandLine[0];
            if(command.equals("Edit")){
                myArticle.setContent(commandLine[1]);
            }else if(command.equals("ChangeAuthor")){
                myArticle.setAuthor(commandLine[1]);
            }else if(command.equals("Rename")){
                myArticle.setTitle(commandLine[1]);
            }
        }
        System.out.println(myArticle);
    }
}
class Article{
    private String title;
    private String content;
    private String author;
    public Article(String title, String content, String author) {
        this.title = title;
        this.content = content;
        this.author = author;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public void setContent(String content) {
        this.content = content;
    }
    public void setAuthor(String author) {
        this.author = author;
    }
    @Override
    public String toString(){
        return this.title + " - " + this.content + ": " + this.author;
    }
}
