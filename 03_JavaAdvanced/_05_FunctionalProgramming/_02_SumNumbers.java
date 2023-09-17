package _03_JavaAdvanced._05_FunctionalProgramming;

import java.util.Arrays;
import java.util.Scanner;
import java.util.function.Function;

public class _02_SumNumbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Read input value
        String input = scan.nextLine();
        
        //Function<String, Integer> countIntegersInString = str ->{ return str.split(", ").length; };
        
        // Function for counting 
        Function<String, Integer> countIntegersInString = str -> str.split(", ").length;
        
        // Function for sum
        Function<String, Integer> sumIntegersInString = str -> Arrays.stream(str.split(", ")).mapToInt(Integer::parseInt).sum();
        
        // Print result
        System.out.println("Count = " + countIntegersInString.apply(input));
        System.out.println("Sum = " + sumIntegersInString.apply(input));
        
        scan.close();
    }
}
