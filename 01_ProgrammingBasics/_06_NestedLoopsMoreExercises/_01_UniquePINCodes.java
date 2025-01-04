package _01_ProgrammingBasics._06_NestedLoopsMoreExercises;

import java.util.Scanner;

public class _01_UniquePINCodes {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Read input values
        int num1 = Integer.parseInt(scan.nextLine());
        int num2 = Integer.parseInt(scan.nextLine());
        int num3 = Integer.parseInt(scan.nextLine());

        // Print valid pin codes
        for (int i = 2; i <= num1; i += 2) {
            for (int j = 2; j <= num2; j++) {
                if (isPrime(j)) {
                    for (int k = 2; k <= num3; k += 2) {
                        System.out.printf("%d %d% d%n", i, j, k);
                    }
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
