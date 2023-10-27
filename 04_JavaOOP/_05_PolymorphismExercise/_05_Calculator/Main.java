package _04_JavaOOP._05_PolymorphismExercise._05_Calculator;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        CalculationEngine engine = new CalculationEngine();
        InputInterpreter interpreter = Extensions.buildInterpreter(engine);
        String[] tokens = scan.nextLine().split("\\s+");

        for (String token : tokens) {
            if(token.equals("end")){
                break;
            }

            interpreter.interpret(token);
        }

        System.out.println(engine.getCurrentResult());

        scan.close();
    }
}
