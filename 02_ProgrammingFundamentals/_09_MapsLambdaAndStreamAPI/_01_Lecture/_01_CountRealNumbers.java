package _02_ProgrammingFundamentals._09_MapsLambdaAndStreamAPI._01_Lecture;

import java.util.Arrays;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class _01_CountRealNumbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Read input values
        String[] input = scan.nextLine().split(" ");
        double[] nums = Arrays.stream(input).mapToDouble(Double::parseDouble).toArray();

        // Add variable
        Map<Double, Integer> numbers = new TreeMap<>();

        // Count numbers
        for (double number : nums) {
            if (!numbers.containsKey(number)) {
                numbers.put(number, 1);
            } else {
                int occurrences = numbers.get(number);
                occurrences++;
                numbers.put(number, occurrences);
            }
        }

        // Print result
        for (Map.Entry<Double, Integer> entry : numbers.entrySet()) {
            System.out.printf("%.0f -> %d%n", entry.getKey(), entry.getValue());
        }

        scan.close();
    }
}
