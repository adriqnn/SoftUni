package _02_ProgrammingFundamentals._09_MapsLambdaAndStreamAPI._03_MoreExercises;

import java.util.*;
import java.util.stream.Collectors;

public class _01_Ranking {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Read input value
        String firstInput = scan.nextLine();

        // Add variable
        Map<String, String> contestInformation = new LinkedHashMap<>();

        // Create rank list for contestants
        while (!firstInput.equals("end of contests")) {
            String[] information = firstInput.split(":");

            String contest = information[0];
            String password = information[1];

            contestInformation.put(contest, password);

            firstInput = scan.nextLine();
        }

        // Read input value
        String secondInput = scan.nextLine();

        // Add variable
        Map<String, Map<String, Integer>> students = new TreeMap<>();

        // Create database for submissions
        while (!secondInput.equals("end of submissions")) {
            String[] information = secondInput.split("=>");

            String contest = information[0];
            String password = information[1];
            String username = information[2];
            int points = Integer.parseInt(information[3]);

            if (contestInformation.containsKey(contest)) {
                if (contestInformation.get(contest).equals(password)) {
                    if (!students.containsKey(username)) {
                        students.put(username, new LinkedHashMap<>());
                    }

                    if (!students.get(username).containsKey(contest)) {
                        Map<String, Integer> result = students.get(username);
                        result.put(contest, points);
                        students.put(username, result);
                    } else {
                        int currentPoints = students.get(username).get(contest);

                        if (currentPoints < points) {
                            Map<String, Integer> result = students.get(username);
                            result.put(contest, points);
                            students.put(username, result);
                        }
                    }
                }
            }

            secondInput = scan.nextLine();
        }

        // Sort
        Map<String, Integer> scores = students.entrySet().stream().map(e -> {
            String nameKey = e.getKey();
            int allPointsValue = e.getValue().values().stream().mapToInt(Integer::intValue).sum();
            return (Map.Entry<String, Integer>) new AbstractMap.SimpleEntry<>(nameKey, allPointsValue);
        }).collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));

        // Sort
        Optional<Map.Entry<String, Integer>> first = scores.entrySet().stream().min((e1, e2) -> e2.getValue().compareTo(e1.getValue()));

        // Print result
        System.out.printf("Best candidate is %s with total %d points.%n", first.get().getKey(), first.get().getValue());
        System.out.println("Ranking:");

        System.out.println(students.entrySet().stream()
                .map(e -> String.format("%s%n%s", e.getKey(), e.getValue().entrySet().stream().sorted((e1, e2) -> e2.getValue().compareTo(e1.getValue())).map(element -> String.format("#  %s -> %d", element.getKey(), element.getValue())).collect(Collectors.joining("\n")))).collect(Collectors.joining("\n")));

        scan.close();
    }
}

//        Map<String, String> strings = new LinkedHashMap<>();
//
//        strings.put("one", "one");
//        strings.put("two", "two");
//        strings.put("three", "three");

//        Map<String, String> collect = strings.entrySet().stream().map(e -> {
//            int a = 0;
//            Map.Entry<String, String> e1 = e;
//            return e;
//        }).collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));
//
//        collect.forEach((key, value) -> System.out.println(key + " " + value));

//        Map<String, String> collect = strings.entrySet().stream().map(e -> {
//            String newKey = e.getKey() + "z";
//            String newValue = e.getValue() + "z";
//            Map.Entry<String, String> entry = new AbstractMap.SimpleEntry<String, String>(newKey, newValue);
//            return entry;
//        }).collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));
//        collect.forEach((key, value) -> System.out.println(key + " " + value));
