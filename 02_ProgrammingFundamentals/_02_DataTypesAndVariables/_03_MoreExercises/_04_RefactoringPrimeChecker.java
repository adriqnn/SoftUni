package _02_ProgrammingFundamentals._02_DataTypesAndVariables._03_MoreExercises;

import java.util.Scanner;

public class _04_RefactoringPrimeChecker {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Read input value
        int n = Integer.parseInt(scan.nextLine());

        // Check if the number is prime or not
        for (int i = 2; i <= n; i++) {
            boolean isPrime = true;

            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
            }

            // Print result
            System.out.printf("%d -> %b%n", i, isPrime);
        }

        scan.close();
    }
}
