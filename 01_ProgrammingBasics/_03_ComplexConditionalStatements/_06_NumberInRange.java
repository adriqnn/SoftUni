package _01_ProgrammingBasics._03_ComplexConditionalStatements;

import java.util.Scanner;

public class _06_NumberInRange {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Read input value
        int number = Integer.parseInt(scan.nextLine());

        // Set a range for the check
        final int MIN_RANGE = -100;
        final int MAX_RANGE = 100;

        // Check if the number is in the set range and print the result
        if (number >= MIN_RANGE && number <= MAX_RANGE && number != 0) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

        scan.close();
    }
}
