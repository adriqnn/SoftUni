package _02_ProgrammingFundamentals._11_RegularExpressions._02_Exercise;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class _06_ExtractEmails {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Read input value
        String input = scan.nextLine();

        // Add variables
        String regexEmail = "((?<=\\s)[a-zA-Z0-9]+([-.]\\w*)*@[a-zA-Z]+?([.-][a-zA-Z]*)*(\\.[a-z]{2,}))";
        Pattern patternEmail = Pattern.compile(regexEmail);
        Matcher matcherEmail = patternEmail.matcher(input);

        // Extract emails and print result
        while (matcherEmail.find()) {
            String email = matcherEmail.group(1);
            System.out.println(email);
        }

        scan.close();
    }
}
