package _01_ProgrammingBasics._02_ConditionalStatements;

import java.util.Scanner;

public class _05_Number100Or200 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Read the number input
        int number = Integer.parseInt(scan.nextLine());

        // Categorize the number based on its value
        if (number < 100) {
            System.out.println("Less than 100");
        } else if (number <= 200) {
            System.out.println("Between 100 and 200");
        } else {
            System.out.println("Greater than 200");
        }

        scan.close();
    }
}
