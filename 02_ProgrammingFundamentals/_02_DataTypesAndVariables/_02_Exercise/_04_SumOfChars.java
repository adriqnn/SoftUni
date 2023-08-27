package _02_ProgrammingFundamentals._02_DataTypesAndVariables._02_Exercise;

import java.util.Scanner;

public class _04_SumOfChars {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Read input value
        int n = Integer.parseInt(scan.nextLine());

        // Add variable
        int sum = 0;

        // Sum the chars
        for (int i = 0; i < n; i++) {
            char symbol = scan.nextLine().charAt(0);
            sum += symbol;
        }

        // Print result
        System.out.println("The sum equals: " + sum);

        scan.close();
    }
}
