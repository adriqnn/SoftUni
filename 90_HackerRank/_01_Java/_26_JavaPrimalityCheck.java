package _05_HackerRank._01_Java;

import java.math.BigInteger;
import java.util.Scanner;

public class _26_JavaPrimalityCheck {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String n = scan.nextLine();
        BigInteger number =  new BigInteger(n);

        System.out.println(number.isProbablePrime(1) ? "prime" : "not prime");

        scan.close();
    }
}
