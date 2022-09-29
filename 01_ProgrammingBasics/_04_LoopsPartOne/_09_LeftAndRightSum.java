package _01_ProgrammingBasics._04_LoopsPartOne;

import java.util.Scanner;

public class _09_LeftAndRightSum {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.nextLine());

        int leftSum = 0;
        int rightSum = 0;

        for(int i =1; i <= n; i++) {
            int currentNum = Integer.parseInt(scan.nextLine());
            leftSum += currentNum;
        }
        for (int i = 1; i <= n; i++) {
            int currentNum = Integer.parseInt(scan.nextLine());
            rightSum += currentNum;
        }

        if (leftSum == rightSum){
            System.out.printf("Yes, sum = %d",rightSum);
        }else {
            System.out.printf("No, diff = %d",Math.abs(leftSum-rightSum));
        }
    }
}
