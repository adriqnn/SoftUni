package _04_JavaOOP._01_WorkingWithAbstraction;

import java.util.Scanner;

public class _01_RhombusOfStarsV2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());
        for (int i = 1; i < n; i++) {
            for (int j = 0; j < n - i; j++) {
                System.out.print(" ");
            }
            for (int f = 0; f < i; f++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        for (int i = 0; i < n; i++) {
            System.out.print("* ");
        }
        System.out.println();
        for (int i = 1; i < n; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            for (int f = 0; f < n-i; f++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
