package _02_ProgrammingFundamentals._02_DataTypesAndVariables._02_Exercise;

import java.util.Scanner;

public class _02_SumDigits {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Read input value
        String console = scan.nextLine();

        // Add variable
        int sum = 0;

        // Sum the numbers
        for (int i = 0; i < console.length(); i++) {
            char symbol = console.charAt(i);

            int n = Character.getNumericValue(symbol);
            sum += n;
        }

        // Print result
        System.out.println(sum);

        scan.close();
    }
}
