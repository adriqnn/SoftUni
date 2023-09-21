package _03_JavaAdvanced._06_DefiningClassesExercise._07_Google;

public class Company {
    private String name;
    private String department;
    private String salary;

    public Company(String name, String department, String salary) {
        this.name = name;
        this.department = department;
        this.salary = salary;
    }
    
    public String getName() {
        return name;
    }
    
    public String getDepartment() {
        return department;
    }
    
    public String getSalary() {
        return salary;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public void setSalary(String salary) {
        this.salary = salary;
    }
    
    @Override
    public String toString(){
        if (this.name.equals("")){
            return "Company:" + "\n";
        }
        
        double number = Double.parseDouble(this.salary);
        
        String printSalary = String.format("%.2f", number);
        return "Company:" + "\n" + this.name + " " + this.department + " " + printSalary + "\n";
    }
}
