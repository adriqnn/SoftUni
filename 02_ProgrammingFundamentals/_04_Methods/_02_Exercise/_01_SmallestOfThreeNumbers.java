package _02_ProgrammingFundamentals._04_Methods._02_Exercise;

import java.util.Scanner;

public class _01_SmallestOfThreeNumbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Read input values
        int n1 = Integer.parseInt(scan.nextLine());
        int n2 = Integer.parseInt(scan.nextLine());
        int n3 = Integer.parseInt(scan.nextLine());

        // Create method to determine the smallest number out of three numbers
        printBiggestNumber(n1, n2, n3);
    }

    private static void printBiggestNumber(int n1, int n2, int n3) {
        System.out.println(Math.min(n1, (Math.min(n2, n3))));
    }
}
