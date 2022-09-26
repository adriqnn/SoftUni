package _02_ProgrammingFundamentals._01_BasicSyntaxConditionalStatementsAndLoops._03_MoreExercises;

import java.util.Scanner;

public class _04_ReverseString {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String console = scan.nextLine();
        StringBuilder rebuild = new StringBuilder();

        for (int i = console.length()-1; i >= 0; i--) {
            char symbol = console.charAt(i);
            rebuild.append(symbol);
        }
        System.out.println(rebuild);
    }
}
