package _03_JavaAdvanced._05_FunctionalProgrammingExercise;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.function.BiFunction;
import java.util.stream.Collectors;

public class _09_ListOfPredicates {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Read input values
        int n = Integer.parseInt(scan.nextLine());

        // Boxed
        List<Integer> numbersForDivision = Arrays.stream(scan.nextLine().split("\\s+")).mapToInt(Integer::parseInt).boxed().collect(Collectors.toList());

        // BiFunction that finds all numbers divisible by given output
        BiFunction<List<Integer>, Integer, Boolean> isDivisible = ((list, number) -> {
            for (int integer : list) {
                if (number % integer != 0) {
                    return false;
                }
            }

            return true;
        });

        // Print result
        for (int i = 1; i <= n; i++) {
            if(isDivisible.apply(numbersForDivision, i)){
                System.out.print(i + " ");
            }
        }

        scan.close();
    }
}
