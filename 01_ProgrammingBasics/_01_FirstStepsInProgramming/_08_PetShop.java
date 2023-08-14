package _01_ProgrammingBasics._01_FirstStepsInProgramming;

import java.util.Scanner;

public class _08_PetShop {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Read input data
        int dogsCount = Integer.parseInt(scan.nextLine());
        int otherAnimalsCount = Integer.parseInt(scan.nextLine());

        // Calculate costs for dogs and other animals
        double costForAllDogs = dogsCount * 2.50;
        double costForAllTheOtherAnimals = otherAnimalsCount * 4.00;

        // Calculate total cost
        double totalCost = costForAllDogs + costForAllTheOtherAnimals;

        // Print the total cost
        System.out.println(totalCost);

        scan.close();
    }
}
