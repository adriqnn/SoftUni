package _03_JavaAdvanced._12_WorkshopBasicAlgorithms;

import java.util.Scanner;

public class _02_RecursiveFactorialV2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.nextLine());
        long sum = calculateFactorial(n);

        System.out.println(sum);

        scan.close();
    }

    public static long calculateFactorial(int n) {
        if (n == 0) {
            return 1; // Base case: factorial of 0 is 1
        } else {
            // Recursive case: n! = n * (n-1)!
            return (long) n * calculateFactorial(n - 1);
        }
    }
}
