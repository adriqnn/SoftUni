package _02_ProgrammingFundamentals._02_DataTypesAndVariables._01_Lecture;

import java.math.BigDecimal;
import java.util.Scanner;

public class _03_ExactSumOfRealNumbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Read input value
        int n = Integer.parseInt(scan.nextLine());

        // Add variable
        BigDecimal sumOfRealNumbers = new BigDecimal(0);
        
        // Sum the numbers
        for (int i = 0; i < n; i++) {
            BigDecimal realNumber = new BigDecimal(scan.nextLine());
            sumOfRealNumbers = sumOfRealNumbers.add(realNumber);
        }
        
        // Print result
        System.out.println(sumOfRealNumbers);

        scan.close();
    }
}
