package _03_JavaAdvanced._05_FunctionalProgramming;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class _01_SortEvenNumbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        /*
        Stream<String> stream = Arrays.stream(scan.nextLine().split(", "));
        IntStream intStream = stream.mapToInt(Integer::parseInt);
        int[] numbers = intStream.toArray();
        Stream<Integer> streamIntegers = stream.map(Integer::parseInt);
        Object[] objects = streamIntegers.toArray();
        Integer[] objectsInts = streamIntegers.toArray(Integer[]::new);
        List<Integer> collect = streamIntegers.collect(Collectors.toList());
        //?intStream.collect(Collectors.toList());
        */

        // Read input values and separate even numbers
        List<Integer> numbers = Arrays.stream(scan.nextLine().split(", ")).map(Integer::parseInt).collect(Collectors.toList());
        List<Integer> evenNumbers = numbers.stream().filter(e -> e % 2 == 0).collect(Collectors.toList());

        // Generate result
        String firstOutput = evenNumbers.stream().map(String::valueOf).collect(Collectors.joining(", "));
        String secondOutput = evenNumbers.stream().sorted().map(String::valueOf).collect(Collectors.joining(", "));

        // Print result
        System.out.println(firstOutput);
        System.out.println(secondOutput);

        scan.close();
    }
}
