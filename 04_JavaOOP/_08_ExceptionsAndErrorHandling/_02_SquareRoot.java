package _04_JavaOOP._08_ExceptionsAndErrorHandling;

import java.util.Scanner;

public class _02_SquareRoot {
    public static void main(String[] args) {
        String numberAsString = new Scanner(System.in).nextLine();
        double sqrt = -1;

        try{
            sqrt = Math.sqrt(Integer.parseInt(numberAsString));
        }catch (IllegalArgumentException e){
            System.out.println("Invalid");
        }
        if(sqrt != -1){
            System.out.printf("%.2f%n", sqrt);
        }
        System.out.println("Goodbye");
    }
}


