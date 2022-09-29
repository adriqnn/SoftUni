package _01_ProgrammingBasics._04_LoopsPartOne;

import java.util.Scanner;

public class _07_SumNumbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.nextLine());

        int sum = 0;

        for (int i = 1; i <= n; i++){
            int currentNum = Integer.parseInt(scan.nextLine());
            sum += currentNum;
        }
        System.out.println(sum);
    }
}
