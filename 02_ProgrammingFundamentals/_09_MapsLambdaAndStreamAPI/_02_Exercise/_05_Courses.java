package _02_ProgrammingFundamentals._09_MapsLambdaAndStreamAPI._02_Exercise;

import java.util.*;

public class _05_Courses {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Map<String, List<String>> courses = new LinkedHashMap<>();
        String input = scan.nextLine();

        while(!input.equals("end")){
            String[] courseInformation = input.split(" : ");
            String course = courseInformation[0];
            String name = courseInformation[1];

            if(!courses.containsKey(course)){
                List<String> names = new ArrayList<>();
                names.add(name);
                courses.put(course, names);
            }else{
                courses.get(course).add(name);
            }

            input = scan.nextLine();
        }

        courses.forEach((key, value) -> {
            System.out.printf("%s: %d%n", key, value.size());
            value.forEach(e -> System.out.printf("-- %s%n", e));
        });
    }
}
