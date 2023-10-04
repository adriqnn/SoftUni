package _03_JavaAdvanced._09_IteratorsAndComparatorsExercise._08_PetClinics;

import _03_JavaAdvanced._09_IteratorsAndComparatorsExercise._08_PetClinics.interfaces.CommandDispatcher;
import _03_JavaAdvanced._09_IteratorsAndComparatorsExercise._08_PetClinics.interfaces.Engine;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class EngineImpl implements Engine {

    private CommandDispatcher commandDispatcher;
    private BufferedReader bufferedReader;

    public EngineImpl(CommandDispatcher commandDispatcher) {
        this.commandDispatcher = commandDispatcher;
        this.bufferedReader = new BufferedReader(new InputStreamReader(System.in));
    }

    @Override
    public void run() throws IOException {
        Integer lineCount = Integer.valueOf(this.bufferedReader.readLine());

        for (int currentLine = 0; currentLine < lineCount; currentLine++) {

            String[] params = this.bufferedReader.readLine().split("\\s+");
            this.commandDispatcher.dispatch(params);
        }
    }
}
