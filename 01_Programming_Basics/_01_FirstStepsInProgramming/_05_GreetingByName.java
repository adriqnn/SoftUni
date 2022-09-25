package _01_Programming_Basics._01_FirstStepsInProgramming;

import java.util.Scanner;

public class _05_GreetingByName {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String name = scan.nextLine();

        System.out.println("Hello, " + name + "!");
    }
}
