package _02_ProgrammingFundamentals._06_ObjectsAndClasses._02_Exercise;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class _05_Students {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.nextLine());

        List<StudentsInfo> students = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            String[] studentsInformation = scan.nextLine().split("\\s+");
            String firstName = studentsInformation[0];
            String lastName = studentsInformation[1];
            double grade = Double.parseDouble(studentsInformation[2]);
            StudentsInfo student = new StudentsInfo(firstName,lastName,grade);
            students.add(student);
        }
        students.stream().sorted((e1,e2) -> Double.compare(e2.getGrade(),e1.getGrade())).forEach(e -> System.out.print(e));

    }
}

class StudentsInfo{
    private String firstName;
    private String lastName;
    private double grade;
    public StudentsInfo(String firstName, String lastName, double grade) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.grade = grade;
    }
    public double getGrade() {
        return grade;
    }
    @Override
    public String toString(){
        return String.format("%s %s: %.2f%n",this.firstName,this.lastName,this.grade);
    }
}
