package _01_ProgrammingBasics._06_NestedLoops;

import java.util.Scanner;

public class _04_SumOfTwoNumbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int start = Integer.parseInt(scan.nextLine());
        int end = Integer.parseInt(scan.nextLine());
        int magicNum = Integer.parseInt(scan.nextLine());

        int count = 0;
        boolean isDone = false;

        for (int i = start; i <= end; i++) {
            for (int j = start; j <= end; j++) {
                count++;
                if (i+j == magicNum){
                    System.out.printf("Combination N:%d (%d + %d = %d)%n",count,i,j,i+j );
                    isDone = true;
                    break;
                }
            }
            if (isDone){
                break;
            }
        }
        if(!isDone){
            System.out.printf("%d combinations - neither equals %d",count,magicNum);
        }
    }
}
