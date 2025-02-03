package _02_ProgrammingFundamentals._01_BasicSyntaxConditionalStatementsAndLoops._03_MoreExercises;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.Collections;

public class _01_SortNumbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Add variable
        List<Integer> numbers = new ArrayList<>();

        // Read input values
        for (int i = 0; i < 3; i++) {
            int n = Integer.parseInt(scan.nextLine());
            numbers.add(n);
        }

        // Additional methods of solving
        /*numbers.stream().sorted((e1, e2) -> Integer.compare(e2, e1)).collect(Collectors.toList()).forEach(System.out::println);*/
        /*numbers.stream().sorted(Comparator.reverseOrder()).forEach(e -> System.out.println(e));*/
        //Collections.reverse(numbers);

        // Print result
        numbers.stream().sorted((e1, e2) -> Integer.compare(e2, e1)).collect(Collectors.toList()).forEach(System.out::println);

        scan.close();
    }
}
