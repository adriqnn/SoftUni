package _02_ProgrammingFundamentals._01_BasicSyntaxConditionalStatementsAndLoops._01_Lecture;

import java.util.Scanner;

public class _07_TheatrePromotion {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Read input value
        String day = scan.nextLine();
        int age  = Integer.parseInt(scan.nextLine());

        // Print price of a theater ticket
        if (age < 0 || age > 122) {
            System.out.println("Error!");
        } else if (age <= 18) {
            switch (day) {
                case "Weekday":
                    System.out.println("12$");
                    break;
                case "Weekend":
                    System.out.println("15$");
                    break;
                case "Holiday":
                    System.out.println("5$");
                    break;
            }
        } else if (age <= 64) {
            switch (day) {
                case "Weekday":
                    System.out.println("18$");
                    break;
                case "Weekend":
                    System.out.println("20$");
                    break;
                case "Holiday":
                    System.out.println("12$");
                    break;
            }
        } else {
            switch (day) {
                case "Weekday":
                    System.out.println("12$");
                    break;
                case "Weekend":
                    System.out.println("15$");
                    break;
                case "Holiday":
                    System.out.println("10$");
                    break;
            }
        }

        scan.close();
    }
}
