package _02_ProgrammingFundamentals._04_Methods._02_Exercise;

import java.util.Scanner;

public class _03_CharactersInRange {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        char one = scan.nextLine().charAt(0);
        char two = scan.nextLine().charAt(0);
        printThis(one,two);
    }

    private static void printThis(char one, char two) {

        for (int i = Math.min(one,two)+1; i < Math.max(one,two); i++) {
            System.out.print((char) i + " ");
        }
    }
}
