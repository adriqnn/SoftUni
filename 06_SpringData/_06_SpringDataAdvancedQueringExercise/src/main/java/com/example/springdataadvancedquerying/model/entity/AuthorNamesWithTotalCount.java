package com.example.springdataadvancedquerying.model.entity;

public interface AuthorNamesWithTotalCount {

    String getFirstName();
    String getLastName();
    long getTotalCopies();

    /*@Override
    default String toString(){
        return this.getFirstName();
    }*/
}

