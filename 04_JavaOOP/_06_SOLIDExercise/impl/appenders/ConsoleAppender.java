package _04_JavaOOP._06_SOLIDExercise.impl.appenders;

import _04_JavaOOP._06_SOLIDExercise.enums.ReportLevel;
import _04_JavaOOP._06_SOLIDExercise.interfaces.Layout;

public class ConsoleAppender extends BaseAppender {

    public ConsoleAppender(Layout layout) {
        super(layout);
    }

    @Override
    public void append(String time, String message, ReportLevel reportLevel) {
        if(this.canAppend(reportLevel)) {
            String formattedMessage = this.layout.format(time, message, reportLevel);
            increaseMessageCount();
            
            System.out.println(formattedMessage);
        }
    }
}
