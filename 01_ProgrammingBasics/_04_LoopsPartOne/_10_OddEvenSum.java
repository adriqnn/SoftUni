package _01_ProgrammingBasics._04_LoopsPartOne;

import java.util.Scanner;

public class _10_OddEvenSum {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Read input value
        int n = Integer.parseInt(scan.nextLine());

        int sumEven = 0;
        int sumOdd = 0;

        // Loop through the n sequence of numbers and sum even and odd numbers
        for (int i = 1; i <= n; i++) {
            int num = Integer.parseInt(scan.nextLine());

            if (i % 2 == 0) {
                // Add even-indexed numbers to sumEven
                sumEven += num;
            } else {
                // Add odd-indexed numbers to sumOdd
                sumOdd += num;
            }
        }

        // Compare the sums and print the result
        if (sumEven == sumOdd {
            System.out.printf("Yes%n Sum = %d", sumEven);
        } else {
            System.out.printf("No %n Diff = %d", Math.abs(sumEven - sumOdd));
        }

        scan.close();
    }
}
