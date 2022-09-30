package _03_JavaAdvanced._09_IteratorsAndComparatorsExercise._07_EqualityLogic;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int lines = Integer.parseInt(scan.nextLine());

        Set<Person> treeSet = new HashSet<>();
        Set<Integer> hashSet = new HashSet<>();

        for (int i = 0; i < lines; i++) {
            String[] information = scan.nextLine().split("\\s+");

            String name = information[0];
            int age = Integer.parseInt(information[1]);

            Person person = new Person(name, age);

            treeSet.add(person);
            hashSet.add(person.hashCode());
        }
        System.out.println(treeSet.size());
        System.out.println(hashSet.size());
    }
}
