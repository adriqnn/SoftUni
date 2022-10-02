package _04_JavaOOP._07_ReflectionAndAnnotationExercise._03_04_05_BarracksWars;


import _04_JavaOOP._07_ReflectionAndAnnotationExercise._03_04_05_BarracksWars.core.Engine;
import _04_JavaOOP._07_ReflectionAndAnnotationExercise._03_04_05_BarracksWars.core.factories.UnitFactoryImpl;
import _04_JavaOOP._07_ReflectionAndAnnotationExercise._03_04_05_BarracksWars.data.UnitRepository;
import _04_JavaOOP._07_ReflectionAndAnnotationExercise._03_04_05_BarracksWars.interfaces.Repository;
import _04_JavaOOP._07_ReflectionAndAnnotationExercise._03_04_05_BarracksWars.interfaces.Runnable;
import _04_JavaOOP._07_ReflectionAndAnnotationExercise._03_04_05_BarracksWars.interfaces.UnitFactory;

public class Main {
    public static void main(String[] args) {
        Repository repository = new UnitRepository();
        UnitFactory unitFactory = new UnitFactoryImpl();

        Runnable engine = new Engine(repository, unitFactory);
        engine.run();
    }
}
