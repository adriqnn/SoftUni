package _02_ProgrammingFundamentals._04_Methods._01_Lecture;

import java.util.Scanner;

public class _01_SignOfIntegerNumbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Read input value
        int num = Integer.parseInt(scan.nextLine());

        // Create method to determine the char sign
        whatIsTheSign(num);

        scan.close();
    }

    private static void whatIsTheSign(int num) {
        if (num == 0) {
            System.out.println("The number 0 is zero.");
        } else if (num > 0) {
            System.out.printf("The number %d is positive.", num);
        } else {
            System.out.printf("The number %d is negative.", num);
        }
    }
}
