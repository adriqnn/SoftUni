package _02_ProgrammingFundamentals._04_Methods._01_Lecture;

import java.text.DecimalFormat;
import java.util.Scanner;

public class _08_MathPower {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Read input values
        double num = Double.parseDouble(scan.nextLine());
        double power = Double.parseDouble(scan.nextLine());
        
        // Print result from the method
        System.out.println(new DecimalFormat("0.####").format(whatIsThePowerOF(num, power)));
        
        scan.close();
    }

    private static double whatIsThePowerOF(double num, double power) {
        return Math.pow(num, power);
    }
}
