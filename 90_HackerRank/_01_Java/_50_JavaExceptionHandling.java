package _05_HackerRank._01_Java;

import java.util.Scanner;

public class _50_JavaExceptionHandling {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        try{
           int n = Integer.parseInt(scan.nextLine());
           int m = Integer.parseInt(scan.nextLine());
           System.out.println(n / m);
        }catch (NumberFormatException e){
            System.out.println("java.util.InputMismatchException");
        }catch (Exception f){
            System.out.println(f);
        }

        scan.close();
    }
}
