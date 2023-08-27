package _02_ProgrammingFundamentals._02_DataTypesAndVariables._02_Exercise;

import java.util.Scanner;

public class _05_PrintPartOfASCIITable {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Read input value
        int n1 = Integer.parseInt(scan.nextLine());
        int n2 = Integer.parseInt(scan.nextLine());

        // Print ASCII range
        for (int i = n1; i <= n2; i++) {
            char symbol = (char) i;
            System.out.print(symbol + " ");
        }

        scan.close();
    }
}
