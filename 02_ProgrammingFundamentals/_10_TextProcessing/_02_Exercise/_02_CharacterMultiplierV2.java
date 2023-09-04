package _02_ProgrammingFundamentals._10_TextProcessing._02_Exercise;

import java.util.Scanner;

public class _02_CharacterMultiplierV2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Read input values
        String[] console = scan.nextLine().split("\\s+");

        // Add variables
        String firstWord = console[0];
        String secondWord = console[1];
        int sum = 0;

        // Multiply characters
        int minLength = Math.min(firstWord.length(), secondWord.length());
        int maxLength = Math.max(firstWord.length(), secondWord.length());

        for (int i = 0; i < minLength; i++) {
            sum += firstWord.charAt(i) * secondWord.charAt(i);
        }

        String longerWord = (firstWord.length() > secondWord.length()) ? firstWord : secondWord;

        for (int i = minLength; i < maxLength; i++) {
            sum += longerWord.charAt(i);
        }

        // Print result
        System.out.println(sum);

        scan.close();
    }
}
