package _01_ProgrammingBasics._03_ComplexConditionalStatements;

import java.util.Scanner;

public class _07_WorkingHours {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int hours = Integer.parseInt(scan.nextLine());
        String day = scan.nextLine();

        if (day.equals("Monday")) {
            if (hours >= 10 && hours <= 18) {
                System.out.println("open");
            } else {
                System.out.println("closed");
            }

        } else if (day.equals("Tuesday")) {
            if (hours >= 10 && hours <= 18) {
                System.out.println("open");
            } else {
                System.out.println("closed");
            }
        } else if (day.equals("Wednesday")) {
            if (hours >= 10 && hours <= 18) {
                System.out.println("open");
            } else {
                System.out.println("closed");
            }
        } else if (day.equals("Thursday")) {
            if (hours >= 10 && hours <= 18) {
                System.out.println("open");
            } else {
                System.out.println("closed");
            }
        } else if (day.equals("Friday")) {
            if (hours >= 10 && hours <= 18) {
                System.out.println("open");
            } else {
                System.out.println("closed");
            }
        } else if (day.equals("Saturday")) {
            if (hours >= 10 && hours <= 18) {
                System.out.println("open");
            } else {
                System.out.println("closed");
            }
        } else {
            System.out.println("closed");
        }
    }
}
