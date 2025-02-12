package _02_ProgrammingFundamentals._06_ObjectsAndClasses._02_Exercise;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class _05_Students {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Read input value
        int n = Integer.parseInt(scan.nextLine());

        // Add variable
        List<Student> students = new ArrayList<>();

        // Create collection of students
        for (int i = 0; i < n; i++) {
            String[] studentsInformation = scan.nextLine().split("\\s+");

            String firstName = studentsInformation[0];
            String lastName = studentsInformation[1];
            double grade = Double.parseDouble(studentsInformation[2]);

            Student student = new Student(firstName, lastName, grade);
            students.add(student);
        }

        // Print result
        students.stream().sorted((e1, e2) -> Double.compare(e2.getGrade(), e1.getGrade())).forEach(e -> System.out.print(e));

        scan.close();
    }
}

// Create practice Student class
class Student {
    private String firstName;
    private String lastName;
    private double grade;

    public Student(String firstName, String lastName, double grade) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.grade = grade;
    }

    public double getGrade() {
        return this.grade;
    }

    @Override
    public String toString(){
        return String.format("%s %s: %.2f%n", this.firstName, this.lastName, this.grade);
    }
}
