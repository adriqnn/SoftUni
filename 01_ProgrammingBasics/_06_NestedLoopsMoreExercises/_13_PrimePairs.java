package _01_ProgrammingBasics._06_NestedLoopsMoreExercises;

import java.util.Scanner;

public class _13_PrimePairs {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Read input values
        int firstNumberStart = Integer.parseInt(scan.nextLine());
        int secondNumberStart = Integer.parseInt(scan.nextLine());
        int firstNumberEnd = Integer.parseInt(scan.nextLine());
        int secondNumberEnd = Integer.parseInt(scan.nextLine());

        // Determine the prime pairs numbers and print them
        for (int i = firstNumberStart; i <= firstNumberStart + firstNumberEnd; i++) {
            for (int j = secondNumberStart; j <= secondNumberStart + secondNumberEnd; j++) {
                if (isPrime(i) && isPrime(j)) {
                    System.out.printf("%d%d%n", i, j);
                }
            }
        }

        scan.close();
    }

    // Function to check if a number is prime
    public static boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }

        // Check for divisibility from 2 to the square root of the number
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }

        return true;
    }
}
