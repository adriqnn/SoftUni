package _03_JavaAdvanced._06_DefiningClassesExercise._01_OpinionPoll;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.nextLine());

        List<Person> listOfPeople = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            String[] consoleLine = scan.nextLine().split("\\s+");

            String person = consoleLine[0];
            int age = Integer.parseInt(consoleLine[1]);

            Person newOne = new Person(consoleLine[0], Integer.parseInt(consoleLine[1]));
            listOfPeople.add(newOne);
        }

        listOfPeople.sort(Comparator.comparing(Person::getPerson));
        listOfPeople.forEach(e -> {
            if(e.getAge() > 30) {
                System.out.println(e.getPerson() + " - " + e.getAge());
            }
        });

        //listOfPeople.stream().filter(p -> p.getAge() > 30).sorted((person1, person2) -> person1.getPerson().compareTo(person2.getPerson())).forEach(System.out::println));

        scan.close();
    }
}
