package _03_JavaAdvanced._09_IteratorsAndComparatorsExercise._08_PetClinics.interfaces;

import java.util.Map;

public interface ClinicDatabase {

    Map<String, Clinic> getAllClinics();

    Map<String, Pet> getAllPets();

    void addClinic(String clinicName, Integer roomCapacity);

    void addPet(String name, Integer age, String kind);

    void addPetToClinic(String petName, String clinicName);

    boolean isAdded();
}
