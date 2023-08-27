package _02_ProgrammingFundamentals._02_DataTypesAndVariables._01_Lecture;

import java.util.Scanner;

public class _05_ConcatNames {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Read input values
        String first = scan.nextLine(), second = scan.nextLine(), third = scan.nextLine();
        
        // Print result
        System.out.println(first + third + second);

        scan.close();
    }
}
