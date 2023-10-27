package _04_JavaOOP._05_PolymorphismExercise._05_Calculator;


public abstract class Extensions {
    static InputInterpreter buildInterpreter(CalculationEngine engine){
        return new InputInterpreter(engine);
    }
}
