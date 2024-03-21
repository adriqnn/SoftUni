package _05_HackerRank._01_Java;

import java.util.Scanner;

public class _05_JavaOutputFormatting {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("================================");
        for (int i = 0; i < 3; i++) {
            String s = scan.next();
            int n = scan.nextInt();

            System.out.printf("%-15s%03d%n", s, n);
        }

        System.out.println("================================");
    }
}
