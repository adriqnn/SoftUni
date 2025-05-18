package _02_ProgrammingFundamentals._09_MapsLambdaAndStreamAPI._02_Exercise;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class _02_AMinerTask {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Read input value
        String resource = scan.nextLine();

        // Add variable
        Map<String, Integer> resourcesQuantity = new LinkedHashMap<>();

        // Complete miners task
        while (!resource.equals("stop")) {
            int quantity = Integer.parseInt(scan.nextLine());
            
            if (!resourcesQuantity.containsKey(resource)) {
                resourcesQuantity.put(resource, quantity);
            } else {
                int currentQuantity = resourcesQuantity.get(resource);
                resourcesQuantity.put(resource, currentQuantity + quantity);
            }
            
            resource = scan.nextLine();
        }

        // Print result
        // Other print resourcesQuantity.forEach((key, value) -> System.out.println(key + " -> " + value));
        resourcesQuantity.entrySet().forEach(entry -> System.out.println(entry.getKey() + " -> " + entry.getValue()));

        scan.close();
    }
}
