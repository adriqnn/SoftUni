package _01_Programming_Basics._03_ComplexConditionalStatements;

import java.util.Scanner;

public class _08_CinemaTicket {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String day = scan.nextLine();

        switch(day) {
            case "Monday":
            case "Tuesday":
            case "Friday":
                System.out.println(12);
                break;
            case "Wednesday":
            case "Thursday":
                System.out.println(14);
                break;
            default:
                System.out.println(16);
                break;
        }
    }
}
