package _03_JavaAdvanced._03_SetsAndMapsAdvanced;

import java.text.DecimalFormat;
import java.util.*;
import java.util.stream.Collectors;

public class _08_AcademyGraduation {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Read input value
        int n = Integer.parseInt(scan.nextLine());

        // Add variable
        Map<String, String> grade = new TreeMap<>();

        // Determine if the student can graduate
        for (int i = 0; i < n; i++) {
            String name = scan.nextLine();
            double sum = 0;

            List<Double> grades = Arrays.stream(scan.nextLine().split("\\s+")).map(Double::parseDouble).collect(Collectors.toList());
            //sum = grades.stream().mapToDouble(e -> e).sum();

            for(double s : grades){
                sum += s;
            }

            sum /= grades.size();
            grade.put(name, String.valueOf(sum));
        }

        // Formatter
        DecimalFormat formatter = new DecimalFormat("0.#############");

        // Print result
        grade.entrySet().forEach(e -> {
            System.out.print(e.getKey() + " is graduated with " + e.getValue());
            System.out.println();
        });

        scan.close();
    }
}
