package _03_JavaAdvanced._03_SetsAndMapsAdvanced;

import java.util.*;
import java.util.stream.Collectors;

public class _04_CountRealNumbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        List<Double> numbers = Arrays.stream(scan.nextLine().split("\\s+")).map(Double::parseDouble).collect(Collectors.toList());
        Map<Double,Integer> map = new LinkedHashMap<>();
        numbers.stream().forEach(e->{
            map.putIfAbsent(e,0);
            map.put(e,map.get(e) + 1);
        });
        map.entrySet().forEach(e -> {
            System.out.printf("%.1f -> %d%n",e.getKey(),e.getValue());
        });
    }
}
