package _01_Programming_Basics._03_ComplexConditionalStatements;

import java.util.Scanner;

public class _06_NumberInRange {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int number = Integer.parseInt(scan.nextLine());

        if(number >= -100 && number <= 100 && number != 0) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
