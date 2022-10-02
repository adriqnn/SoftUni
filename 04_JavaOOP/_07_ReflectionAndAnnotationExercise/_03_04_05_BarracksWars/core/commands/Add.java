package _04_JavaOOP._07_ReflectionAndAnnotationExercise._03_04_05_BarracksWars.core.commands;

import _04_JavaOOP._07_ReflectionAndAnnotationExercise._03_04_05_BarracksWars.interfaces.Repository;
import _04_JavaOOP._07_ReflectionAndAnnotationExercise._03_04_05_BarracksWars.interfaces.Unit;
import _04_JavaOOP._07_ReflectionAndAnnotationExercise._03_04_05_BarracksWars.interfaces.UnitFactory;

public class Add extends Command{
    public Add(String[] data, Repository repository, UnitFactory unitFactory) {
        super(data, repository, unitFactory);
    }

    @Override
    public String execute() {
        String unitType = getData()[1];
        Unit unitToAdd = this.getUnitFactory().createUnit(unitType);
        this.getRepository().addUnit(unitToAdd);
        String output = unitType + " added!";
        return output;
    }
}
