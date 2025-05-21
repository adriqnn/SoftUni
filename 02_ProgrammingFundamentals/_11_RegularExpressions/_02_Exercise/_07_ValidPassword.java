package _02_ProgrammingFundamentals._11_RegularExpressions._02_Exercise;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class _07_ValidPassword {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Read input value
        int n = Integer.parseInt(scan.nextLine());

        // Add variables
        String regexEmail = "_[.]+[A-Z][A-Za-z0-9]{4,}[A-Z]_[.]+";
        Pattern patternEmail = Pattern.compile(regexEmail);

        // Determine if the password is valid or not
        for (int i = 0; i < n; i++) {
            String input = scan.nextLine();
            Matcher matcherEmail = patternEmail.matcher(input);

            // Print result
            if (matcherEmail.find()) {
                StringBuilder groupString = new StringBuilder("Group: ");

                for (int j = 0; j < input.length(); j++) {
                    char current = input.charAt(j);

                    if (Character.isDigit(current)) {
                        groupString.append(current);
                    }
                }

                System.out.println(groupString.length() > 7 ? groupString : groupString + "default");
            } else {
                System.out.println("Invalid pass!");
            }
        }

        scan.close();
    }
}
