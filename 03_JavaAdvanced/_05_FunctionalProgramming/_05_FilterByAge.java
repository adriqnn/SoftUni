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
        int n = Integer.parseInt(scan.nextLine());
        Supplier<Person> personCreator = () -> {
            String[] tokens = scan.nextLine().split(", ");
            return new Person((tokens[0]),Integer.parseInt(tokens[1]));
        };
        List<Person> people = IntStream.range(0,n).mapToObj(ignored -> personCreator.get()).collect(Collectors.toList());
        String conditionParam = scan.nextLine();
        int ageLimit = Integer.parseInt(scan.nextLine());
        String[] format = scan.nextLine().split("\\s+");
        //Predicate<Person> filter;
        var filter = getFilter(conditionParam,ageLimit);
        var printer = getPrinter(format);
        people.stream().filter(filter).forEach(printer);

        /*List<Person> people = IntStream.range(0, n).mapToObj(ignored -> {
            String[] tokens = scan.nextLine().split(", ");
            return new Person(tokens[0], Integer.parseInt(tokens[1]));
        }).collect(Collectors.toList());*/
    }

    public static Consumer<Person> getPrinter(String[] format) {
        if (format.length == 2){
            return p -> System.out.println(p.name + " - " + p.age);
        }else  if(format[0].equals("name")){
            return  p -> System.out.println(p.name);
        }
        return p -> System.out.println(p.age);
    }

    public static Predicate<Person> getFilter(String condition, int age){
        return  condition.equals("older") ? p -> p.age >= age : p -> p.age <= age;
    }
    public static class Person{
        private final String name;
        private final int age;

        public Person(String name, int age) {
            this.name = name;
            this.age = age;
        }
    }
}
