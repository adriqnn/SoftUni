package _02_ProgrammingFundamentals._03_Arrays._02_Exercise;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class _11_TreasureHunt {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Read input values
        List<String> loot = Arrays.stream(scan.nextLine().split("\\|")).collect(Collectors.toList());
        String input = scan.nextLine();

        // Accept commands for the treasure hunt
        while (!input.equals("Yohoho!")) {
            String[] commands = input.split("\\s+");
            String command = commands[0];

            if (command.equals("Loot")) {
                for (int i = 1; i < commands.length; i++) {
                    if (!loot.contains(commands[i])) {
                        loot.add(0, commands[i]);
                    }
                }
            } else if (command.equals("Drop")) {
                int index = Integer.parseInt(commands[1]);
                
                if (index < loot.size() && index >= 0) {
                    String removed = loot.remove(index);
                    loot.add(removed);
                }
            } else if (command.equals("Steal")) {
                int count = Integer.parseInt(commands[1]);
                List<String> stolen = new ArrayList<>();
                
                if (count >= loot.size()) {
                    stolen.addAll(loot);
                    loot.clear();
                } else {
                    for (int i = 0; i < count; i++) {
                        stolen.add(loot.remove(loot.size()-(count - i)));
                    }
                }
                
                System.out.println(stolen.stream().collect(Collectors.joining(", ")));
            }
            
            input = scan.nextLine();
        }

        // Print result
        if (loot.size() == 0) {
            System.out.println("Failed treasure hunt.");
        } else {
            double value = 0;
            
            for (int i = 0; i < loot.size(); i++) {
                value += loot.get(i).length();
            }

            System.out.printf("Average treasure gain: %.2f pirate credits.", value / loot.size());
        }

        scan.close();
    }
}
