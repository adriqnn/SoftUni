package _01_ProgrammingBasics._03_ComplexConditionalStatements;

import java.util.Scanner;

public class _03_AnimalType {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Read animal input value
        String animal = scan.nextLine().toLowerCase();

        // Determine whether the animal is mammal, reptile or unknown
        switch (animal) {
            case "dog":
                System.out.println("mammal");
                break;
            case "crocodile":
            case "tortoise":
            case "snake":
                System.out.println("reptile");
                break;
            default:
                System.out.println("unknown");
                break;
        }

        scan.close();
    }
}
