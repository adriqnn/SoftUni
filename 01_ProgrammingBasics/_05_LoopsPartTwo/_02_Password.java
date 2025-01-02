package _01_ProgrammingBasics._05_LoopsPartTwo;

import java.util.Scanner;

public class _02_Password {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Read input values
        String username = scan.nextLine();
        String password = scan.nextLine();

        String input = scan.nextLine();

        // Use a while loop to repeatedly ask for the password until it matches
        while (!input.equals(password)) {
            input = scan.nextLine();
        }

        // Welcome the user after successful login
        System.out.printf("Welcome %s!", username);

        scan.close();
    }
}
