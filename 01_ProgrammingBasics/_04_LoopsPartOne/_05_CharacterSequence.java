package _01_ProgrammingBasics._04_LoopsPartOne;

import java.util.Scanner;

public class _05_CharacterSequence {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String text = scan.nextLine();

        for (int i =0; i < text.length(); i++){
            char symbol = text.charAt(i);

            System.out.println(symbol);
        }
    }
}
