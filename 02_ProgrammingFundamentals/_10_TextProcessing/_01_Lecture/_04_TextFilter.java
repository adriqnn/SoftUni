package _02_ProgrammingFundamentals._10_TextProcessing._01_Lecture;

import java.util.Scanner;

public class _04_TextFilter {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String[] words = scan.nextLine().split(", ");
        String text = scan.nextLine();

        for (int i = 0; i < words.length; i++) {
            StringBuilder replacement = new StringBuilder();
            for (int j = 0; j < words[i].length(); j++) {
                replacement.append("*");
            }
            text = text.replaceAll(words[i], replacement.toString());
        }
        System.out.println(text);
    }
}
