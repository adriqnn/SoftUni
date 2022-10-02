package _04_JavaOOP._01_WorkingWithAbstraction._03_StudentSystem;

import java.util.HashMap;
import java.util.Map;

public class StudentSystem {
    private Map<String, Student> students;

    public StudentSystem(){
        this.students = new HashMap<>();
    }

    public Map<String, Student> getStudents() {
        return students;
    }

    public String parseCommand(String[] args){
        String command = args[0];
        String name = args[1];
        switch(command){
            case "Create":
                int age = Integer.parseInt(args[2]);
                double grade = Double.parseDouble(args[3]);
                createAndRegisterStudent(name,age,grade);
                return null;
            case "Show":
                return getStudentInfo(name);
            default:
                return null;
            /*throw new IllegalArgumentException("Unknown command " + command);*/
        }
    }

    private String getStudentInfo(String name) {
        Student student = this.students.get(name);
        //throw new IllegalArgumentException("No student with name " + name);
        assert student != null;
        return StudentInfoFormatter.getFormatter(student);
    }

    private void createAndRegisterStudent(String name, int age, double grade) {
        this.students.putIfAbsent(name,new Student(name,age,grade));
    }
}
