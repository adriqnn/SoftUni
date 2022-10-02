package _04_JavaOOP._06_SOLIDExercise.interfaces;

public interface Logger {

    void logInfo(String time,String message);
    void logWarning(String time,String message);
    void logError(String time,String message);
    void logCritical(String time,String message);
    void logFatal(String time,String message);
}
