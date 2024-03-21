package _05_HackerRank._01_Java;

import java.util.Scanner;

public class _04_JavaStdinAndStdout2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n1 = Integer.parseInt(scan.nextLine());
        double n2 = Double.parseDouble(scan.nextLine());
        String n3 = scan.nextLine();

        System.out.println("String: " + n3);
        System.out.println("Double: " + n2);
        System.out.println("Int: " + n1);
    }
}
