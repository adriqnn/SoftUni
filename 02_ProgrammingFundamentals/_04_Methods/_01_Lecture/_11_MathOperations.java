package _02_ProgrammingFundamentals._04_Methods._01_Lecture;

import java.text.DecimalFormat;
import java.util.Scanner;

public class _11_MathOperations {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n1 = Integer.parseInt(scan.nextLine());
        String operation = scan.nextLine();
        int n2 = Integer.parseInt(scan.nextLine());
        mathOperations(n1,operation,n2);
    }

    private static void mathOperations(int n1, String operation, int n2) {
        double result = 0;
        if (operation.equals("/")){
            result = n1/n2;
        }else if (operation.equals("*")){
            result = n1*n2;
        }else if (operation.equals("+")){
            result = n1+n2;
        }else if (operation.equals("-")){
            result = n1-n2;
        }
        System.out.println(new DecimalFormat("0.##").format(result));
    }
}
