package _04_JavaOOP._07_ReflectionAndAnnotationExercise._03_04_05_BarracksWars.core.commands;

import _04_JavaOOP._07_ReflectionAndAnnotationExercise._03_04_05_BarracksWars.interfaces.Repository;
import _04_JavaOOP._07_ReflectionAndAnnotationExercise._03_04_05_BarracksWars.interfaces.UnitFactory;

public class Retire extends Command{
    public Retire(String[] data, Repository repository, UnitFactory unitFactory) {
        super(data, repository, unitFactory);
    }

    @Override
    public String execute() {
        String unitType = getData()[1];
        
        getRepository().removeUnit(unitType);
        return unitType + " retired!";
    }
}
