package com.example.xmlprocessing.model.dto.view.usersAndProducts;

import com.google.gson.annotations.Expose;

public class UserViewModel {

    @Expose
    private String firstName;
    @Expose
    private String lastName;
    @Expose
    private int age;
    @Expose
    private SoldProducts soldProducts;

    public UserViewModel() {
    }

    public UserViewModel(String firstName, String lastName, int age, SoldProducts soldProducts) {
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
