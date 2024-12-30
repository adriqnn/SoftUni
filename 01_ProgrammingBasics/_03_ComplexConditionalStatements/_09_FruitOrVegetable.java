package _01_ProgrammingBasics._03_ComplexConditionalStatements;

import java.util.Scanner;

public class _09_FruitOrVegetable {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Read input value
        String entry = scan.nextLine();

        // Print based on the input if the item is fruit, vegetable or unknown
        switch (entry) {
            case "banana":
            case "apple":
            case "kiwi":
            case "cherry":
            case "lemon":
            case "grapes":
                System.out.println("fruit");
                break;
            case "tomato":
            case "cucumber":
            case "pepper":
            case "carrot":
                System.out.println("vegetable");
                break;
            default:
                System.out.println("unknown");
                break;
        }

        scan.close();
    }
}
