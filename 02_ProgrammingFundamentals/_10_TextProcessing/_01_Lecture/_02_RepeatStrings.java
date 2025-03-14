package _02_ProgrammingFundamentals._10_TextProcessing._01_Lecture;

import java.util.Scanner;

public class _02_RepeatStrings {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Read input values
        String[] console = scan.nextLine().split(" ");

        // Repeat string
        for (String word : console) {
            String repeatedWord = repeatWord(word, word.length());
            
            // Print result
            System.out.print(repeatedWord);
        }

        scan.close();
    }

    // Method that concatenates a string multiple times
    private static String repeatWord (String word, int length) {
        StringBuilder result = new StringBuilder();
        
        for (int i = 0; i < length; i++) {
            result.append(word);
        }
        
        return result.toString();
    }
}
