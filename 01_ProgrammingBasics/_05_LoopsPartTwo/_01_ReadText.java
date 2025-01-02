package _01_ProgrammingBasics._05_LoopsPartTwo;

import java.util.Scanner;

public class _01_ReadText {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Use a while loop to continuously read input until "Stop" is entered
        while (true) {
            String input = scan.nextLine();

            if (input.equalsIgnoreCase("Stop")) {
                break;
            }

            // Print the input to the console
            System.out.println(input);
        }

        scan.close();
    }
}
