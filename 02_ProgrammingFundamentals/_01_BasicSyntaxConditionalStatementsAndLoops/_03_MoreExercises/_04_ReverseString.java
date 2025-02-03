package _02_ProgrammingFundamentals._01_BasicSyntaxConditionalStatementsAndLoops._03_MoreExercises;

import java.util.Scanner;

public class _04_ReverseString {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Read input value
        String console = scan.nextLine();

        // Add variable
        StringBuilder rebuild = new StringBuilder();

        // Reverse string
        for (int i = console.length() - 1; i >= 0; i--) {
            char symbol = console.charAt(i);

            rebuild.append(symbol);
        }

        // Print result
        System.out.println(rebuild);

        scan.close();
    }
}
