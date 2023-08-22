package _01_ProgrammingBasics._06_NestedLoopsMoreExercises;

import java.util.Scanner;

public class _09_SumOfTwoNumbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int startOfInterval = Integer.parseInt(scan.nextLine());
        int endOfInterval = Integer.parseInt(scan.nextLine());
        int magicNumber = Integer.parseInt(scan.nextLine());

        int combinations = 0;
        boolean magicNumberFound = false;

        forLoopOuter:
        for (int i = startOfInterval; i <= endOfInterval; i++) {
            for (int j = startOfInterval; j <= endOfInterval; j++) {
                combinations++;
                int sum = i + j;

                if(magicNumber == sum){
                    magicNumberFound = true;
                    System.out.printf("Combination N:%d (%d + %d = %d)", combinations, i, j, sum);
                    break forLoopOuter;
                }
            }
        }

        if(!magicNumberFound){
            System.out.printf("%d combinations - neither equals %d", combinations, magicNumber);
        }
    }
}
