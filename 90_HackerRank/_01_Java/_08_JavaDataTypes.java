package _05_HackerRank._01_Java;

import java.util.Scanner;

public class _08_JavaDataTypes {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();
        for (int i = 0; i < n; i++) {
            try{
                long num = scan.nextLong();
                System.out.println(num + " can be fitted in:");

                if (num>=Byte.MIN_VALUE && num<=Byte.MAX_VALUE){
                    System.out.println("* byte");
                }

                if (num>=Short.MIN_VALUE && num<=Short.MAX_VALUE){
                    System.out.println("* short");
                }

                if (num>=Integer.MIN_VALUE && num<=Integer.MAX_VALUE){
                    System.out.println("* int");
                }

                if (num>=Long.MIN_VALUE && num<=Long.MAX_VALUE){
                    System.out.println("* long");
                }
            } catch (Exception e){
                System.out.println(scan.next() + " can't be fitted anywhere.");
            }
        }

        scan.close();
    }
}
