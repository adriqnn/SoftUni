package _03_JavaAdvanced._05_FunctionalProgramming;

import java.util.Arrays;
import java.util.Scanner;
import java.util.function.UnaryOperator;

public class _04_AddVAT {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        // Unary operator that calculates VAT
        UnaryOperator<Double> vatCalculator = val -> val * 1.20;
        
        // Print result
        System.out.println("Prices with VAT:");
        Arrays.stream(scan.nextLine().split(", ")).map(Double::parseDouble).map(vatCalculator).forEach(e -> System.out.printf("%.2f%n",e));
        
        scan.close();
    }
}
