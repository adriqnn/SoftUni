package _03_JavaAdvanced._03_SetsAndMapsAdvanced;

import java.util.*;
import java.util.stream.Collectors;

public class _04_CountRealNumbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Read input values
        List<Double> numbers = Arrays.stream(scan.nextLine().split("\\s+")).map(Double::parseDouble).collect(Collectors.toList());

        // Add variable
        Map<Double, Integer> map = new LinkedHashMap<>();

        // Count real numbers
        numbers.forEach(e -> {
            map.putIfAbsent(e, 0);
            map.put(e, map.get(e) + 1);
        });

//        numbers.stream().forEach(e -> {
//            map.putIfAbsent(e, 0);
//            map.put(e, map.get(e) + 1);
//        });

        // Print result
        map.forEach((key, value) -> System.out.printf("%.1f -> %d%n", key, value));

//        map.entrySet().forEach(e -> {
//            System.out.printf("%.1f -> %d%n",e.getKey(),e.getValue());
//        });

        scan.close();
    }
}
