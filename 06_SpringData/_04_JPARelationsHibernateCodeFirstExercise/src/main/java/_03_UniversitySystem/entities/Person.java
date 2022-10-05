package _03_UniversitySystem.entities;

import javax.persistence.*;

@MappedSuperclass //- shared properties for entities tat inherit
//@Inheritance - (strategy)
public class Person {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "first_name",nullable = false)
    private String firstName;

    @Column(name = "last_name",nullable = false)
    private String lastName;

    @Column(name = "phone_number",unique = true)
    private String phoneNUmber;

    protected Person (){}

    protected Person(String firstName, String lastName, String phoneNUmber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.phoneNUmber = phoneNUmber;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPhoneNUmber() {
        return phoneNUmber;
    }

    public void setPhoneNUmber(String phoneNUmber) {
        this.phoneNUmber = phoneNUmber;
    }
}













