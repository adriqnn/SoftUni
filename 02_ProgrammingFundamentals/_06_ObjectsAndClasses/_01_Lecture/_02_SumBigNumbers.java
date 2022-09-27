package _02_ProgrammingFundamentals._06_ObjectsAndClasses._01_Lecture;

import java.math.BigInteger;
import java.util.Scanner;

public class _02_SumBigNumbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        BigInteger one = new BigInteger(scan.nextLine());
        BigInteger two = new BigInteger(scan.nextLine());

        BigInteger sum = one.add(two);
        System.out.println(sum);
    }
}
