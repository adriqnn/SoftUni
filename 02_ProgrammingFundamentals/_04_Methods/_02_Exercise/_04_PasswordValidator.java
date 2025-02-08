package _02_ProgrammingFundamentals._04_Methods._02_Exercise;

import java.util.Scanner;

public class _04_PasswordValidator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Read input value
        String password = scan.nextLine();

        // Determine if a password is valid
        if (isPasswordValidLength(password) && hasLettersAndDigitsOnly(password) && hasAtLeast2Digits(password)) {
            System.out.println("Password is valid");
        } else {
            if (!isPasswordValidLength(password)) {
                System.out.println("Password must be between 6 and 10 characters");
            }
            if (!hasLettersAndDigitsOnly(password)) {
                System.out.println("Password must consist only of letters and digits");
            }
            if (!hasAtLeast2Digits(password)) {
                System.out.println("Password must have at least 2 digits");
            }
        }

        scan.close();
    }

    private static boolean hasAtLeast2Digits(String password) {
        int count = 0;

        for (int i = 0; i < password.length(); i++) {
            char symbol = password.charAt(i);

            if (Character.isDigit(symbol)) {
                count++;
            }
        }

        return count >= 2;
    }

    private static boolean hasLettersAndDigitsOnly(String password) {
        for (int i = 0; i < password.length(); i++) {
            char symbol = password.charAt(i);

            if (!Character.isLetterOrDigit(symbol)) {
                return false;
            }
        }

        return true;
    }

    private static boolean isPasswordValidLength(String password) {
        if (password.length() >= 6 && password.length() <= 10) {
            return true;
        } else {
            return false;
        }
    }
}
