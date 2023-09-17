package _03_JavaAdvanced._05_FunctionalProgramming;

import java.util.Arrays;
import java.util.Scanner;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class _06_FindEvensOrOdds {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        // Read input values
        int[] range = Arrays.stream(scan.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();
        String condition = scan.nextLine();
        
        // Print result
        printNumbersIn(range[0], range[1], condition.equals("even") ? n -> n % 2 == 0: n -> n % 2 != 0);
        
        scan.close();
    }
    private static void printNumbersIn(int beginInclusive, int endInclusive, Predicate<Integer> predicate){
        System.out.println(IntStream.rangeClosed(beginInclusive, endInclusive).boxed().filter(predicate).map(String::valueOf).collect(Collectors.joining(" ")));
    }
}
