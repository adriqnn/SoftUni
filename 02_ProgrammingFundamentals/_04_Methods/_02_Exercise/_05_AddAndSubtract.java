package _02_ProgrammingFundamentals._04_Methods._02_Exercise;

import java.util.Scanner;

public class _05_AddAndSubtract {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Read input values
        int num1 = Integer.parseInt(scan.nextLine());
        int num2 = Integer.parseInt(scan.nextLine());
        int num3 = Integer.parseInt(scan.nextLine());
        
        // Create method that sums num1 and num2
        int result = addMethod(num1, num2);
        
        // Create method that subtracts the previous result and num3
        subtractMethod(result, num3);
        
        scan.close();
    }

    private static void subtractMethod(int number1, int number2) {
        System.out.println(number1 - number2);
    }

    private static int addMethod(int number1, int number2) {
        return number1 + number2;
    }
}
