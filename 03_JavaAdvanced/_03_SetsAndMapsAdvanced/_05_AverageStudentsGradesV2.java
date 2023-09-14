package _03_JavaAdvanced._03_SetsAndMapsAdvanced;

import java.util.*;
import java.util.stream.Collectors;

public class _05_AverageStudentsGradesV2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Read input value
        int n = Integer.parseInt(scan.nextLine());

        // Add variable
        Map<String, List<Double>> studentGrades = new TreeMap<>();

        // Determine the average grades of students
        for (int i = 0; i < n; i++) {
            String[] input = scan.nextLine().split("\\s+");

            String name = input[0];
            double grade = Double.parseDouble(input[1]);

            studentGrades.computeIfAbsent(name, k -> new ArrayList<>()).add(grade);
        }

        // Print result
        studentGrades.forEach((name, grades) -> {
            double average = grades.stream().mapToDouble(Double::doubleValue).average().orElse(0.0);

            System.out.printf("%s -> %s (avg: %.2f)%n", name, grades.stream()
                    .map(Object::toString)
                    .collect(Collectors.joining(" ")), average);
        });

        scan.close();
    }
}
