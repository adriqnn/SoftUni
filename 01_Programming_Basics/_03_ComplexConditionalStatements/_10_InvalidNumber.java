package _01_Programming_Basics._03_ComplexConditionalStatements;

import java.util.Scanner;

public class _10_InvalidNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int number = Integer.parseInt(scan.nextLine());

        boolean isValid = (number >= 100 && number <= 200 || number == 0);

        if (!isValid){
            System.out.println("invalid");
        }
    }
}
