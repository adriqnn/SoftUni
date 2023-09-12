package _03_JavaAdvanced._01_StacksAndQueuesExercise;

import java.util.Scanner;

public class _06_RecursiveFibonacciV2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Read input value
        int num = scan.nextInt();

        // Print fibonacci
        System.out.println(calculateRecursiveFibonacci(num));

        scan.close();
    }

    // Method that calculates fibonacci recursively
    private static long calculateRecursiveFibonacci(int num) {
        if (num <= 2) {
            return num;
        }

        return calculateRecursiveFibonacci(num - 1) + calculateRecursiveFibonacci(num - 2);
    }
}
