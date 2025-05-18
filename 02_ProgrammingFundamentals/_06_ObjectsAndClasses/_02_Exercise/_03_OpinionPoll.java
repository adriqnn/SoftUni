package _02_ProgrammingFundamentals._06_ObjectsAndClasses._02_Exercise;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class _03_OpinionPoll {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Read input value
        int n = Integer.parseInt(scan.nextLine());

        // Add variable
        List<Person> listOfPeople = new ArrayList<>();

        // Populate the list with data for people
        for (int i = 0; i < n; i++) {
            String[] consoleLine = scan.nextLine().split("\\s+");

            String person = consoleLine[0];
            int age = Integer.parseInt(consoleLine[1]);

            Person newPerson = new Person(person, age);
            listOfPeople.add(newPerson);
        }

        /*
        listOfPeople.stream().sorted(Comparator.comparingInt(Persons::getAge).reversed()).forEach(e -> {
            if (e.getAge() >= 30) {
                System.out.println(e.getPerson() + " - " + e.getAge());
            }
        }); 
        */

        // Sort the list
        listOfPeople.sort(Comparator.comparing(Person::getPerson));

        // Print result
        listOfPeople.forEach(e -> {
            if (e.getAge() > 30) {
                System.out.println(e.getPerson() + " - " + e.getAge());
            }
        });

        scan.close();
    }
}

// Create practice Person class
class Person {
    private String person;
    private int age;

    public Person(String person, int age) {
        this.person = person;
        this.age = age;
    }

    public int getAge() {
        return this.age;
    }

    public String getPerson() {
        return this.person;
    }
}
