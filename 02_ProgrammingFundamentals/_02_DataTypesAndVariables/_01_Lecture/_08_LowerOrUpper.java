package _02_ProgrammingFundamentals._02_DataTypesAndVariables._01_Lecture;

import java.util.Scanner;

public class _08_LowerOrUpper {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Read input value
        String console = scan.nextLine();

        // Add variable
        char symbol = console.charAt(0);

        // Print result
        System.out.println(symbol >= 97 ? "lower-case" : "upper-case");

        scan.close();
    }
}
