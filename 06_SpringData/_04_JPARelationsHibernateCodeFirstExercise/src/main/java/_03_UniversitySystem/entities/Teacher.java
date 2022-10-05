package _03_UniversitySystem.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import java.util.Set;

@Entity(name = "teachers")
public class Teacher extends Person{
    @Column(nullable = false,unique = true)
    private String email;

    @Column(name = "salary_per_hour",nullable = false)
    private double salaryPerHour;

    @OneToMany(mappedBy = "teacher")
    private Set<Course> courses;

    public Teacher(){
        super();
    }

    public Teacher(String firstName, String lastName, String phoneNUmber, String email, double salaryPerHour) {
        super(firstName, lastName, phoneNUmber);

        this.email = email;
        this.salaryPerHour = salaryPerHour;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public double getSalaryPerHour() {
        return salaryPerHour;
    }

    public void setSalaryPerHour(double salaryPerHour) {
        this.salaryPerHour = salaryPerHour;
    }
}
