package _01_Programming_Basics._08_Exam;

import java.util.Scanner;

public class _03_MultiplyTable {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.nextLine());

        int num =n;

        int n1 = num%10;
        num = n/10;
        int n2 = num%10;
        num = num/10;
        int n3 =num%10;

        for (int i = 1; i <= n1; i++) {
            for (int j = 1; j <= n2; j++) {
                for (int k = 1; k <= n3; k++) {

                    int multiplication = i*k*j;
                    System.out.printf("%d * %d * %d = %d;",i,j,k,multiplication);
                    System.out.println();

                }
            }
        }
    }
}
