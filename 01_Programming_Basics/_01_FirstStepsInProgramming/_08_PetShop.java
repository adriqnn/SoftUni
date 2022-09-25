package _01_Programming_Basics._01_FirstStepsInProgramming;

import java.util.Scanner;

public class _08_PetShop {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int dogsCount = Integer.parseInt(scan.nextLine());
        int otherAnimalsCount = Integer.parseInt(scan.nextLine());

        double resultA = dogsCount * 2.50;
        double resultB = otherAnimalsCount * 4.00;

        System.out.println(resultA + resultB);
    }
}
