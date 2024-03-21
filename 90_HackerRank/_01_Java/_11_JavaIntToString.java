package _05_HackerRank._01_Java;

import java.util.Scanner;

public class _11_JavaIntToString {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();
        String s = Integer.toString(n);

        if(n >= (-100) && n <= 100){
            System.out.println("Good job");
        } else
            System.out.print("Wrong answer");

        scan.close();
    }
}
