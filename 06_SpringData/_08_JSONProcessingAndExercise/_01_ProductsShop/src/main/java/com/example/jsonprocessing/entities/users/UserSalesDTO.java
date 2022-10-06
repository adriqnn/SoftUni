package com.example.jsonprocessing.entities.users;

import com.example.jsonprocessing.entities.products.SalesDTO;

import java.util.List;

public class UserSalesDTO {
    private String firstName;
    private String lastName;
    private int age;
    private List<SalesDTO> sellingItems;

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

    public List<SalesDTO> getSellingItems() {
        return sellingItems;
    }

    public void setSellingItems(List<SalesDTO> sellingItems) {
        this.sellingItems = sellingItems;
    }
}
