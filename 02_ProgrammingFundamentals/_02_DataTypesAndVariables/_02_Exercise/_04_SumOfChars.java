package _02_ProgrammingFundamentals._02_DataTypesAndVariables._02_Exercise;

import java.util.Scanner;

public class _04_SumOfChars {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.nextLine());

        int sum = 0;
        for (int i = 0; i < n; i++) {
            char symbol = scan.nextLine().charAt(0);
            sum += symbol;
        }
        System.out.println("The sum equals: " + sum);
    }
}
