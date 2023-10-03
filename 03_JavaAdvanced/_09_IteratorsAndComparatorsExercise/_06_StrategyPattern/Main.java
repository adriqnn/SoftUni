package _03_JavaAdvanced._09_IteratorsAndComparatorsExercise._06_StrategyPattern;

import java.util.Scanner;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        TreeSet<Person> nameSet = new TreeSet<>(new NameComparator());
        TreeSet<Person> ageSet = new TreeSet<>(new AgeComparator());
        int lines = Integer.parseInt(scan.nextLine());

        for (int i = 0; i < lines; i++) {
            String line = scan.nextLine();
            String[] peopleParameters = line.split("\\s+");

            String name = peopleParameters[0];
            int age = Integer.parseInt(peopleParameters[1]);
            Person person = new Person(name, age);

            nameSet.add(person);
            ageSet.add(person);
        }

        for (Person person : nameSet) {
            System.out.println(person);
        }

        for (Person person : ageSet) {
            System.out.println(person);
        }

        scan.close();
    }
}
