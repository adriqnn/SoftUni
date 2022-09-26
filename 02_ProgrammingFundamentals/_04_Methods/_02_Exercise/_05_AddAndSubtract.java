package _02_ProgrammingFundamentals._04_Methods._02_Exercise;

import java.util.Scanner;

public class _05_AddAndSubtract {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int num1 = Integer.parseInt(scan.nextLine());
        int num2 = Integer.parseInt(scan.nextLine());
        int num3 = Integer.parseInt(scan.nextLine());

        int result = addMethod(num1,num2);
        subtractMethod(result,num3);
    }

    private static void subtractMethod(int result, int num3) {

        System.out.println(result-num3);
    }

    private static int addMethod(int num1, int num2) {

        return num1+num2;
    }
}
