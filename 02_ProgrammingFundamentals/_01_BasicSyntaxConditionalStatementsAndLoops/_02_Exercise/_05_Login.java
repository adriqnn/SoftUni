package _02_ProgrammingFundamentals._01_BasicSyntaxConditionalStatementsAndLoops._02_Exercise;

import java.util.Scanner;

public class _05_Login {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Read input values
        String username = scan.nextLine();
        String console = scan.nextLine();

        // Add variables
        StringBuilder reverseUsername = new StringBuilder();
        int count = 0;

        // Reverse the username
        for (int i = username.length() - 1; i >= 0; i--) {
            reverseUsername.append(username.charAt(i));
        }

        // Check if the user can log in or block after few unsuccessful attempts
        while (!console.equals(reverseUsername.toString())) {
            count++;

            if (count == 4) {
                System.out.printf("User %s blocked!%n", username);
                return;
            }

            System.out.println("Incorrect password. Try again.");

            console = scan.nextLine();
        }

        // Print result
        System.out.printf("User %s logged in.%n", username);

        scan.close();
    }
}
