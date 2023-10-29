package _04_JavaOOP._06_SOLIDExercise;

import java.util.Scanner;

public class InputParser {
    public String readLoggerInfo(Scanner scan){
        int n = Integer.parseInt(scan.nextLine());
        StringBuilder sb = new StringBuilder();

        while(n-- > 0){
            sb.append(scan.nextLine()).append(System.lineSeparator());
        }
        
        return sb.toString();
    }
}
