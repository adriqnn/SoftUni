package _05_HackerRank._01_Java;

import java.math.BigInteger;
import java.util.Scanner;

public class _27_JavaBigInteger {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        BigInteger bigIntegerOne = new BigInteger(scan.nextLine());
        BigInteger bigIntegerTwo = new BigInteger(scan.nextLine());

        System.out.println(bigIntegerOne.add(bigIntegerTwo));
        System.out.println(bigIntegerOne.multiply(bigIntegerTwo));

        scan.close();
    }
}
