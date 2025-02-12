package _02_ProgrammingFundamentals._06_ObjectsAndClasses._01_Lecture;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class _06_Students2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Read input value
        String console = scan.nextLine();

        // Add variable
        List<StudentInfo> studentList = new ArrayList<>();

        // Save a list of students and their information
        while (!console.equals("end")) {
            String[] lineFromConsole = console.split("\\s+");

            String firstName = lineFromConsole[0];
            String secondName = lineFromConsole[1];
            int age = Integer.parseInt(lineFromConsole[2]);
            String town = lineFromConsole[3];

            if (!isAlreadyExistingInsideTheList(firstName, secondName, age, town, studentList)) {
                StudentInfo student = new StudentInfo(firstName, secondName, age, town);

                studentList.add(student);
            }

            console = scan.nextLine();
        }

        String town = scan.nextLine();

        // Print result
        for (StudentInfo element : studentList) {
            if (element.getTown().equals(town)) {
                System.out.println(element);
            }
        }

        scan.close();
    }

    // Define method to check if the value already exists in the list
    private static boolean isAlreadyExistingInsideTheList(String firstName, String secondName, int age, String town, List<StudentInfo> studentList) {
        for (StudentInfo element : studentList) {
            boolean firstNameBoolean = element.getFirstName().equals(firstName);
            boolean secondNameBoolean = element.getSecondName().equals(secondName);

            if (firstNameBoolean && secondNameBoolean) {
                element.setAge(age);
                element.setTown(town);

                return true;
            }
        }
        
        return false;
    }
}

// Create practice StudentInfo class
class StudentInfo {
    private String firstName;
    private String secondName;
    private int age;
    private String town;

    public StudentInfo(String firstName, String secondName, int age, String town) {
        this.firstName = firstName;
        this.secondName = secondName;
        this.age = age;
        this.town = town;
    }

    public void setTown(String town) {
        this.town = town;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public String getSecondName() {
        return this.secondName;
    }

    public int getAge() {
        return this.age;
    }

    public String getTown() {
        return this.town;
    }

    @Override
    public String toString() {
        return this.firstName + " " + this.secondName + " is " + this.age + " years old";
    }
}
