package _02_ProgrammingFundamentals._11_RegularExpressions._03_MoreExercises;

import java.util.Arrays;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class _03_PostOffice {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Read input values
        String[] input = scan.nextLine().split("\\|");

        // Add varaibles
        StringBuilder characters = new StringBuilder();

        String regexCapitalLetters = "([#$%*&]+)(?<string>[A-Z]+)\\1";
        Pattern patternCapitalLetters = Pattern.compile(regexCapitalLetters);
        Matcher matcherCapitalLetters = patternCapitalLetters.matcher(input[0]);

        while (matcherCapitalLetters.find()) {
            characters.append(matcherCapitalLetters.group("string"));
        }

        // Decipher post office message
        for (int i = 0; i < characters.length(); i++) {
            char letter = characters.charAt(i);

            String regexWordLength = String.format("%d:(?<length>[0-9]{2})", (int) letter);
            Pattern patternWordLength = Pattern.compile(regexWordLength);
            Matcher matcherWordLength = patternWordLength.matcher(input[1]);

            int wordLength = 0;
            while (matcherWordLength.find()) {
                wordLength = Integer.parseInt(matcherWordLength.group("length")) + 1;
            }

            int finalWordLength = wordLength;

            Arrays.stream(input[2].split("\\s+")).filter(e -> (e.length() == finalWordLength && e.charAt(0) == letter)).forEach(System.out::println);
        }

        scan.close();
    }
}

//    String capitalLetters = "([#$%*&]+)(?<string>[A-Z]+)\\1";
//
//    char c = (int) 'C';
//    String wordLength = String.format("%d:[0-9]{2}", (int) c);
//
//    String character = "";
//    int length = 1;
//    String word = String.format("%s[a-z]{%d}", length);
//
//    String regexWord = String.format("%s[^ A-Z]{%d}", letter, wordLength);
//    Pattern patternWord = Pattern.compile(regexWord);
//    Matcher matcherWord = patternWord.matcher(input[2]);
//
//    while (matcherWord.find()) {
//        System.out.println(matcherWord.group());
//    }
