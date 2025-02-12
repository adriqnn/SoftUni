package _02_ProgrammingFundamentals._06_ObjectsAndClasses._01_Lecture;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class _05_Students {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Read input value
        String console = scan.nextLine();

        // Add variable
        List<Student> studentList = new ArrayList<>();

        // Save a list of students and their information
        while (!console.equals("end")) {
            String[] lineFromConsole = console.split("\\s+");

            String firstName = lineFromConsole[0];
            String secondName = lineFromConsole[1];
            int age = Integer.parseInt(lineFromConsole[2]);
            String town = lineFromConsole[3];

            Student student = new Student(firstName, secondName, age, town);
            studentList.add(student);

            console = scan.nextLine();
        }

        String consoleTown = scan.nextLine();

        // Print result
        for (Student element : studentList) {
            if (element.getTown().equals(consoleTown)) {
                System.out.println(element);
            }
        }

        scan.close();
    }
}

// Create practice Student class
class Student {
    private String firstName;
    private String secondName;
    private int age;
    private String town;

    public Student(String firstName, String secondName, int age, String town) {
        this.firstName = firstName;
        this.secondName = secondName;
        this.age = age;
        this.town = town;
    }

    public String getTown() {
        return this.town;
    }

    @Override
    public String toString() {
        return this.firstName + " " + this.secondName + " is " + this.age + " years old";
    }
}
