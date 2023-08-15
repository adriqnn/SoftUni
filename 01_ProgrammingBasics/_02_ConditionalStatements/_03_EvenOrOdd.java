package _01_ProgrammingBasics._02_ConditionalStatements;

import java.util.Scanner;

public class _03_EvenOrOdd {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Read the number input
        int number = Integer.parseInt(scan.nextLine());

        // Determine if the number is even or odd
        if (number % 2 == 0) {
            System.out.println("even");
        } else {
            System.out.println("odd");
        }

        scan.close();
    }
}
