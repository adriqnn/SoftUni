package _02_ProgrammingFundamentals._09_MapsLambdaAndStreamAPI._03_MoreExercises;

import java.util.*;
import java.util.stream.Collectors;

public class _04_SnowWhite {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Read input value
        String input = scan.nextLine();

        // Add variables
        Map<String, Integer> dwarfs = new LinkedHashMap<>();
        Map<String, Integer> colorGroups = new LinkedHashMap<>();

        // Create database for dwarfs
        while (!input.equals("Once upon a time")) {
            String[] information = input.split(" <:> ");

            String name = information[0];
            String color = information[1];
            int physics = Integer.parseInt(information[2]);

            String key = name + ">>>>>" + color;

            colorGroups.putIfAbsent(color, 0);
            colorGroups.put(color, colorGroups.get(color) + 1);

            if (!dwarfs.containsKey(key)) {
                dwarfs.put(key, physics);
            } else {
                if (dwarfs.get(key) < physics) {
                    dwarfs.put(key, physics);
                    colorGroups.put(color, colorGroups.get(color) - 1);
                }
            }
            
            input = scan.nextLine();
        }

        // Print result
        dwarfs.entrySet().stream().sorted((pair1, pair2) -> {
            int sort = Integer.compare(pair2.getValue(), pair1.getValue());
            
            if (sort == 0) {

                String[] color1 = pair1.getKey().split(">>>>>");
                String[] color2 = pair2.getKey().split(">>>>>");

                int size1 = colorGroups.get(color1[1]);
                int size2 = colorGroups.get(color2[1]);
                
                sort = Integer.compare(size2, size1);
            }
            
            return sort;
        }).forEach(pair -> {
            String[] print = pair.getKey().split(">>>>>");
            System.out.printf("(%s) %s <-> %d%n", print[1], print[0], pair.getValue());
        });
        
        scan.close();
    }
}
