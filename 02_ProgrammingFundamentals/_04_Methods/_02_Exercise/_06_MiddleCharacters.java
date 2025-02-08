package _02_ProgrammingFundamentals._04_Methods._02_Exercise;

import java.util.Scanner;

public class _06_MiddleCharacters {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Read input value
        String console = scan.nextLine();

        // Create method that prints the middle of a string
        middleString(console);

        scan.close();
    }

    private static void  middleString(String console) {
        if (console.length() % 2 == 0) {
            char middleEvenOne = console.charAt((console.length() / 2) - 1);
            char middleEvenTwo = console.charAt(console.length() / 2);

            System.out.printf("%c%c", middleEvenOne, middleEvenTwo);
        } else {
            char middleOdd = console.charAt(console.length() / 2);

            System.out.println(middleOdd);
        }
    }
}
