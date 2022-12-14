package _02_ProgrammingFundamentals._06_ObjectsAndClasses._03_MoreExercises;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class _01_CompanyRoster {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.nextLine());

        List<Employees> employeeList = new ArrayList<>();
        List<Department> departments = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            String[] consoleLine = scan.nextLine().split("\\s+");
            String name = consoleLine[0];
            double salary = Double.parseDouble(consoleLine[1]);
            String position = consoleLine[2];
            String department = consoleLine[3];
            String email = "";
            int age = 0;
            try{
                age = Integer.parseInt(consoleLine[5]);
                email = consoleLine[4];
            }catch (Exception e){
                try {
                    age = Integer.parseInt(consoleLine[4]);
                    email = "n/a";
                }catch (Exception e1){
                    try {
                        email = consoleLine[4];
                        age = -1;
                    }catch (Exception e2){
                        email = "n/a";
                        age = -1;
                    }
                }
            }
            boolean containsDepartment = false;
            int index = 0;
            for (int j = 0; j < departments.size(); j++) {
                if(departments.get(j).getDepartment().equals(department)){
                    containsDepartment = true;
                    index = j;
                }
            }
            if (containsDepartment){
                departments.get(index).setNumber(departments.get(index).getNumber()+1);
                departments.get(index).setSalaries(departments.get(index).getSalaries()+salary);
            }else{
                Department newDepartment = new Department(department,1,salary);
                departments.add(newDepartment);
            }
            Employees employee = new Employees(name,salary,position,department,email,age);
            employeeList.add(employee);
        }
        departments.stream().forEach(e ->{
            double average = 0;
            average = e.getSalaries()/e.getNumber();
            e.setSalaries(average);
        });
        departments.sort(Comparator.comparing(Department::getSalaries).reversed());
        System.out.printf("Highest Average Salary: %s%n",departments.get(0).getDepartment());
        employeeList.sort(Comparator.comparing(Employees::getSalary).reversed());
        employeeList.stream().forEach(e ->{
            if(e.getDepartment().equals(departments.get(0).getDepartment())){
                System.out.println(e);
            }
        });
    }
}
class Employees{
    private String name;
    private double salary;
    private String position;
    private String department;
    private String email;
    private int age;
    public Employees(String name, double salary, String position, String department, String email, int age) {
        this.name = name;
        this.salary = salary;
        this.position = position;
        this.department = department;
        this.email = email;
        this.age = age;
    }
    public String getName() {
        return name;
    }
    public double getSalary() {
        return salary;
    }
    public String getPosition() {
        return position;
    }
    public String getDepartment() {
        return department;
    }
    public String getEmail() {
        return email;
    }
    public int getAge() {
        return age;
    }
    @Override
    public String toString(){
        return String.format("%s %.2f %s %d",this.name,this.salary,this.email,this.age);
    }
}
class Department{
    private String department;
    private int number = 0;
    private double salaries = 0;
    public Department(String department, int number, double salaries) {
        this.department = department;
        this.number = number;
        this.salaries = salaries;
    }
    public void setNumber(int number) {
        this.number = number;
    }
    public double getSalaries() {
        return salaries;
    }

    public int getNumber() {
        return number;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public void setSalaries(double salaries) {
        this.salaries = salaries;
    }

    public String getDepartment() {
        return department;
    }
    @Override
    public String toString(){
        return String.format("%s %d %.2f",this.department,this.number,this.salaries);
    }
}
