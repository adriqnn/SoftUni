package _03_JavaAdvanced._03_SetsAndMapsAdvanced;

import java.util.*;

public class _05_AverageStudentsGrades {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());
        Map<String, List<Double>> students = new TreeMap<>();
        for (int i = 0; i < n; i++) {
            String console = scan.nextLine();
            String[] studentInformation = console.split("\\s+");
            String name = studentInformation[0];
            double grade = Double.parseDouble(studentInformation[1]);
            students.putIfAbsent(name,new ArrayList<>());
            students.get(name).add(grade);
        }
        students.entrySet().stream().forEach(e -> {
            double sum = 0;
            double count = e.getValue().size();
            for (int i = 0; i < count; i++) {
                sum += e.getValue().get(i);
            }
            /*String doubles = e.getValue().stream().map(String::valueOf).collect(Collectors.joining(" "));
            System.out.printf("%s -> %s (avg: %.2f)%n",e.getKey(),doubles,sum/count);*/
            System.out.print(e.getKey() + " -> ");
            e.getValue().forEach(yep -> System.out.printf("%.2f ",yep));
            System.out.printf("(avg: %.2f)%n",sum/count);
        });
    }
}
