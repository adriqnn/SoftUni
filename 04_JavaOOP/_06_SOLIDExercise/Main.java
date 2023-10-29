package _04_JavaOOP._06_SOLIDExercise;

import _04_JavaOOP._06_SOLIDExercise.enums.ReportLevel;
import _04_JavaOOP._06_SOLIDExercise.impl.factories.LoggerFactory;
import _04_JavaOOP._06_SOLIDExercise.interfaces.Logger;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        InputParser inputParser = new InputParser();
        LoggerFactory loggerFactory = new LoggerFactory();
        Logger logger = loggerFactory.produce(inputParser.readLoggerInfo(scan));

        String input = scan.nextLine();

        while (!"END".equals(input)) {
            String[] tokens = input.split("\\|");

            ReportLevel reportLevel = ReportLevel.valueOf(tokens[0]);
            String time = tokens[1];
            String message = tokens[2];

            switch (reportLevel){
                case INFO: logger.logInfo(time, message); break;
                case WARNING: logger.logWarning(time, message); break;
                case ERROR: logger.logError(time, message); break;
                case CRITICAL: logger.logCritical(time, message); break;
                case FATAL: logger.logFatal(time, message); break;
            }

            input = scan.nextLine();
        }

        System.out.println(logger);
        
        scan.close();
    }
}
