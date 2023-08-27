package _02_ProgrammingFundamentals._02_DataTypesAndVariables._01_Lecture;

import java.util.Scanner;

public class _06_CharsToString {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Read input values
        String one = scan.nextLine(), two = scan.nextLine(), three = scan.nextLine();

        // Print result
        System.out.println(one + two + three);
    }
}
