package _01_ProgrammingBasics._05_LoopsPartTwoExercise;

import java.util.Scanner;

public class _04_Walking {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String console = scan.nextLine();
        int stepsCounter = 0;

        while (!console.equals("Going home")){
            int steps = Integer.parseInt(console);
            stepsCounter += steps;
            if (stepsCounter>=10000){
                System.out.printf("Goal reached! Good job!%n" +
                        "%d steps over the goal!", Math.abs(10000-stepsCounter));
                break;
            }
            console = scan.nextLine();
        }
        if (console.equals("Going home")){
            int stepsAfter = Integer.parseInt(scan.nextLine());
            stepsCounter += stepsAfter;
            if (stepsCounter>=10000){
                System.out.printf("Goal reached! Good job!%n" +
                        "%d steps over the goal!", Math.abs(10000-stepsCounter));
            }else{
                System.out.printf("%d more steps to reach goal.",Math.abs(10000-stepsCounter));
            }
        }
    }
}
