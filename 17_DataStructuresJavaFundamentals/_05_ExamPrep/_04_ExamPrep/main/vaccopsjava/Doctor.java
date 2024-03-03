package vaccopsjava;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Doctor {
    public String name;
    public int popularity;
    public List<Patient> patients;

    public Doctor(String name, int popularity) {
        this.name = name;
        this.popularity = popularity;
        this.patients = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public Doctor setName(String name) {
        this.name = name;
        return this;
    }

    public int getPopularity() {
        return popularity;
    }

    public Doctor setPopularity(int popularity) {
        this.popularity = popularity;
        return this;
    }

    public List<Patient> getPatients() {
        return patients;
    }

    public Doctor setPatients(List<Patient> patients) {
        this.patients = patients;
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Doctor doctor = (Doctor) o;

        return popularity == doctor.popularity && Objects.equals(name, doctor.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, popularity);
    }
}
