package _01_ProgrammingBasics._04_LoopsPartOneExercise;

import java.util.Scanner;

public class _02_HalfSumElement {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.nextLine());

        int nSum = 0;
        int maxNum = Integer.MIN_VALUE;

        for (int i = 1; i <=n ; i++) {

            int num = Integer.parseInt(scan.nextLine());

            if (num>maxNum){
                maxNum = num;
            }
            nSum += num;
        }

        int element = nSum-maxNum;

        if (element == maxNum){
            System.out.printf("Yes %n Sum = %d",maxNum);
        }else{
            System.out.printf("No %n Diff = %d", Math.abs(element-maxNum));
        }
    }
}
