package _04_JavaOOP._02_Encapsulation._02_SalaryIncrease;

public class Person {
    private String firstName;
    private String lastName;
    private int age;
    private double salary;

    public Person(String firstName, String lastName, int age, double salary) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.salary = salary;
    }

    public void increaseSalary(double percentage){
        double sal = this.salary;
        
        if(this.getAge() < 30){
            percentage /= 2;
            sal += (percentage / 100) * sal;
        }else {
            sal += (percentage / 100) * sal;
        }
        
        this.setSalary(sal);
    }

    public String getLastName() {
        return this.lastName;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public int getAge() {
        return this.age;
    }

    public double getSalary() {
        return this.salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString(){
        return this.firstName + " " + this.lastName + " gets " + this.salary + " leva";
    }
}
