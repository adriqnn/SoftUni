package _02_ProgrammingFundamentals._01_BasicSyntaxConditionalStatementsAndLoops._03_MoreExercises;

import java.util.Scanner;

public class _02_EnglishNameOfTheLastDigit {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int num = Integer.parseInt(scan.nextLine());
        int n = num%10;

        String[] word ={"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};

        System.out.println(word[n]);
    }
}
