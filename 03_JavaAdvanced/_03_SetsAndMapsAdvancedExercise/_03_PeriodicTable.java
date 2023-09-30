package _03_JavaAdvanced._03_SetsAndMapsAdvancedExercise;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class _03_PeriodicTable {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Read input value
        int n = Integer.parseInt(scan.nextLine());

        // Add variable
        Set<String> elements = new TreeSet<>();

        // Unique periodic table elements
        for (int i = 0; i < n; i++) {
            String[] input = scan.nextLine().split("\\s+");
            elements.addAll(Arrays.asList(input));

            /*for (int j = 0; j < input.length; j++) {
                elements.add(input[j]);
            }*/
            /*Collections.addAll(elements, input);*/
        }

        // Print result
        for (String e : elements) {
            System.out.print(e + " ");
        }

        scan.close();
    }
}

