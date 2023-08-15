package _01_ProgrammingBasics._02_ConditionalStatements;

import java.util.Scanner;

public class _02_GreaterNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Read the two integers
        int numberOne = Integer.parseInt(scan.nextLine());
        int numberTwo = Integer.parseInt(scan.nextLine());

        // Print the greater of the two integers
        System.out.println(Math.max(numberOne, numberTwo));
        
        scan.close();
    }
}
