package _03_JavaAdvanced._05_FunctionalProgramming;

import java.util.List;
import java.util.Scanner;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class _05_FilterByAge {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Read input value
        int n = Integer.parseInt(scan.nextLine());

        Supplier<Person> personCreator = () -> {
            String[] tokens = scan.nextLine().split(", ");
            return new Person((tokens[0]), Integer.parseInt(tokens[1]));
        };

        // Create record of people
        List<Person> people = IntStream.range(0, n).mapToObj(ignored -> personCreator.get()).collect(Collectors.toList());

        // Additional input
        String conditionParam = scan.nextLine();
        int ageLimit = Integer.parseInt(scan.nextLine());
        String[] format = scan.nextLine().split("\\s+");

        //Predicate<Person> filter and  Consumer<Person> printer
        var filter = getFilter(conditionParam, ageLimit);
        var printer = getPrinter(format);

        // Print result
        people.stream().filter(filter).forEach(printer);

        // Another solution
        /*List<Person> people = IntStream.range(0, n).mapToObj(ignored -> {
            String[] tokens = scan.nextLine().split(", ");
            return new Person(tokens[0], Integer.parseInt(tokens[1]));
        }).collect(Collectors.toList());*/

        scan.close();
    }

    // Consumer Method
    public static Consumer<Person> getPrinter(String[] format) {
        if (format.length == 2){
            return p -> System.out.println(p.name + " - " + p.age);
        }else  if(format[0].equals("name")){
            return  p -> System.out.println(p.name);
        }else{
            return p -> System.out.println(p.age);
        }
    }

    // Predicate Method
    public static Predicate<Person> getFilter(String condition, int age){
        return  condition.equals("older") ? p -> p.age >= age : p -> p.age <= age;
    }

    // Create practice Person class
    public static class Person{
        private final String name;
        private final int age;

        public Person(String name, int age) {
            this.name = name;
            this.age = age;
        }
    }
}
