package _02_ProgrammingFundamentals._04_Methods._03_MoreExercises;

import java.util.Scanner;

public class _05_MultiplicationSign {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Read input value
        int num1 = Integer.parseInt(scan.nextLine());
        int num2 = Integer.parseInt(scan.nextLine());
        int num3 = Integer.parseInt(scan.nextLine());

        // Create method that determines math result
        checkMath(num1, num2, num3);

        scan.close();
    }

    private static void checkMath(int num1, int num2, int num3) {
        if (num1 == 0 || num2 == 0 || num3 == 0) {
            System.out.println("zero");
            return;
        }

        int count = 0;
        if (num1 < 0) {
            count++;
        }

        if (num2 < 0) {
            count++;
        }

        if (num3 < 0) {
            count++;
        }

        if (count == 1 || count == 3) {
            System.out.println("negative");
        } else {
            System.out.println("positive");
        }
    }
}
