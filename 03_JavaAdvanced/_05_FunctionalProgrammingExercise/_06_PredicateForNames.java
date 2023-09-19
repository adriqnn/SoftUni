package _03_JavaAdvanced._05_FunctionalProgrammingExercise;

import java.util.Arrays;
import java.util.Scanner;
import java.util.function.Predicate;

public class _06_PredicateForNames {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Read input values
        int n = Integer.parseInt(scan.nextLine());
        String[] names = scan.nextLine().split("\\s+");

        // Predicate to check for a name length
        Predicate<String> validLength = name -> name.length() <= n;

        // Print result
        Arrays.stream(names).filter(validLength).forEach(System.out::println);

        scan.close();
    }
}
