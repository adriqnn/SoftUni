package _04_JavaOOP._08_ExceptionsAndErrorHandling;

import java.util.Scanner;

public class _02_SquareRoot {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String numberAsString = scan.nextLine();

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

        scan.close();
    }
}
