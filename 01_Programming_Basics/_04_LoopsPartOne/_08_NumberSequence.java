package _01_Programming_Basics._04_LoopsPartOne;

import java.util.Scanner;

public class _08_NumberSequence {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.nextLine());

        int maxNum = Integer.MIN_VALUE;
        int minNum = Integer.MAX_VALUE;

        for ( int i = 1; i<=n; i++){
            int currentNum = Integer.parseInt(scan.nextLine());
            if (currentNum > maxNum){
                maxNum = currentNum;
            }
            if (currentNum < minNum){
                minNum = currentNum;
            }
        }

        System.out.printf("Max number: %d%n",maxNum);
        System.out.printf("Min number: %d", minNum);
    }
}
