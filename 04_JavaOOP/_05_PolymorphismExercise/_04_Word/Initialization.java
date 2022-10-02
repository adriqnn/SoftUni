package _04_JavaOOP._05_PolymorphismExercise._04_Word;

public abstract class Initialization implements CommandInterface{
    public static CommandInterface buildCommandInterface(StringBuilder text){
        return new CommandExecution(text);
    }

}

