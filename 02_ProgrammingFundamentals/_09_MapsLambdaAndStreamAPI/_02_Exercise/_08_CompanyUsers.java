package _02_ProgrammingFundamentals._09_MapsLambdaAndStreamAPI._02_Exercise;

import java.util.*;
import java.util.stream.Collectors;

public class _08_CompanyUsers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Read input value
        String input = scan.nextLine();

        // Add variable
        Map<String, Set<String>> employees = new LinkedHashMap<>();

        // Make employee database
        while (!input.equals("End")) {
            String[] line = input.split(" -> ");

            String company = line[0];
            String id = line[1];

            if (!employees.containsKey(company)) {
                employees.put(company, new LinkedHashSet<>());
            }

            employees.get(company).add(id);

            input = scan.nextLine();
        }

        // Print result
        employees.entrySet().forEach(element -> {
            String company = element.getKey();
            String ids = element.getValue().stream().map(string -> String.format("-- %s", string)).collect(Collectors.joining("\n"));

            System.out.printf("%s%n%s%n", company, ids);
        });

        scan.close();

//        employees.entrySet().forEach(element -> {
//            String company = element.getKey();
//            String ids = element.getValue().stream().sorted().map(string -> String.format("-- %s", string)).collect(Collectors.joining("\n"));
//
//            System.out.printf("%s%n%s%n", company, ids);
//        });


//        employees.entrySet().forEach(element -> {
//            String company = element.getKey();
//            String ids = element.getValue().stream().sorted(String::compareTo).map(string -> String.format("-- %s", string)).collect(Collectors.joining("\n"));
//
//            System.out.printf("%s%n%s%n", company, ids);
//        });
    }
}
