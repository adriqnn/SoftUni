package _03_JavaAdvanced._09_IteratorsAndComparatorsExercise._08_PetClinics.models;

import _03_JavaAdvanced._09_IteratorsAndComparatorsExercise._08_PetClinics.interfaces.Clinic;
import _03_JavaAdvanced._09_IteratorsAndComparatorsExercise._08_PetClinics.interfaces.ClinicDatabase;
import _03_JavaAdvanced._09_IteratorsAndComparatorsExercise._08_PetClinics.interfaces.Pet;

import java.util.*;

public class ClinicDatabaseImpl implements ClinicDatabase {
    private Map<String, Clinic> allClinics;
    private Map<String, Pet> allPets;
    private boolean isAdded;

    public ClinicDatabaseImpl() {
        this.allClinics = new TreeMap<>();
        this.allPets = new TreeMap<>();
    }

    @Override
    public Map<String, Clinic> getAllClinics() {
        return Collections.unmodifiableMap(this.allClinics);
    }

    @Override
    public Map<String, Pet> getAllPets() {
        return Collections.unmodifiableMap(this.allPets);
    }

    @Override
    public void addClinic(String clinicName, Integer roomCapacity) {
        try {
            Clinic clinic = new ClinicImpl(clinicName, roomCapacity);
            this.allClinics.put(clinicName, clinic);
        } catch (IllegalArgumentException ex) {
            System.out.println(ex.getMessage());
        }
    }

    @Override
    public void addPet(String name, Integer age, String kind) {
        Pet pet = new PetImpl(name, age, kind);

        this.allPets.put(name, pet);
    }

    @Override
    public void addPetToClinic(String petName, String clinicName) {
        Pet pet = this.allPets.get(petName);

        if (this.allClinics.get(clinicName).hasEmptyRooms()) {
            this.allClinics.get(clinicName).addPet(pet);
            this.isAdded = true;
            
            return;
        }

        this.isAdded = false;
    }

    public boolean isAdded() {
        return this.isAdded;
    }
}
