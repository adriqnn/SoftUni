package _04_JavaOOP._05_PolymorphismExercise._05_Calculator;

public class InputInterpreter {
    private CalculationEngine engine;

    public InputInterpreter(CalculationEngine engine){
        this.engine = engine;
    }

    public boolean interpret(String input) {
        try {
            engine.pushNumber(Integer.parseInt(input));
        }catch (Exception ex){
            engine.pushOperation(this.getOperation(input));
        }
        return true;
    }

    public Operation getOperation(String operation) {
        if (operation.equals("*")) {
            return new MultiplicationOperation();
        }else if(operation.equals("/")){
            return new DivisionOperation();
        }else if(operation.equals("mr")){
            this.engine.pushNumber(this.engine.getMs().pop());
            return this.engine.getCurrentOperation();
        }else if(operation.equals("ms")){
            this.engine.getMs().push(this.engine.getResult());
            return null;
        }
        return null;
    }
}
