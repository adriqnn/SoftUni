package _02_ProgrammingFundamentals._09_MapsLambdaAndStreamAPI._02_Exercise;

import java.util.*;
import java.util.stream.Collectors;

public class _08_CompanyUsers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Map<String, Set<String>> employees = new LinkedHashMap<>();
        String input = scan.nextLine();

        while(!input.equals("End")){
            String[] line = input.split(" -> ");
            String company = line[0];
            String id = line[1];

            if(!employees.containsKey(company)){
                employees.put(company, new HashSet<>());
            }
            employees.get(company).add(id);
            input = scan.nextLine();
        }

        employees.entrySet().forEach(element -> {
            String company = element.getKey();
            String ids = element.getValue().stream().sorted().map(string -> String.format("-- %s",string)).collect(Collectors.joining("\n"));

            System.out.printf("%s%n%s%n",company,ids);
        });

//        employees.entrySet().forEach(element -> {
//            String company = element.getKey();
//            String ids = element.getValue().stream().sorted(String::compareTo).map(string -> String.format("-- %s",string)).collect(Collectors.joining("\n"));
//
//            System.out.printf("%s%n%s%n",company,ids);
//        });
    }
}
