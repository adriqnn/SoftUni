package _01_ProgrammingBasics._06_NestedLoopsExercise;

import java.util.Scanner;

public class _03_SumPrimeNonPrime {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Read input value
        String console = scan.nextLine();

        // Add variables
        int primeSum = 0;
        int nonPrimeSum = 0;

        // Calculate prime and non-prime sums
        while (!console.equals("stop")) {
            boolean isPrime = true;
            int num = Integer.parseInt(console);

            if (num < 0) {
                System.out.println("Number is negative.");
            } else {
                if (num <= 1) {
                    isPrime = false;
                } else {
                    for (int i = 2; i <= Math.sqrt(num); i++) {
                        if (num % i == 0) {
                            isPrime = false;
                            break;
                        }
                    }
                }

                if (isPrime) {
                    primeSum += num;
                } else {
                    nonPrimeSum += num;
                }
            }

            console = scan.nextLine();
        }

        // Print result
        System.out.printf("Sum of all prime numbers is: %d%n", primeSum);
        System.out.printf("Sum of all non prime numbers is: %d", nonPrimeSum);

        scan.close();
    }
}
