package _04_JavaOOP._07_ReflectionAndAnnotationExercise._03_04_05_BarracksWars.core.commands;

import _04_JavaOOP._07_ReflectionAndAnnotationExercise._03_04_05_BarracksWars.interfaces.Executable;
import _04_JavaOOP._07_ReflectionAndAnnotationExercise._03_04_05_BarracksWars.interfaces.Repository;
import _04_JavaOOP._07_ReflectionAndAnnotationExercise._03_04_05_BarracksWars.interfaces.UnitFactory;

public abstract class Command implements Executable {
    private String[] data;
    private Repository repository;
    private UnitFactory unitFactory;

    public Command(String[] data, Repository repository, UnitFactory unitFactory) {
        this.data = data;
        this.repository = repository;
        this.unitFactory = unitFactory;
    }

    public String[] getData() {
        return data;
    }

    public void setData(String[] data) {
        this.data = data;
    }

    public Repository getRepository() {
        return repository;
    }

    public void setRepository(Repository repository) {
        this.repository = repository;
    }

    public UnitFactory getUnitFactory() {
        return unitFactory;
    }

    public void setUnitFactory(UnitFactory unitFactory) {
        this.unitFactory = unitFactory;
    }
}
