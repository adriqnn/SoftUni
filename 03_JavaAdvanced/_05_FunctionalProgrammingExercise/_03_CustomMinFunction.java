package _03_JavaAdvanced._05_FunctionalProgrammingExercise;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.stream.Collectors;

public class _03_CustomMinFunction {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Read input value
        String input = scan.nextLine();

        // Input values in Integer list
        List<Integer> numbers = Arrays.stream(input.split("\\s+")).map(Integer::parseInt).collect(Collectors.toList());

        // Function for extracting the min number
        Function<List<Integer>, Integer> getMinNumber = Collections::min;

        // Print result
        System.out.println(getMinNumber.apply(numbers));

        // Other Solution
//        Consumer<List<Integer>> print = list -> System.out.println(Collections.min(list));
//        print.accept(numbers);

//        System.out.println(Collections.min(numbers));
    }
}
