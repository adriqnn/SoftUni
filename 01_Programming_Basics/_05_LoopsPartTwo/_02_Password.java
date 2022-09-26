package _01_Programming_Basics._05_LoopsPartTwo;

import java.util.Scanner;

public class _02_Password {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String username = scan.nextLine();
        String password = scan.nextLine();

        String input = scan.nextLine();

        while(!input.equals(password)){
            input = scan.nextLine();
        }
        System.out.printf("Welcome %s!",username);
    }
}
