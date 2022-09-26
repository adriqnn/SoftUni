package _02_ProgrammingFundamentals._01_BasicSyntaxConditionalStatementsAndLoops._02_Exercise;

import java.util.Scanner;

public class _02_Division {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.nextLine());

        if(n % 10 == 0){
            System.out.print("The number is divisible by 10");
        }else if(n % 7 == 0){
            System.out.print("The number is divisible by 7");
        }else if(n % 6 == 0){
            System.out.print("The number is divisible by 6");
        }else if(n % 3 == 0){
            System.out.print("The number is divisible by 3");
        }else if(n % 2 == 0){
            System.out.print("The number is divisible by 2");
        }else{
            System.out.println("Not divisible");
        }
    }
}
