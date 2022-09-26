package _02_ProgrammingFundamentals._01_BasicSyntaxConditionalStatementsAndLoops._03_MoreExercises;

import java.util.Scanner;

public class _05_Messages {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.nextLine());

        StringBuilder build = new StringBuilder();
        for (int i = 1; i <= n; i++) {
            int console = Integer.parseInt(scan.nextLine());
            int numDigits = String.valueOf(console).length();
            int mainDigit = console%10;
            int offset = (mainDigit-2)*3;
            if (mainDigit == 8 || mainDigit == 9){
                offset += 1;
            }
            int index = offset + numDigits - 1;
            char symbol = (char)(index + 97);

            if (console == 0){
                build.append(" ");
            }else
                build.append(symbol);
        }
        System.out.println(build);
    }
}
