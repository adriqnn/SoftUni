package _01_ProgrammingBasics._02_ConditionalStatements;

import java.util.Scanner;

public class _04_PasswordGuess {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // The correct password to compare against
        String password = "s3cr3t!P@ssw0rd";

        // Read the password input
        String passwordInput = scan.nextLine();

        // Check if the input matches the correct password
        if (passwordInput.equals(password)) {
            System.out.println("Welcome");
        } else {
            System.out.println("Wrong password!");
        }

        scan.close();
    }
}
