package _03_JavaAdvanced._10_ExamPrep._03_.University;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class University {
    public int capacity;
    public List<Student> students;
    private Map<String, Student> f;

    public University(int capacity) {
        this.capacity = capacity;
        this.students = new ArrayList<>();
        this.f = new LinkedHashMap<>();
    }

    public int getCapacity() {
        return this.capacity;
    }

    public List<Student> getStudents() {
        return this.students;
    }

    public int getStudentCount(){
        return this.students.size();
    }

    public String registerStudent(Student student){
        this.f.putIfAbsent(student.getFirstName(), student);
        String returnString = "";

        if(!this.students.contains(student) && this.capacity > this.students.size()){
            this.students.add(student);
            returnString = String.format("Added student %s %s", student.getFirstName(), student.getLastName());
        }else if(this.students.contains(student)){
            returnString = "Student is already in university";
        }else if(this.capacity <= this.students.size()){
            returnString = "No seats in the university";
        }

        return returnString;
    }

    public String dismissStudent(Student student){
        String returnString = "";

        if(this.students.contains(student)){
            this.students.remove(student);
            returnString = String.format("Removed student %s %s", student.getFirstName(), student.getLastName());
        }else{
            returnString = ("Student not found");
        }

        return returnString;
    }

    public Student getStudent(String firstName, String lastName){
        return this.f.get(firstName);
    }

    public String getStatistics(){
        StringBuilder sb = new StringBuilder();
        
        this.students.forEach(e -> {
            // ==Student: First Name = {firstName}, Last Name = {lastName}, Best Subject = {bestSubject}
            sb.append("==Student: First Name = ").append(e.getFirstName())
                    .append(", Last Name = ").append(e.getLastName())
                    .append(", Best Subject = ").append(e.getBestSubject())
                    .append(System.lineSeparator());
        });
        
        return sb.toString();
    }
}
