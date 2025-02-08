package _02_ProgrammingFundamentals._04_Methods._01_Lecture;

import java.util.Scanner;

public class _04_Calculations {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Read input values
        String operation = scan.nextLine();
        int num1 = Integer.parseInt(scan.nextLine());
        int num2 = Integer.parseInt(scan.nextLine());

        // Create method to do the calculations
        whatIsTheResult(operation, num1, num2);

        scan.close();
    }

    private static void whatIsTheResult(String operation, int num1, int num2) {
        if (operation.equals("add")) {
            System.out.println(num1 + num2);
        } else if (operation.equals("multiply")) {
            System.out.println(num1 * num2);
        } else if (operation.equals("subtract")) {
            System.out.println(num1 - num2);
        } else if (operation.equals("divide")) {
            System.out.println(num1 / num2);
        }
    }
}
