package _02_ProgrammingFundamentals._10_TextProcessing._02_Exercise;

import java.util.Scanner;
import java.util.regex.Pattern;

public class _01_ValidUsernamesV2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Read input values
        String[] console = scan.nextLine().split(", ");

        // Define a regular expression pattern for valid usernames
        Pattern pattern = Pattern.compile("^[A-Za-z0-9_-]{3,16}$");

        // Validate and print valid usernames
        for (String username : console) {
            if (pattern.matcher(username).matches()) {
                System.out.println(username);
            }
        }

        scan.close();
    }
}
