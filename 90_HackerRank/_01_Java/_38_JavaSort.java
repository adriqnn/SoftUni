package _05_HackerRank._01_Java;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class _38_JavaSort {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        
        int testCases = Integer.parseInt(scan.nextLine());
        List<Student> studentList = new ArrayList<Student>();
        
        while(testCases>0){
            int id = scan.nextInt();
            String fname = scan.next();
            double cgpa = scan.nextDouble();

            Student st = new Student(id, fname, cgpa);
            studentList.add(st);

            testCases--;
        }

        studentList.stream().sorted(Comparator.comparing(Student::getCgpa).reversed().thenComparing(Student::getFname).thenComparing(Student::getId)).forEach(e -> System.out.println(e.getFname()));

        scan.close();
    }
}

class Student{
    private int id;
    private String fname;
    private double cgpa;

    public Student(int id, String fname, double cgpa) {
        super();
        this.id = id;
        this.fname = fname;
        this.cgpa = cgpa;
    }

    public int getId() {
        return id;
    }

    public String getFname() {
        return fname;
    }

    public double getCgpa() {
        return cgpa;
    }
}
