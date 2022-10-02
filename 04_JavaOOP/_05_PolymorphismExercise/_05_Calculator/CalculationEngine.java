package _04_JavaOOP._05_PolymorphismExercise._05_Calculator;

import java.util.ArrayDeque;
import java.util.Deque;

public class CalculationEngine {
    private int result;
    private Operation currentOperation;
    private Deque<Integer> ms;

    public CalculationEngine(){
        this.result = 0;
        this.currentOperation = null;
        this.ms = new ArrayDeque<>();
    }

    public void pushNumber(int number) {
        if (this.currentOperation != null) {
            currentOperation.addOperand(number);

            if (currentOperation.isCompleted()) {
                this.result = currentOperation.getResult();
                this.currentOperation = null;
            }
        } else {
            this.result = number;
        }
    }

    void pushOperation(Operation operation) {
        if(operation == null){
            return;
        }
        if (operation.isCompleted()) {
            this.pushNumber(operation.getResult());
        } else {
            this.currentOperation = operation;
            this.pushNumber(this.result);
        }
    }

    public Operation getCurrentOperation() {
        return currentOperation;
    }

    int getCurrentResult() {
        return this.result;
    }

    public Deque<Integer> getMs() {
        return ms;
    }

    public int getResult() {
        return result;
    }
}
