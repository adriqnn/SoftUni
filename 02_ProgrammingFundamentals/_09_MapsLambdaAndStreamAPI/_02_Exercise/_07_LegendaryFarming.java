package _02_ProgrammingFundamentals._09_MapsLambdaAndStreamAPI._02_Exercise;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class _07_LegendaryFarming {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Read input value
        String input = scan.nextLine();

        // Add variables
        Map<String, Integer> legendaries = new LinkedHashMap<>();
        Map<String, Integer> garbage = new LinkedHashMap<>();
        legendaries.put("Shadowmourne", 0);
        legendaries.put("Valanyr", 0);
        legendaries.put("Dragonwrath", 0);

        boolean collected = false;

        // Make legendary statistics
        while (!collected) {
            String[] items = input.split("\\s+");

            for (int i = 0; i < items.length; i += 2) {
                String item = items[i+1].toLowerCase();
                int quantity = Integer.parseInt(items[i]);

                if (item.equals("shards")) {
                    int shadowmourne = legendaries.get("Shadowmourne");

                    if (shadowmourne + quantity >= 250) {
                        System.out.println("Shadowmourne obtained!");
                        collected = true;

                        legendaries.put("Shadowmourne", shadowmourne + quantity - 250);
                        break;
                    }

                    legendaries.put("Shadowmourne", shadowmourne + quantity);

                } else if (item.equals("fragments")) {
                    int valanyr = legendaries.get("Valanyr");

                    if (valanyr + quantity >= 250) {
                        System.out.println("Valanyr obtained!");
                        collected = true;

                        legendaries.put("Valanyr", valanyr + quantity - 250);
                        break;
                    }

                    legendaries.put("Valanyr", valanyr + quantity);

                } else if (item.equals("motes")) {
                    int dragonwrath = legendaries.get("Dragonwrath");

                    if (dragonwrath + quantity >= 250) {
                        System.out.println("Dragonwrath obtained!");
                        collected = true;

                        legendaries.put("Dragonwrath", dragonwrath + quantity - 250);
                        break;
                    }

                    legendaries.put("Dragonwrath", dragonwrath + quantity);

                } else {
                    if (!garbage.containsKey(item)) {
                        garbage.put(item, 0);
                    }

                    int inBags = garbage.get(item);

                    garbage.put(item, quantity + inBags);
                }
            }

            if (collected) {
                break;
            }

            input = scan.nextLine();
        }

        // Print result
        System.out.printf("shards: %d%n", legendaries.get("Shadowmourne"));
        System.out.printf("fragments: %d%n", legendaries.get("Valanyr"));
        System.out.printf("motes: %d%n", legendaries.get("Dragonwrath"));

        garbage.entrySet().forEach(e -> System.out.printf("%s: %d%n", e.getKey(), e.getValue()));

        scan.close();
    }
}
