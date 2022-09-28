package _02_ProgrammingFundamentals._10_TextProcessing._01_Lecture;

import java.util.Scanner;

public class _02_RepeatStrings {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String[] console = scan.nextLine().split(" ");

        for (String word : console) {
            String repeatedWord = repeatWord(word,word.length());
            System.out.print(repeatedWord);
        }

    }

    private static String repeatWord(String word, int length) {
        String result = "";
        for (int i = 0; i < length; i++) {
            result += word;
        }
        return result;
    }
}
