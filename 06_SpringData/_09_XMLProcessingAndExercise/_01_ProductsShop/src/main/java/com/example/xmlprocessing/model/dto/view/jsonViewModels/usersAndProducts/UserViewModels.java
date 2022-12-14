package com.example.xmlprocessing.model.dto.view.jsonViewModels.usersAndProducts;


import com.google.gson.annotations.Expose;

import javax.xml.bind.annotation.*;

@XmlRootElement(name = "user")
@XmlAccessorType(XmlAccessType.FIELD)
public class UserViewModels {

    @Expose
    @XmlAttribute(name = "first-name")
    private String firstName;
    @Expose
    @XmlAttribute(name = "last-name")
    private String lastName;
    @Expose
    @XmlAttribute
    private int age;
    @Expose
    @XmlElement(name = "sold-products")
    private SoldProducts soldProducts;

    public UserViewModels() {
    }

    public UserViewModels(String firstName, String lastName, int age, SoldProducts soldProducts) {
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
