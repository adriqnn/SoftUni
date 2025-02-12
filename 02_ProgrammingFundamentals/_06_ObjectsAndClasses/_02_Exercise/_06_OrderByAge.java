package _02_ProgrammingFundamentals._06_ObjectsAndClasses._02_Exercise;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class _06_OrderByAge {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Read input vale
        String console = scan.nextLine();

        // Add variable
        List<Album> names = new ArrayList<>();


        // Create collection of people
        while (!console.equals("End")) {
            String[] consoleLine = console.split("\\s+");

            String name = consoleLine[0];
            String personalNumber = consoleLine[1];
            int age = Integer.parseInt(consoleLine[2]);

            Album person = new Album(name, personalNumber, age);
            names.add(person);

            console = scan.nextLine();
        }

        // Sort
        names.sort(Comparator.comparing(Album::getAge));

        // Print result
        names.forEach(System.out::println);

        scan.close();
    }
}

// Create practice Album class
class Album{
    private String name ;
    private String personalNUmber;
    private int age;

    public Album(String name, String personalNUmber, int age) {
        this.name = name;
        this.personalNUmber = personalNUmber;
        this.age = age;
    }

    public int getAge() {
        return this.age;
    }

    @Override
    public String toString() {
        return String.format("%s with ID: %s is %d years old.", this.name, this.personalNUmber, this.age);
    }
}
