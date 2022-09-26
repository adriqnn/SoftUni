package _02_ProgrammingFundamentals._04_Methods._01_Lecture;

import java.util.Scanner;

public class _07_RepeatString {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String console = scan.nextLine();
        int num = Integer.parseInt(scan.nextLine());
        repeatString(console,num);
    }

    private static void repeatString(String console, int num) {
        StringBuilder newString = new StringBuilder();
        for (int i = 0; i < num; i++) {
            newString.append(console);
        }
        System.out.println(newString);
    }
}
