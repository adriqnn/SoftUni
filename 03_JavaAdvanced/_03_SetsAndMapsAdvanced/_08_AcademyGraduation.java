package _03_JavaAdvanced._03_SetsAndMapsAdvanced;

import java.text.DecimalFormat;
import java.util.*;
import java.util.stream.Collectors;

public class _08_AcademyGraduation {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());
        Map<String,String> grade = new TreeMap<>();
        for (int i = 0; i < n; i++) {
            String name = scan.nextLine();
            double sum = 0;
            List<Double> grades = Arrays.stream(scan.nextLine().split("\\s+")).map(Double::parseDouble).collect(Collectors.toList());
            //sum = grades.stream().mapToDouble(e -> e).sum();
            for(double s : grades){
                sum += s;
            }
            sum /= grades.size();
            grade.put(name,String.valueOf(sum));
        }
        DecimalFormat yep = new DecimalFormat("0.#############");
        grade.entrySet().forEach(e -> {
            System.out.print(e.getKey() + " is graduated with " + e.getValue());
            System.out.println();
        });
    }
}
