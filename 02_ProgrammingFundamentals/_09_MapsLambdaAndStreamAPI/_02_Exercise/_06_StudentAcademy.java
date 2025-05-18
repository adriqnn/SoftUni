package _02_ProgrammingFundamentals._09_MapsLambdaAndStreamAPI._02_Exercise;

import java.util.*;

public class _06_StudentAcademy {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Read input value
        int inputNumber = Integer.parseInt(scan.nextLine());
        
        // Add variable
        Map<String, List<Double>> students = new LinkedHashMap<>();

        // Create Student stats
        for (int i = 0; i < inputNumber; i++) {
            String name = scan.nextLine();
            Double grade = Double.parseDouble(scan.nextLine());

            if (!students.containsKey(name)) {
                students.put(name, new ArrayList<>());
            }
            
            students.get(name).add(grade);
        }

        // Print result
        students.entrySet()
                .stream()
                .filter(e -> (e.getValue().stream().mapToDouble(Double::doubleValue).sum() / e.getValue().size()) >= 4.50).forEach(e -> {
                    System.out.printf("%s -> %.2f%n", e.getKey(), e.getValue().stream().mapToDouble(Double::doubleValue).sum() / e.getValue().size());
                });

        scan.close();
        
//        List<String> output = students.entrySet()
//                .stream()
//                .map(e -> {
//                    List<String> studentsAndAverages = new ArrayList<>();
//                    String name = e.getKey();
//                    double average = e.getValue().stream().mapToDouble(Double::doubleValue).sum() / e.getValue().size();
//                    studentsAndAverages.add(name);
//                    studentsAndAverages.add((average + ""));
//                    return studentsAndAverages;
//                }).filter(e -> Double.parseDouble(e.get(1)) >= 4.50).map(e -> String.format("%s -> %.2f%n", e.get(0), Double.parseDouble(e.get(1)))).toList();
//
//        System.out.print(String.join("", output));
    }
}
