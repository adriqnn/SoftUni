package vaccopsjava;

import java.util.Objects;

public class Patient {
    public String name;
    public int height;
    public int age;
    public String town;
    public Doctor doctor;

    public Patient(String name, int height, int age, String town) {
        this.name = name;
        this.height = height;
        this.age = age;
        this.town = town;
    }

    public String getName() {
        return name;
    }

    public Patient setName(String name) {
        this.name = name;
        return this;
    }

    public int getHeight() {
        return height;
    }

    public Patient setHeight(int height) {
        this.height = height;
        return this;
    }

    public int getAge() {
        return age;
    }

    public Patient setAge(int age) {
        this.age = age;
        return this;
    }

    public String getTown() {
        return town;
    }

    public Patient setTown(String town) {
        this.town = town;
        return this;
    }

    public Doctor getDoctor() {
        return doctor;
    }

    public Patient setDoctor(Doctor doctor) {
        this.doctor = doctor;
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Patient patient = (Patient) o;
        
        return height == patient.height && age == patient.age && Objects.equals(name, patient.name) && Objects.equals(town, patient.town);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, height, age, town);
    }
}
