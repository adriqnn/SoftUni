package _02_ProgrammingFundamentals._04_Methods._02_Exercise;

import java.util.Scanner;

public class _03_CharactersInRange {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Read input values
        char charOne = scan.nextLine().charAt(0);
        char charTwo = scan.nextLine().charAt(0);

        // Create method that prints ASCII chars in a given range
        printThis(charOne, charTwo);

        scan.close();
    }

    private static void printThis(char charOne, char charTwo) {

        for (int i = Math.min(charOne, charTwo) + 1; i < Math.max(charOne, charTwo); i++) {
            System.out.print((char) i + " ");
        }
    }
}
