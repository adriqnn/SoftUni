package _04_JavaOOP._06_SOLIDExercise.interfaces;

import _04_JavaOOP._06_SOLIDExercise.enums.ReportLevel;

public interface Appender {
    void append(String time, String message, ReportLevel reportLevel);
    
    void setReportLevel(ReportLevel reportLevel);
}

