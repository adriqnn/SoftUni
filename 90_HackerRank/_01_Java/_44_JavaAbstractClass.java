package _05_HackerRank._01_Java;

import java.util.Scanner;

public class _44_JavaAbstractClass {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String title = scan.nextLine();

        MyBook new_novel = new MyBook();
        new_novel.setTitle(title);
        System.out.println("The title is: "+new_novel.getTitle());
        scan.close();
    }
}

abstract class Book{
    String title;
    abstract void setTitle(String s);
    String getTitle(){
        return title;
    }
}

class MyBook extends Book{
    @Override
    void setTitle(String s) {
        super.title = s;
    }
}