package _02_ProgrammingFundamentals._09_MapsLambdaAndStreamAPI._02_Exercise;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.Collectors;

public class _10_SoftUniExamResults {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Read input value
        String input = scan.nextLine();

        // Add variable
        Map<String, Integer> courses = new LinkedHashMap<>();
        Map<String, String> users = new LinkedHashMap<>();

        // Create database for exam results
        while (!input.equals("exam finished")) {
            String[] information = input.split("-");

            String username = information[0];
            String command = information[1];

            if (command.equals("banned")) {
                users.put(username, "banned");
            } else {
                int points = Integer.parseInt(information[2]);

                if (!courses.containsKey(command)) {
                    courses.put(command, 0);
                }

                int submissions = courses.get(command);
                courses.put(command, submissions + 1);

                if (!users.containsKey(username)) {
                    users.put(username, points + "");
                }

                int userPoints = Integer.parseInt(users.get(username));

                if (userPoints < points) {
                    users.put(username, points + "");
                }
            }

            input = scan.nextLine();
        }

        // Print result
        System.out.println("Results:");
        System.out.println(users.entrySet().stream().filter(e -> !e.getValue().equals("banned")).map(e -> String.format("%s | %s", e.getKey(), e.getValue())).collect(Collectors.joining("\n")));
        System.out.println("Submissions:");
        System.out.println(courses.entrySet().stream().map(e -> String.format("%s - %d", e.getKey(), e.getValue())).collect(Collectors.joining("\n")));

        scan.close();
    }
}
