package _01_ProgrammingBasics._02_ConditionalStatements;

import java.util.Scanner;

public class _03_EvenOrOdd {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int num = Integer.parseInt(scan.nextLine());

        if (num % 2 == 0){
            System.out.println("even");
        } else {
            System.out.println("odd");
        }
    }
}
