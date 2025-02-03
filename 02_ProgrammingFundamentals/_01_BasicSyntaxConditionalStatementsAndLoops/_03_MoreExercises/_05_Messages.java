package _02_ProgrammingFundamentals._01_BasicSyntaxConditionalStatementsAndLoops._03_MoreExercises;

import java.util.Scanner;

public class _05_Messages {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Read input value
        int n = Integer.parseInt(scan.nextLine());

        // Add variable
        StringBuilder build = new StringBuilder();

        // Decipher the message
        for (int i = 1; i <= n; i++) {
            int console = Integer.parseInt(scan.nextLine());
            int numDigits = String.valueOf(console).length();

            int mainDigit = console % 10;
            int offset = (mainDigit - 2) * 3;

            if (mainDigit == 8 || mainDigit == 9){
                offset += 1;
            }

            int index = offset + numDigits - 1;
            char symbol = (char) (index + 97);

            if (console == 0) {
                build.append(" ");
            } else {
                build.append(symbol);
            }
        }

        // Print result
        System.out.println(build);

        scan.close();
    }
}
