package _03_JavaAdvanced._05_FunctionalProgrammingExercise;

import java.util.Arrays;
import java.util.Scanner;
import java.util.function.Consumer;

public class _02_KnightsOfHonor {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Read input value
        String input = scan.nextLine();

        // Input values
        String[] names = input.split("\\s+");
        
        // Printer consumer
        Consumer<String> printName = name -> System.out.println("Sir " + name);

        // Print result
        Arrays.stream(names).forEach(printName);

        scan.close();
    }
}
