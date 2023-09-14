package _03_JavaAdvanced._03_SetsAndMapsAdvanced;

import java.util.*;
import java.util.stream.Collectors;

public class _04_CountRealNumbersV2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Read input values
        List<Double> numbers = Arrays.stream(scan.nextLine().split("\\s+"))
                .map(Double::parseDouble)
                .collect(Collectors.toList());

        // Count real numbers using a LinkedHashMap
        Map<Double, Integer> map = new LinkedHashMap<>();

        for (Double number : numbers) {
            map.put(number, map.getOrDefault(number, 0) + 1);
        }

        // Print result
        map.forEach((key, value) -> System.out.printf("%.1f -> %d%n", key, value));

        scan.close();
    }
}
