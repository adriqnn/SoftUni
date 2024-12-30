package _01_ProgrammingBasics._03_ComplexConditionalStatements;

import java.util.Scanner;

public class _10_InvalidNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Read input value
        int number = Integer.parseInt(scan.nextLine());

        // Check if the number is valid or invalid
        boolean isValid = (number >= 100 && number <= 200 || number == 0);

        // Print only if the number is invalid
        if (!isValid) {
            System.out.println("invalid");
        }
        
        scan.close();
    }
}
