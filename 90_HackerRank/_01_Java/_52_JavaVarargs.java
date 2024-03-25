package _05_HackerRank._01_Java;

import java.util.Scanner;

public class _52_JavaVarargs {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n1 = Integer.parseInt(scan.nextLine());
        int n2 = Integer.parseInt(scan.nextLine());
        int n3 = Integer.parseInt(scan.nextLine());
        int n4 = Integer.parseInt(scan.nextLine());
        int n5 = Integer.parseInt(scan.nextLine());
        int n6 = Integer.parseInt(scan.nextLine());

        System.out.printf("%d+%d=%d%n",n1,n2,n1+n2);
        System.out.printf("%d+%d+%d=%d%n",n1,n2,n3,n1+n2+n3);
        System.out.printf("%d+%d+%d+%d+%d=%d%n",n1,n2,n3,n4,n5,n1+n2+n3+n4+n5);
        System.out.printf("%d+%d+%d+%d+%d+%d=%d%n",n1,n2,n3,n4,n5,n6,n1+n2+n3+n4+n5+n6);
    }
}
