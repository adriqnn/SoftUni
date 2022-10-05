package com.example.springdataadvancedquerying.model.entity;

public class AuthorNamesWithTotalCopiesCount {
    private String firsName;
    private String lastName;
    private long totalCopies;

    public AuthorNamesWithTotalCopiesCount(){}

    public AuthorNamesWithTotalCopiesCount(String firsName, String lastName, long totalCopies) {
        this.firsName = firsName;
        this.lastName = lastName;
        this.totalCopies = totalCopies;
    }

    public String getFirsName() {
        return firsName;
    }

    public void setFirsName(String firsName) {
        this.firsName = firsName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public long getTotalCopies() {
        return totalCopies;
    }

    public void setTotalCopies(long totalCopies) {
        this.totalCopies = totalCopies;
    }

    @Override
    public String toString() {
        return firsName + " " + lastName + " - " + totalCopies;
    }
}
