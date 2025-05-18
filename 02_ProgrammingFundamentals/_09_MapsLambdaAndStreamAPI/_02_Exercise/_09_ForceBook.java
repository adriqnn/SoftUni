package _02_ProgrammingFundamentals._09_MapsLambdaAndStreamAPI._02_Exercise;

import java.util.*;
import java.util.stream.Collectors;

public class _09_ForceBook {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Read input value
        String inputLine = scan.nextLine();

        // Add variables
        Map<String, String> users = new LinkedHashMap<>();
        Map<String, List<String>> forceAndUsers = new LinkedHashMap<>();

        // Create database for force users
        while (!inputLine.equals("Lumpawaroo")) {
            if (inputLine.contains("|")) {
                String[] line = inputLine.split(" \\| ");

                String side = line[0];
                String name = line[1];

                if (!users.containsKey(name) && !forceAndUsers.containsKey(side)) {
                    forceAndUsers.put(side, new ArrayList<>());
                    users.put(name, side);

                    forceAndUsers.get(side).add(name);

                } else if (!users.containsKey(name) && forceAndUsers.containsKey(side)) {
                    users.put(name, side);

                    forceAndUsers.get(side).add(name);

                } else if (users.containsKey(name)) {
                    inputLine = scan.nextLine();
                    continue;
                }

            } else if(inputLine.contains("->")) {
                String[] line = inputLine.split(" -> ");

                String name = line[0];
                String side = line[1];

                if (!users.containsKey(name) && !forceAndUsers.containsKey(side)) {
                    forceAndUsers.put(side, new ArrayList<>());
                    users.put(name, side);

                    forceAndUsers.get(side).add(name);

                    System.out.printf("%s joins the %s side!%n", name, side);

                } else if (!users.containsKey(name) && forceAndUsers.containsKey(side)) {
                    users.put(name, side);

                    forceAndUsers.get(side).add(name);

                    System.out.printf("%s joins the %s side!%n", name, side);

                } else if (users.containsKey(name) && forceAndUsers.containsKey(side)) {
                    forceAndUsers.get(users.get(name)).remove(name);
                    users.put(name, side);

                    forceAndUsers.get(side).add(name);

                    System.out.printf("%s joins the %s side!%n", name, side);

                } else if (users.containsKey(name) && !forceAndUsers.containsKey(side)) {
                    forceAndUsers.get(users.get(name)).remove(name);
                    users.put(name, side);

                    forceAndUsers.put(side, new ArrayList<>());
                    forceAndUsers.get(side).add(name);

                    System.out.printf("%s joins the %s side!%n", name, side);
                }
            }

            inputLine = scan.nextLine();
        }

        // Print result
        forceAndUsers.entrySet().stream().forEach(e -> {
            if(e.getValue().size() > 0){
                System.out.printf("Side: %s, Members: %d%n", e.getKey(), e.getValue().size());
                System.out.println(e.getValue().stream().map(element -> String.format("! %s", element)).collect(Collectors.joining("\n")));
            }
        });

        scan.close();
    }
}
