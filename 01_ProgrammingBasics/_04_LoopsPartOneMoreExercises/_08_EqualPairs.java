package _01_ProgrammingBasics._04_LoopsPartOneMoreExercises;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class _08_EqualPairs {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        //Read input value
        int n = Integer.parseInt(scan.nextLine());

        // Add variables
        int initialSum = 0;
        boolean sameValue = true;
        List<Integer> sums = new ArrayList<>();

        // Process each pair of numbers and calculate sums
        for (int i = 0; i < n; i++) {
            int numberOne = Integer.parseInt(scan.nextLine());
            int numberTwo = Integer.parseInt(scan.nextLine());

            int currentSum = numberOne + numberTwo;
            sums.add(currentSum);

            if (i == 0) {
                initialSum = currentSum;
            } else {
                if (initialSum != currentSum) {
                    sameValue = false;
                }
            }
        }

        // Print the result
        if (sameValue) {
            System.out.printf("Yes, value=%d", initialSum);
        } else {
            // int bigNumber = Collections.max(sums);
            // int smallNumber = Collections.min(sums);
            int bigNumber = Math.max(sums.get(sums.size() - 1), sums.get(sums.size() - 2));
            int smallNumber = Math.min(sums.get(sums.size() - 1), sums.get(sums.size() - 2));
            System.out.printf("No, maxdiff=%d", bigNumber - smallNumber);
        }

        scan.close();
    }
}
