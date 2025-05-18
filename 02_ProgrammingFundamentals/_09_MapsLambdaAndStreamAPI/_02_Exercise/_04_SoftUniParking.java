package _02_ProgrammingFundamentals._09_MapsLambdaAndStreamAPI._02_Exercise;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class _04_SoftUniParking {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Read input value
        int numberOfCommands = Integer.parseInt(scan.nextLine());

        // Add variable
        Map<String, String> registry = new LinkedHashMap<>();

        // Validate parking permissions and save data
        for (int i = 0; i < numberOfCommands; i++) {
            String[] commands = scan.nextLine().split("\\s+");

            String command = commands[0];
            String username = commands[1];

            if (command.equals("register")) {
                String licensePlate = commands[2];
                
                if (registry.containsKey(username)) {
                    System.out.printf("ERROR: already registered with plate number %s%n", licensePlate);
                    continue;
                }
                
                registry.put(username, licensePlate);
                System.out.printf("%s registered %s successfully%n", username, licensePlate);
            } else {
                if (!registry.containsKey(username)) {
                    System.out.printf("ERROR: user %s not found%n", username);
                    continue;
                }
                
                registry.remove(username);
                System.out.printf("%s unregistered successfully%n", username);
            }
        }

        // Print result
        registry.forEach((key, value) -> System.out.printf("%s => %s%n", key, value));

        scan.close();
    }
}
