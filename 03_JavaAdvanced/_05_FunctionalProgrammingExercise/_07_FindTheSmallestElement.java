package _03_JavaAdvanced._05_FunctionalProgrammingExercise;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.stream.Collectors;

public class _07_FindTheSmallestElement {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        List<Integer> numbers = Arrays.stream(scan.nextLine().split("\\s+")).map(Integer::parseInt).collect(Collectors.toList());
        Consumer<List<Integer>> printMinIndexOfMinElement = list -> {
            int min = Collections.min(list);
            System.out.println(list.lastIndexOf(min));
        };
        printMinIndexOfMinElement.accept(numbers);
//        Function<List<Integer>,Integer> getIndexOfMinElement = list -> list.lastIndexOf(Collections.min(list));
//        System.out.println(getIndexOfMinElement.apply(numbers));
    }
}
