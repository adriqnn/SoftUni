package _01_ProgrammingBasics._04_LoopsPartOneMoreExercises;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class _11_OddEvenPosition {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Read input values
        int n = Integer.parseInt(scan.nextLine());

        // Add variables
        List<Double> odds = new ArrayList<>();
        double oddsSum = 0;
        List<Double> evens = new ArrayList<>();
        double evensSum = 0;

        // Read even and odd numbers for statistics
        for (int i = 0; i < n; i++) {
            double number = Double.parseDouble(scan.nextLine());

            if (i % 2 == 0) {
                odds.add(number);
                oddsSum += number;
            } else {
                evens.add(number);
                evensSum += number;
            }
        }

        // Calculate statistics for odd numbers and for even numbers based on the input values and print result
        if ( n == 0) {
            System.out.printf("OddSum=0.00,%n OddMin=No,%n OddMax=No,%n EvenSum=0.00,%n EvenMin=No,%n EvenMax=No%n");
        } else if ( n == 1) {
            double bigNumberOdd = odds.size() > 0 ? Collections.max(odds) : 0;
            double smallNumberOdd = odds.size() > 0 ? Collections.min(odds) : 0;
            System.out.printf("OddSum=%.2f,%n OddMin=%.2f,%n OddMax=%.2f,%n EvenSum=0.00,%n EvenMin=No,%n EvenMax=No%n", oddsSum, smallNumberOdd, bigNumberOdd, evensSum);
        } else {
            double bigNumberOdd = Collections.max(odds);
            double smallNumberOdd = Collections.min(odds);
            double bigNumberEven = Collections.max(evens);
            double smallNumberEven = Collections.min(evens);
            System.out.printf("OddSum=%.2f,%n OddMin=%.2f,%n OddMax=%.2f,%n EvenSum=%.2f,%n EvenMin=%.2f,%n EvenMax=%.2f%n", oddsSum, smallNumberOdd, bigNumberOdd, evensSum, smallNumberEven, bigNumberEven);
        }

        scan.close();
    }
}
