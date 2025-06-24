package _02_ProgrammingFundamentals._10_TextProcessing._02_Exercise;

import java.util.Scanner;

public class _01_ValidUsernames {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Read input values
        String[] console = scan.nextLine().split(", ");

        // Validate usernames
        for (int i = 0; i < console.length; i++) {
            // Validate the length
            if (console[i].length() >= 3 && console[i].length() <= 16) {
                boolean isValid = true;

                // Validate characters
                for (int j = 0; j < console[i].length(); j++) {
                    char symbol = console[i].charAt(j);

                    isValid = Character.isLetterOrDigit(symbol) || symbol == '-' || symbol == '_';
                    if (!isValid) {
                        break;
                    }
                }

                // Print result
                if (isValid) {
                    System.out.println(console[i]);
                }
            }
        }

        scan.close();
    }
}
