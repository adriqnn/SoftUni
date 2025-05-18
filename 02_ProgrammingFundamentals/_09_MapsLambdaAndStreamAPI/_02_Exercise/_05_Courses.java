package _02_ProgrammingFundamentals._09_MapsLambdaAndStreamAPI._02_Exercise;

import java.util.*;

public class _05_Courses {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Read input value
        String input = scan.nextLine();
        
        // Add variable
        Map<String, List<String>> courses = new LinkedHashMap<>();

        // Register courses
        while (!input.equals("end")) {
            String[] courseInformation = input.split(" : ");
            
            String course = courseInformation[0];
            String name = courseInformation[1];

            if (!courses.containsKey(course)) {
                List<String> names = new ArrayList<>();
                names.add(name);
                
                courses.put(course, names);
            } else {
                courses.get(course).add(name);
            }

            input = scan.nextLine();
        }

        // Print result
        courses.forEach((key, value) -> {
            System.out.printf("%s: %d%n", key, value.size());
            value.forEach(e -> System.out.printf("-- %s%n", e));
        });
        
        scan.close();
    }
}
