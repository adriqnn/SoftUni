package _02_ProgrammingFundamentals._02_DataTypesAndVariables._01_Lecture;

import java.util.Scanner;

public class _07_ReversedChars {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Read input values
        String one = scan.nextLine(), two = scan.nextLine(), three = scan.nextLine();

        // Print result
        System.out.println(three + " " +  two + " " + one);
        
        scan.close();
    }
}
