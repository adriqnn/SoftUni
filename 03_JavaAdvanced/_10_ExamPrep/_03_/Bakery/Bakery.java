package _03_JavaAdvanced._10_ExamPrep._03_.Bakery;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Bakery {
    private String name;
    private int capacity;
    private List<Employee> employees;

    public Bakery(String name, int capacity) {
        this.name = name;
        this.capacity = capacity;
        this.employees = new ArrayList<>();
    }

    public void add(Employee employee){
        if(this.capacity > this.employees.size()){
            this.employees.add(employee);
        }
    }

    public boolean remove(String name){
        for (Employee e : this.employees) {
            if(e.getName().equals(name)){
                this.employees.remove(e);
                return true;
            }
        }
        return false;
    }

    public Employee getOldestEmployee(){
        return this.employees.stream().sorted((e1,e2) -> Integer.compare(e2.getAge(), e1.getAge())).collect(Collectors.toList()).get(0);
    }

    public Employee getEmployee(String name){
        return this.employees.stream().filter(e -> e.getName().equals(name)).collect(Collectors.toList()).get(0);
    }

    public int getCount(){
        return this.employees.size();
    }

    public String report(){
        StringBuilder sb = new StringBuilder();
        
        sb.append("Employees working at Bakery ").append(this.name).append(":").append(System.lineSeparator());
        this.employees.forEach(e -> sb.append(e).append(System.lineSeparator()));
        
        return  sb.toString();
    }
}
