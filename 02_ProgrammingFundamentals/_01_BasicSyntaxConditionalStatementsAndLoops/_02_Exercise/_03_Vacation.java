package _02_ProgrammingFundamentals._01_BasicSyntaxConditionalStatementsAndLoops._02_Exercise;

import java.util.Scanner;

public class _03_Vacation {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Read input values
        int n = Integer.parseInt(scan.nextLine());
        String person = scan.nextLine();
        String day = scan.nextLine();

        // Add variable
        double price = 0;

        // Calculate the price of the vacation
        if (day.equals("Friday")) {
            switch (person) {
                case "Students":
                    price = 8.45;
                    break;
                case "Business":
                    price = 10.90;
                    break;
                case "Regular":
                    price = 15.00;
                    break;
            }
        } else if (day.equals("Saturday")) {
            switch (person) {
                case "Students":
                    price = 9.80;
                    break;
                case "Business":
                    price = 15.60;
                    break;
                case "Regular":
                    price = 20.00;
                    break;
            }
        } else {
            switch (person) {
                case "Students":
                    price = 10.46;
                    break;
                case "Business":
                    price = 16.00;
                    break;
                case "Regular":
                    price = 22.50;
                    break;
            }
        }

        // Calculate additional discounts
        double total = n * price;
        if (person.equals("Students") && n >= 30) {
            total *= 0.85;
        } else if (person.equals("Business") && n >= 100) {
            total -= 10 * price;
        } else if (person.equals("Regular") && n >= 10 & n <= 20) {
            total *= 0.95;
        }

        // Print result
        System.out.printf("Total price: %.2f", total);

        scan.close();
    }
}
