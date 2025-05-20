package _02_ProgrammingFundamentals._09_MapsLambdaAndStreamAPI._03_MoreExercises;

import java.util.*;
import java.util.stream.Collectors;

public class _05_DragonArmy {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Read input value
        int inputLines = Integer.parseInt(scan.nextLine());

        // Add variable
        Map<String, Map<String, List<Double>>> database = new LinkedHashMap<>();

        // Create database for dragons
        for (int i = 0; i < inputLines; i++) {
            String[] information = scan.nextLine().split(" ");

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

        // Print results
        database.entrySet().forEach(type -> {
            String typeOf = type.getKey();
            
            double dmgAverage = type.getValue().values().stream().map(e -> e.get(0)).mapToDouble(Double::valueOf).sum() / type.getValue().size();
            double healthAverage = type.getValue().values().stream().map(e -> e.get(1)).mapToDouble(Double::valueOf).sum() / type.getValue().size();
            double armorAverage = type.getValue().values().stream().map(e -> e.get(2)).mapToDouble(Double::valueOf).sum() / type.getValue().size();

            String firstLine = String.format("%s::(%.2f/%.2f/%.2f)", typeOf, dmgAverage, healthAverage, armorAverage);
            String secondLine = type.getValue().entrySet().stream().map(e -> String.format("-%s -> damage: %.0f, health: %.0f, armor: %.0f", e.getKey(), e.getValue().get(0), e.getValue().get(1), e.getValue().get(2))).collect(Collectors.joining("\n"));

            System.out.printf("%s%n%s%n", firstLine, secondLine);
        });
        
        scan.close();
    }
}
