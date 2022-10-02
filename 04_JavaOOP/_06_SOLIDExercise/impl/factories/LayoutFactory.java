package _04_JavaOOP._06_SOLIDExercise.impl.factories;

import _04_JavaOOP._06_SOLIDExercise.impl.layouts.SimpleLayout;
import _04_JavaOOP._06_SOLIDExercise.impl.layouts.XmlLayout;
import _04_JavaOOP._06_SOLIDExercise.interfaces.Factory;
import _04_JavaOOP._06_SOLIDExercise.interfaces.Layout;

public class LayoutFactory implements Factory<Layout> {

    @Override
    public Layout produce(String input) {
        Layout layout = null;
        if(input.equals("SimpleLayout")){
            layout = new SimpleLayout();
        }else if(input.equals("XmlLayout")){
            layout = new XmlLayout();
        }
        return layout;
    }
}
