package _02_ProgrammingFundamentals._06_ObjectsAndClasses._01_Lecture;

import java.math.BigDecimal;
import java.util.Scanner;

public class _03_BigFactorial {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Read input value
        int factorial = Integer.parseInt(scan.nextLine());

        // Add variable
        BigDecimal result = new BigDecimal(1);

        // Determine the factorial of the input
        for (int i = 1; i <= factorial; i++) {
            result = result.multiply(new BigDecimal(String.valueOf(i)));
        }

        // Print result
        System.out.println(result);

        scan.close();
    }
}
