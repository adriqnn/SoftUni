package _02_ProgrammingFundamentals._10_TextProcessing._01_Lecture;

import java.util.Scanner;

public class _01_ReverseStrings {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Read input value
        StringBuilder input = new StringBuilder(scan.nextLine());
        
        // Reverse strings
        while (!input.toString().equals("end")) {
            String original = input.toString();
            input.reverse();
            
            // Print result
            System.out.printf("%s = %s%n", original, input);
            
            input = new StringBuilder(scan.nextLine());
        }
        
        scan.close();
    }
}
