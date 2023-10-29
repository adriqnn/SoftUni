package _04_JavaOOP._06_SOLIDExercise.impl.layouts;

import _04_JavaOOP._06_SOLIDExercise.enums.ReportLevel;
import _04_JavaOOP._06_SOLIDExercise.interfaces.Layout;

public class XmlLayout implements Layout {

    @Override
    public String format(String time, String message, ReportLevel reportLevel) {
        return String.format("<log>%n   <date>%s</date>%n   <level>%s</level>%n   <message>%s</message>%n</log>%n", time, reportLevel, message);
    }
}
