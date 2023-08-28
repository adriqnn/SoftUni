package _02_ProgrammingFundamentals._02_DataTypesAndVariables._03_MoreExercises;

import java.util.Scanner;

public class _05_DecryptingMessage {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Read input values
        int keyToDecrypt = Integer.parseInt(scan.nextLine());
        int numberOfLines = Integer.parseInt(scan.nextLine());

        // Add variable
        StringBuilder message = new StringBuilder();

        // Decrypt the message
        for (int i = 0; i < numberOfLines; i++) {
            char symbol = scan.nextLine().charAt(0);
            symbol = (char) (symbol+keyToDecrypt);

            message.append(symbol);
        }

        // Print result
        System.out.println(message);

        scan.close();
    }
}
