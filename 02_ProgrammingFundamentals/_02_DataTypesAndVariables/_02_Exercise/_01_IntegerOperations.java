package _02_ProgrammingFundamentals._02_DataTypesAndVariables._02_Exercise;

import java.util.Scanner;

public class _01_IntegerOperations {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Read input value
        int n1 = Integer.parseInt(scan.nextLine()), n2 = Integer.parseInt(scan.nextLine()), n3 = Integer.parseInt(scan.nextLine()), n4 = Integer.parseInt(scan.nextLine());

        // Calculate result
        int result = ((n1 + n2) / n3) * n4;

        // Print result
        System.out.println(result);

        scan.close();
    }
}
