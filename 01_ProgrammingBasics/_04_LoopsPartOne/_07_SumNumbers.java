package _01_ProgrammingBasics._04_LoopsPartOne;

import java.util.Scanner;

public class _07_SumNumbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Read input value
        int n = Integer.parseInt(scan.nextLine());

        int sum = 0;

        // Sum all the numbers for the n loop
        for (int i = 1; i <= n; i++) {
            int currentNum = Integer.parseInt(scan.nextLine());
            sum += currentNum;
        }

        // Print the sum of numbers
        System.out.println(sum);

        scan.close();
    }
}
