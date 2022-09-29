package _01_ProgrammingBasics._05_LoopsPartTwo;

import java.util.Scanner;

public class _03_SumNumbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int initialNum = Integer.parseInt(scan.nextLine());

        int sum = 0;

        while(sum<initialNum){
            int currentNum = Integer.parseInt(scan.nextLine());
            sum += currentNum;
        }
        System.out.println(sum);
    }
}
