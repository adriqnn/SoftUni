package _04_JavaOOP._07_ReflectionAndAnnotationExercise._02_BlackBoxInteger;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException, NoSuchFieldException {
        Scanner scan = new Scanner(System.in);
        
        Class<BlackBoxInt> clazz = BlackBoxInt.class;
        Constructor<BlackBoxInt> constructor = clazz.getDeclaredConstructor();
        constructor.setAccessible(true);
        BlackBoxInt blackBoxInt = constructor.newInstance();

        Field innerValue = clazz.getDeclaredField("innerValue");
        innerValue.setAccessible(true);
        
        String input = scan.nextLine();
        
        while(!input.equals("END")){
            String[] methodData = input.split("_");
            
            String methodName = methodData[0];
            int value = Integer.parseInt(methodData[1]);

            Method method = clazz.getDeclaredMethod(methodName, int.class);
            method.setAccessible(true);
            method.invoke(blackBoxInt, value);

            System.out.println(innerValue.get(blackBoxInt));

            input = scan.nextLine();
        }

        scan.close();
    }
}
