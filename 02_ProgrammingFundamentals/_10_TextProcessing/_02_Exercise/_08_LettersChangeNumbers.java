package _02_ProgrammingFundamentals._10_TextProcessing._02_Exercise;

import java.util.Scanner;

public class _08_LettersChangeNumbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Read input values
        String[] console = scan.nextLine().split("\\s+");

        // Add variable
        double sum = 0;
        
        // Solve numbers game
        for (int i = 0; i < console.length; i++) {
            char first = console[i].charAt(0);
            char last = console[i].charAt(console[i].length() - 1);

            double num = Double.parseDouble(console[i].substring(1, console[i].length() - 1));
            double sumThisOne = 0;

            if (Character.isLowerCase(first)) {
                sumThisOne = num * (first - 96);
            } else {
                sumThisOne = num / (first - 64);
            }
            
            if (Character.isLowerCase(last)) {
                sumThisOne += last - 96;
            } else {
                sumThisOne -= last - 64;
            }

            sum += sumThisOne;
        }

        // Print result
        System.out.printf("%.2f%n", sum);

        scan.close();
    }
}
