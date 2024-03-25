package _05_HackerRank._01_Java;

import java.util.InputMismatchException;
import java.util.Scanner;

public class _50_JavaExceptionHandlingV2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        try{
            System.out.println(scan.nextInt() / scan.nextInt());
        } catch (InputMismatchException | ArithmeticException e) {
            System.out.println(
                    e instanceof InputMismatchException ? e.getClass().getName() : e);
        }
    }
}
