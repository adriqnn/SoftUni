package _04_JavaOOP._06_SOLIDExercise.impl.factories;

import _04_JavaOOP._06_SOLIDExercise.enums.ReportLevel;
import _04_JavaOOP._06_SOLIDExercise.impl.appenders.ConsoleAppender;
import _04_JavaOOP._06_SOLIDExercise.impl.appenders.FileAppender;
import _04_JavaOOP._06_SOLIDExercise.interfaces.Appender;
import _04_JavaOOP._06_SOLIDExercise.interfaces.Factory;
import _04_JavaOOP._06_SOLIDExercise.interfaces.Layout;

public class AppenderFactory implements Factory<Appender> {
    private LayoutFactory layoutFactory;

    public AppenderFactory() {
        this.layoutFactory = new LayoutFactory();
    }

    @Override
    public Appender produce(String input) {
        String[] tokens = input.split("\\s+");
        String appenderType = tokens[0];
        String layoutType = tokens[1];

        Layout layout = layoutFactory.produce(layoutType);
        Appender appender = null;
        if(appenderType.equals("ConsoleAppender")){
            appender = new ConsoleAppender(layout);
        }else if(appenderType.equals("FileAppender")){
            appender = new FileAppender(layout);
        }

        if(tokens.length >= 3){
            appender.setReportLevel(ReportLevel.valueOf(tokens[2]));
        }

        return appender;
    }
}
