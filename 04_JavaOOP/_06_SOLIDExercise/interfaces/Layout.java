package _04_JavaOOP._06_SOLIDExercise.interfaces;

import _04_JavaOOP._06_SOLIDExercise.enums.ReportLevel;

public interface Layout {
    String format(String time, String message, ReportLevel reportLevel);
}

