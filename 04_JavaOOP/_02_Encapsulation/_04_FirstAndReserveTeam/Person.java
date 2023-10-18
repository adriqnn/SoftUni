package _04_JavaOOP._02_Encapsulation._04_FirstAndReserveTeam;

public class Person {
    private String firstName;
    private String lastName;
    private int age;
    private double salary;

    public Person(String firstName, String lastName, int age, double salary) {
        this.setFirstName(firstName);
        this.setLastName(lastName);
        this.setAge(age);
        this.setSalary(salary);
    }

    public String getLastName() {
        return this.lastName;
    }

    private void setSalary(double salary) {
        if (salary < 460) {
            throw new IllegalArgumentException("Salary cannot be less than 460 leva");
        }

        this.salary = salary;
    }

    public void setAge(int age) {
        if (age <= 0) {
            throw new IllegalArgumentException("Age cannot be zero or negative integer");
        }

        this.age = age;
    }

    public void setLastName(String lastName) {
        ensureNameLength(lastName, "Last");
        this.lastName = lastName;
    }

    public void setFirstName(String firstName) {
        ensureNameLength(firstName, "First");
        this.firstName = firstName;
    }

    private void ensureNameLength(String nameParam,String fieldName){
        if(nameParam.length() < 3){
            throw new IllegalArgumentException(fieldName + " name cannot be less than 3 symbols");
        }
    }

    public void increaseSalary(double increment) {
        if (this.age < 30) {
            increment = increment / 2;
        }

        this.salary = this.salary * (1.00 + increment / 100);
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

    @Override
    public String toString(){
        return this.firstName + " " + this.lastName + " gets " + this.salary + " leva";
    }
}
