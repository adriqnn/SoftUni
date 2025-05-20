package _02_ProgrammingFundamentals._10_TextProcessing._03_MoreExercises;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class _01_ExtractPersonInformation {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Read input value
        int numberOfStrings = Integer.parseInt(scan.nextLine());

        // Add variables
        String regexName = "@(?<name>[A-Za-z]+)\\|";
        String regexAge = "#(?<age>[0-9]+)\\*";
        Pattern patterName = Pattern.compile(regexName);
        Pattern patternAge = Pattern.compile(regexAge);

        // Extract user information
        for (int i = 0; i < numberOfStrings; i++) {
            String newLine = scan.nextLine();

            Matcher matcherName = patterName.matcher(newLine);
            Matcher matcherAge = patternAge.matcher(newLine);

            String name = "";
            String age = "";

            if (matcherName.find()) {
                name = matcherName.group("name");
            }

            if (matcherAge.find()) {
                age = matcherAge.group("age");
            }

            if (name.length() > 0 && age.length() > 0) {
                System.out.printf("%s is %s years old.%n", name, age);
            }
        }

        scan.close();
    }
}
