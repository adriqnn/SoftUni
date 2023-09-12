package _03_JavaAdvanced._01_StacksAndQueuesExercise;

import java.util.Scanner;

public class _06_RecursiveFibonacciV3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Read input value
        int num = scan.nextInt();

        // Create an array to store Fibonacci values
        long[] memo = new long[num + 1];

        // Print fibonacci
        System.out.println(calculateRecursiveFibonacci(num, memo));

        scan.close();
    }

    // Method that calculates fibonacci recursively with memoization
    private static long calculateRecursiveFibonacci(int num, long[] memo) {
        if (num <= 2) {
            return num;
        }

        // Check if the value has already been computed
        if (memo[num] != 0) {
            return memo[num];
        }

        // Calculate and memoize the Fibonacci value
        memo[num] = calculateRecursiveFibonacci(num - 1, memo) + calculateRecursiveFibonacci(num - 2, memo);

        return memo[num];
    }
}
