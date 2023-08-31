package _02_ProgrammingFundamentals._06_ObjectsAndClasses._01_Lecture;

import java.math.BigInteger;
import java.util.Scanner;

public class _02_SumBigNumbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Read input values
        BigInteger one = new BigInteger(scan.nextLine());
        BigInteger two = new BigInteger(scan.nextLine());

        // Sum the input values
        BigInteger sum = one.add(two);

        // Print result
        System.out.println(sum);
        
        scan.close();
    }
}
