package _02_ProgrammingFundamentals._06_ObjectsAndClasses._01_Lecture;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class _05_Students {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        List<StudentInfo> studentList = new ArrayList<>();
        String console = scan.nextLine();

        while(!console.equals("end")){
            String[] lineFromConsole = console.split("\\s+");
            String firstName = lineFromConsole[0];
            String secondName = lineFromConsole[1];
            int age = Integer.parseInt(lineFromConsole[2]);
            String town = lineFromConsole[3];
            StudentInfo student = new StudentInfo(firstName,secondName,age,town);
            studentList.add(student);
            console = scan.nextLine();
        }

        String consoleTown = scan.nextLine();
        for (StudentInfo element : studentList) {
            if (element.getTown().equals(consoleTown)){
                System.out.println(element);
            }
        }
    }
}
class StudentInfo{
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
    public String getTown() {
        return town;
    }
    @Override
    public String toString(){
        return this.firstName + " " + this.secondName + " is " + this.age + " years old";
    }
}

