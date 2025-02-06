package _02_ProgrammingFundamentals._03_Arrays._03_MoreExercises;

import java.util.Scanner;

public class _03_RecursiveFibonacci {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Read input value
        int num = Integer.parseInt(scan.nextLine());

        // Method for printing fibonacci
        printRecursiveFibonacci(num);

        scan.close();
    }

    private static void printRecursiveFibonacci(int num) {
        // 0
        if (num == 0) {
            System.out.println("0");
            return;
        }

        // 1
        if (num == 1) {
            System.out.println("1");
            return;
        }

        long number1InSequence = 1;
        long number2InSequence = 1;

        // fibonacci
        for (int i = 2; i < num; i++) {
            long temporary = number2InSequence;
            number2InSequence = number1InSequence + number2InSequence;
            number1InSequence = temporary;
        }

        System.out.println(number2InSequence);
    }
}
