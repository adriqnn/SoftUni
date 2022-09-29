package _01_ProgrammingBasics._06_NestedLoopsExercise;

import java.util.Scanner;

public class _03_SumPrimeNonPrime {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String console = scan.nextLine();

        int prime = 0;
        int nonprime =0;

        while(!console.equals("stop")){
            boolean isPrime = true;
            int num = Integer.parseInt(console);
            if (num<0){
                System.out.println("Number is negative.");
                console = scan.nextLine();
                continue;
            }
            for (int i = 2; i < num; i++) {
                if (num%i == 0){
                    nonprime += num;
                    isPrime = false;
                    break;
                }
            }
            if (isPrime){
                prime +=num;
            }
            console = scan.nextLine();
        }
        System.out.printf("Sum of all prime numbers is: %d%n",prime);
        System.out.printf("Sum of all non prime numbers is: %d", nonprime);
    }
}
