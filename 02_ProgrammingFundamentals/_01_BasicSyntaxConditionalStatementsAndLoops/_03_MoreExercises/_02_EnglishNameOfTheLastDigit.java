package _02_ProgrammingFundamentals._01_BasicSyntaxConditionalStatementsAndLoops._03_MoreExercises;

import java.util.Scanner;

public class _02_EnglishNameOfTheLastDigit {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Read input value
        int num = Integer.parseInt(scan.nextLine());

        // Add variables
        int n = num % 10;
        String[] word = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};

        // Print result
        System.out.println(word[n]);

        scan.close();
    }
}
