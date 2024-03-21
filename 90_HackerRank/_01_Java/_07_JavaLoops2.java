package _05_HackerRank._01_Java;

import java.util.Scanner;

public class _07_JavaLoops2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.nextLine());

        for (int i = 0; i < n; i++) {
            int n1 = scan.nextInt();
            int n2 = scan.nextInt();
            int n3 = scan.nextInt();

            int result = n1;
            for (int j = 0; j < n3; j++) {
                result += Math.pow(2, j) * n2;

                System.out.printf("%d ", result);
            }

            System.out.println();
        }

        scan.close();
    }
}
