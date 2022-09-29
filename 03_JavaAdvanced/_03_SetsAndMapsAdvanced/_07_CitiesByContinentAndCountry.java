package _03_JavaAdvanced._03_SetsAndMapsAdvanced;

import java.util.*;

public class _07_CitiesByContinentAndCountry {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());
        Map<String, Map<String, List<String>>> countries = new LinkedHashMap<>();
        while(n-- > 0){
            String[] tokens =scan.nextLine().split("\\s+");
            String continent = tokens[0];
            String country = tokens[1];
            String city = tokens[2];
            countries.putIfAbsent(continent,new LinkedHashMap<>());
            Map<String, List<String>> map = countries.get(continent);
            map.putIfAbsent(country,new ArrayList<>());
            List<String> cities = map.get(country);
            cities.add(city);
        }
        countries.entrySet().stream().forEach(e -> {
            System.out.println(e.getKey() + ":");
            e.getValue().entrySet().stream().forEach(ie -> {
                System.out.println("  " + ie.getKey() + " -> " + String.join(", ", ie.getValue()));
            });
        });
    }
}
