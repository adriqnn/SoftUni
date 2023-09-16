package _03_JavaAdvanced._03_SetsAndMapsAdvancedExercise;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.util.stream.Collectors;

public class _13_DragonArmyV2 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        // Read input values
        int inputLines = Integer.parseInt(reader.readLine());

        // Add variables
        Map<String, Map<String, List<Double>>> database = new LinkedHashMap<>();

        // Create dragon database
        for (int i = 0; i < inputLines; i++) {
            String[] information = reader.readLine().split(" ");

            String type = information[0];
            String name = information[1];
            double damage = information[2].equals("null") ? 45 : Double.parseDouble(information[2]);
            double health = information[3].equals("null") ? 250 : Double.parseDouble(information[3]);
            double armor = information[4].equals("null") ? 10 : Double.parseDouble(information[4]);

            database.putIfAbsent(type, new TreeMap<>());
            List<Double> stats = new ArrayList<>();
            Collections.addAll(stats, damage, health, armor);
            database.get(type).put(name, stats);
        }

        // Print result
        database.entrySet().forEach(type -> {
            String typeOf = type.getKey();

            double dmgAverage = type.getValue().values().stream().map(e -> e.get(0)).mapToDouble(Double::valueOf).sum() / type.getValue().size();
            double healthAverage = type.getValue().values().stream().map(e -> e.get(1)).mapToDouble(Double::valueOf).sum() / type.getValue().size();
            double armorAverage = type.getValue().values().stream().map(e -> e.get(2)).mapToDouble(Double::valueOf).sum() / type.getValue().size();

            String firstLine = String.format("%s::(%.2f/%.2f/%.2f)", typeOf, dmgAverage, healthAverage, armorAverage);
            String secondLine = type.getValue().entrySet().stream().map(e -> String.format("-%s -> damage: %.0f, health: %.0f, armor: %.0f", e.getKey(),e.getValue().get(0), e.getValue().get(1), e.getValue().get(2))).collect(Collectors.joining("\n"));

            System.out.printf("%s%n%s%n", firstLine, secondLine);
        });

        reader.close();
    }
}
