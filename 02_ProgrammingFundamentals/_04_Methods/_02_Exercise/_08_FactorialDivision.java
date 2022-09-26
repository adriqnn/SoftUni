package _02_ProgrammingFundamentals._04_Methods._02_Exercise;

import java.util.Scanner;

public class _08_FactorialDivision {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n1 = Integer.parseInt(scan.nextLine());
        int n2 = Integer.parseInt(scan.nextLine());
        System.out.printf("%.2f",(1.00*factorialDivision(n1))/factorialDivision(n2));
    }

    private static long factorialDivision(int n) {

        long factorial = 1;
        for (int i = 2; i <= n; i++) {
            factorial = factorial*i;
        }
        return factorial;
    }
}
