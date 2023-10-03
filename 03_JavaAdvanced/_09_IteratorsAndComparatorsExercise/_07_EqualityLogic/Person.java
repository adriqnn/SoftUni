package _03_JavaAdvanced._09_IteratorsAndComparatorsExercise._07_EqualityLogic;

import java.util.Objects;

public class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return this.name;
    }

    public Person setName(String name) {
        this.name = name;
        return this;
    }

    public int getAge() {
        return this.age;
    }

    public Person setAge(int age) {
        this.age = age;
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        
        return this.age == person.age && Objects.equals(this.name, person.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.name, this.age);
    }
}
