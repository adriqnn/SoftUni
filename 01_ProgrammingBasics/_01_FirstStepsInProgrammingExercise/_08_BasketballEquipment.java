package _01_ProgrammingBasics._01_FirstStepsInProgrammingExercise;

import java.util.Scanner;

public class _08_BasketballEquipment {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Read input data
        int trainingPrice = Integer.parseInt(scan.nextLine());

        // Calculate prices for each equipment
        double shoes = trainingPrice * 0.6;
        double outfit = shoes * 0.8;
        double basketball = outfit * 0.25;
        double accessories = basketball * 0.2;

        // Calculate the total cost
        double totalSum =  trainingPrice + shoes + outfit + basketball + accessories;

        // Print the total cost
        System.out.printf("%.2f%n", totalSum);
        
        scan.close();
    }
}
