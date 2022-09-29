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
        String input = scan.nextLine();
        List<Integer> numbers = Arrays.stream(input.split("\\s+")).map(Integer::parseInt).collect(Collectors.toList());
        Function<List<Integer>, Integer> getMinNumber = Collections::min;
        System.out.println(getMinNumber.apply(numbers));

//        Consumer<List<Integer>> print = list -> System.out.println(Collections.min(list));
//        print.accept(numbers);

//        System.out.println(Collections.min(numbers));
    }
}
