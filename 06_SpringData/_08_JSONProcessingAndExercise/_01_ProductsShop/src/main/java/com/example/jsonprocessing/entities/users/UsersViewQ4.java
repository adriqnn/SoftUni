package com.example.jsonprocessing.entities.users;

import com.example.jsonprocessing.entities.products.SoldProducts;

public class UsersViewQ4 {

    private String firstName;

    private String lastName;

    private int age;

    private SoldProducts soldProducts;

    public UsersViewQ4(){
    }

    public UsersViewQ4(String firstName, String lastName, int age, SoldProducts soldProducts) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.soldProducts = soldProducts;
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

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public SoldProducts getSoldProducts() {
        return soldProducts;
    }

    public void setSoldProducts(SoldProducts soldProducts) {
        this.soldProducts = soldProducts;
    }
}
