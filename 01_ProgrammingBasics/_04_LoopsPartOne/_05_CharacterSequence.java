package _01_ProgrammingBasics._04_LoopsPartOne;

import java.util.Scanner;

public class _05_CharacterSequence {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Read input value
        String text = scan.nextLine();

        // Iterate through each character in the input text
        for (int i = 0; i < text.length(); i++) {
            // Symbol
            char symbol = text.charAt(i);

            System.out.println(symbol);
        }

        scan.close();
    }
}
