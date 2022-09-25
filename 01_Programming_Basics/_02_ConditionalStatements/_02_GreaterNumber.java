package _01_Programming_Basics._02_ConditionalStatements;

import java.util.Scanner;

public class _02_GreaterNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int one = Integer.parseInt(scan.nextLine());
        int two = Integer.parseInt(scan.nextLine());

        System.out.println(Math.max(one, two));
    }
}
