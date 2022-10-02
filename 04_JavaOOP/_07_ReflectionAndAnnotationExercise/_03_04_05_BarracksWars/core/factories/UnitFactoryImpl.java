package _04_JavaOOP._07_ReflectionAndAnnotationExercise._03_04_05_BarracksWars.core.factories;

import _04_JavaOOP._07_ReflectionAndAnnotationExercise._03_04_05_BarracksWars.interfaces.Unit;
import _04_JavaOOP._07_ReflectionAndAnnotationExercise._03_04_05_BarracksWars.interfaces.UnitFactory;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class UnitFactoryImpl implements UnitFactory {

    private static final String UNITS_PACKAGE_NAME =
            "_04_JavaOOP._07_ReflectionAndAnnotationExercise._03_04_05_BarracksWars.models.units.";

    @Override
    public Unit createUnit(String unitType) {
        try {
            Class unitClass = Class.forName(UNITS_PACKAGE_NAME + unitType);
            Constructor<Unit> unitConstructor = unitClass.getDeclaredConstructor();
            return unitConstructor.newInstance();
        } catch (ClassNotFoundException | NoSuchMethodException | InstantiationException | IllegalAccessException | InvocationTargetException e) {
            e.printStackTrace();
            return null;
        }

		/*switch(unitType){
			case "Archer":
				return new Archer();
			case "Swordsman":
				return new Swordsman();
			case "Pikeman":
				return new Pikeman();
			case "Horseman":
				return new Horseman();
			case "Gunner":
				return new Gunner();
		}
		throw new ExecutionControl.NotImplementedException("message");*/
    }
}
