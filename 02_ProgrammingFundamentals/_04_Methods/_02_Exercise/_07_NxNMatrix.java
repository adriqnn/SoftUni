package _02_ProgrammingFundamentals._04_Methods._02_Exercise;

import java.util.Scanner;

public class _07_NxNMatrix {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Read input value
        int n = Integer.parseInt(scan.nextLine());

        // Create method that prints a number matrix
        printNxN(n);

        scan.close();
    }

    private static void printNxN(int n) {
        for (int i = 0; i < n; i++) {
            
            for (int j = 0; j < n; j++) {
                System.out.print(n + " ");
            }
            
            System.out.println();
        }
    }
}
