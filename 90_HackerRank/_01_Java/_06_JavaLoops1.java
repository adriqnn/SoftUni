package _05_HackerRank._01_Java;

import java.util.Scanner;

public class _06_JavaLoops1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.nextLine());

        for (int i = 1; i <= 10; i++) {
            System.out.printf("%d x %d = %d%n", n, i, n * i);
        }

        scan.close();
    }
}
