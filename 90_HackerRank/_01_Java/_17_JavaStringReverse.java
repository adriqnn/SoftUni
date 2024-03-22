package _05_HackerRank._01_Java;

import java.util.Scanner;

public class _17_JavaStringReverse {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String line = scan.nextLine();
        StringBuilder reverse = new StringBuilder(line);

        System.out.println(line.compareTo(reverse.reverse().toString()) == 0 ? "Yes" : "No");

        scan.close();
    }
}
