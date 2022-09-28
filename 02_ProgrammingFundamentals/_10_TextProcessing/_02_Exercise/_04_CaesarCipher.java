package _02_ProgrammingFundamentals._10_TextProcessing._02_Exercise;

import java.util.Scanner;

public class _04_CaesarCipher {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String console = scan.nextLine();
        StringBuilder encrypt = new StringBuilder();
        for (int i = 0; i < console.length(); i++) {
            char symbol = (char) (console.charAt(i) +3);
            encrypt.append(Character.valueOf(symbol));
        }
        System.out.println(encrypt);
    }
}
