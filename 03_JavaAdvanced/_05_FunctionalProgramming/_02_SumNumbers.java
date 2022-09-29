package _03_JavaAdvanced._05_FunctionalProgramming;

import java.util.Arrays;
import java.util.Scanner;
import java.util.function.Function;

public class _02_SumNumbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        //Function<String,Integer> countIntegersInString = str ->{ return str.split(", ").length; };
        Function<String,Integer> countIntegersInString = str -> str.split(", ").length;
        Function<String,Integer> sumIntegersInString = str -> Arrays.stream(str.split(", ")).mapToInt(Integer::parseInt).sum();
        System.out.println("Count = " + countIntegersInString.apply(input));
        System.out.println("Sum = " + sumIntegersInString.apply(input));
    }
}
