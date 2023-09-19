package _03_JavaAdvanced._05_FunctionalProgrammingExercise;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class _05_ReverseAndExclude {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Read input value
        String input = scan.nextLine();

        // Add variables
        List<Integer> numbers = Arrays.stream(input.split("\\s+")).mapToInt(Integer::parseInt).boxed().collect(Collectors.toList());
        int n = Integer.parseInt(scan.nextLine());

        Collections.reverse(numbers);

        // Predicate to match the given condition for division
        Predicate<Integer> checkDivision = number -> number % n == 0;
        numbers.removeIf(number -> number % n == 0);
        numbers.removeIf(checkDivision);

        // Print result
        numbers.forEach(number -> System.out.print(number + " "));

        scan.close();
    }
}
