package _05_HackerRank._01_Java;

import java.util.Scanner;

public class _14_JavaStringsIntroduction {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String firstStringLine = scan.nextLine();
        String secondStringLine = scan.nextLine();

        System.out.println(firstStringLine.length() + secondStringLine.length());
        System.out.println(firstStringLine.compareTo(secondStringLine) > 0 ? "Yes" : "No");
        System.out.printf("%s %s", firstStringLine.substring(0, 1).toUpperCase() + firstStringLine.substring(1), secondStringLine.substring(0, 1).toUpperCase() + secondStringLine.substring(1));

        scan.close();
    }
}
