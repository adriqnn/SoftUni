package _03_JavaAdvanced._09_IteratorsAndComparatorsExercise._08_PetClinics;

import _03_JavaAdvanced._09_IteratorsAndComparatorsExercise._08_PetClinics.interfaces.CommandDispatcher;
import _03_JavaAdvanced._09_IteratorsAndComparatorsExercise._08_PetClinics.interfaces.Engine;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        CommandDispatcher commandDispatcher = new ClinicCommandDispatcherImpl();
        Engine engine = new EngineImpl(commandDispatcher);
        
        engine.run();
    }
}
