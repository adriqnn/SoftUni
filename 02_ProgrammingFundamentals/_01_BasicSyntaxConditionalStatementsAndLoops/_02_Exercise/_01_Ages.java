package _02_ProgrammingFundamentals._01_BasicSyntaxConditionalStatementsAndLoops._02_Exercise;

import java.util.Scanner;

public class _01_Ages {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Read input value
        int n = Integer.parseInt(scan.nextLine());

        // Print result based on the input
        if (n <= 2) {
            System.out.println("baby");
        } else if (n <= 13) {
            System.out.println("child");
        } else if (n <= 19) {
            System.out.println("teenager");
        } else if (n <= 65) {
            System.out.println("adult");
        } else {
            System.out.println("elder");
        }

        scan.close();
    }
}
