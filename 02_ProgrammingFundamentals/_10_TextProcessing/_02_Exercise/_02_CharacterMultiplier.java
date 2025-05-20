package _02_ProgrammingFundamentals._10_TextProcessing._02_Exercise;

import java.util.Scanner;

public class _02_CharacterMultiplier {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Read input values
        String[] console = scan.nextLine().split("\\s+");

        // Add variables
        String firstWord = console[0];
        String secondWord = console[1];
        int sum = 0;

        // Multiply characters
        if (firstWord.length() > secondWord.length()) {
            for (int i = 0; i < secondWord.length(); i++) {
                sum += firstWord.charAt(i) * secondWord.charAt(i);
            }

            for (int i = secondWord.length(); i < firstWord.length(); i++) {
                sum += firstWord.charAt(i);
            }
        } else if (firstWord.length() < secondWord.length()) {
            for (int i = 0; i < firstWord.length(); i++) {
                sum += firstWord.charAt(i) * secondWord.charAt(i);
            }

            for (int i = firstWord.length(); i < secondWord.length(); i++) {
                sum += secondWord.charAt(i);
            }
        } else {
            for (int i = 0; i < secondWord.length(); i++) {
                sum += firstWord.charAt(i) * secondWord.charAt(i);
            }
        }

        // Print result
        System.out.println(sum);

        scan.close();
    }
}
