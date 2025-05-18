package _02_ProgrammingFundamentals._09_MapsLambdaAndStreamAPI._03_MoreExercises;

import java.util.*;
import java.util.stream.Collectors;

public class _04_SnowWhiteV2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Add variables
        String input;
        Map<String, Integer> dwarfs = new LinkedHashMap<>();
        Map<String, Integer> colorGroups = new LinkedHashMap<>();

        // Read input values and create database for dwarfs
        while(!"Once upon a time".equals(input = scan.nextLine())){
            String[] information = input.split(" <:> ");

            String dwarf = information[0] + ">>>>>" + information[1];
            String color = information[1];
            int physics = Integer.parseInt(information[2]);

            colorGroups.putIfAbsent(color, 0);
            colorGroups.put(color, colorGroups.get(color) + 1);

            if (dwarfs.containsKey(dwarf)) {
                if (dwarfs.get(dwarf) < physics) {
                    dwarfs.put(dwarf, physics);
                    colorGroups.put(color, colorGroups.get(color) - 1);
                }
            } else {
                dwarfs.put(dwarf, physics);
            }
        }

        List<Dwarf> unorderedDwarfs = new ArrayList<>();
        dwarfs.forEach((key, value) -> {
            String[] info = key.split(">>>>>");
            
            String name = info[0];
            String color = info[1];
            int colorGroup = colorGroups.get(color);
            
            unorderedDwarfs.add(new Dwarf(name, color, value, colorGroup));
        });

        // Print result
        System.out.println(unorderedDwarfs.stream().sorted(Comparator.comparing(Dwarf::getPhysics).reversed().thenComparing(Dwarf::getColorGrp, Comparator.reverseOrder()))
                .map(e -> String.format("(%s) %s <-> %d", e.getColor(), e.getName(), e.getPhysics())).collect(Collectors.joining("\n")));

        scan.close();
    }
}


// Create practice Dwarf class
class Dwarf {
    private String name;
    private String color;
    private int physics;
    private int colorGrp;

    public Dwarf(String name, String color, int physics, int colorGrp) {
        this.name = name;
        this.color = color;
        this.physics = physics;
        this.colorGrp = colorGrp;
    }

    public String getName() {
        return this.name;
    }

    public Dwarf setName(String name) {
        this.name = name;
        return this;
    }

    public String getColor() {
        return this.color;
    }

    public Dwarf setColor(String color) {
        this.color = color;
        return this;
    }

    public int getPhysics() {
        return this.physics;
    }

    public Dwarf setPhysics(int physics) {
        this.physics = physics;
        return this;
    }

    public int getColorGrp() {
        return this.colorGrp;
    }

    public Dwarf setColorGrp(int colorGrp) {
        this.colorGrp = colorGrp;
        return this;
    }
}
