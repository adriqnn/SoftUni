package _02_ProgrammingFundamentals._02_DataTypesAndVariables._03_MoreExercises;

import java.util.Scanner;

public class _05_DecryptingMessage {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int keyToDecrypt = Integer.parseInt(scan.nextLine());
        int numberOfLines = Integer.parseInt(scan.nextLine());

        StringBuilder message = new StringBuilder();
        for (int i = 0; i < numberOfLines; i++) {
            char symbol = scan.nextLine().charAt(0);
            symbol = (char) (symbol+keyToDecrypt);
            message.append(symbol);
        }
        System.out.println(message);
    }
}
