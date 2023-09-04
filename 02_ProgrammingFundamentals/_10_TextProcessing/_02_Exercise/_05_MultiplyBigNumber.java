package _02_ProgrammingFundamentals._10_TextProcessing._02_Exercise;

import java.math.BigDecimal;
import java.util.Scanner;

public class _05_MultiplyBigNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Read input values
        BigDecimal one = new BigDecimal(scan.nextLine());
        BigDecimal two = new BigDecimal(scan.nextLine());

        // Add variable
        BigDecimal result = one.multiply(two);

        // Print result
        System.out.println(result);

        scan.close();
    }
}
