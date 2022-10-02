package _04_JavaOOP._07_ReflectionAndAnnotation._01_Reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {

        Class<Reflection> reflectionClass = Reflection.class;

        //System.out.println(reflectionClass.getSimpleName());
        //System.out.println(reflectionClass.getSuperclass().getSimpleName());

        System.out.println("class " + reflectionClass.getSimpleName());
        System.out.println(reflectionClass.getSuperclass());
        Arrays.stream(reflectionClass.getInterfaces()).forEach(System.out::println);

        /*Class[] interfaces = reflectionClass.getInterfaces();
        for (Class anInterface : interfaces) {
            System.out.println(anInterface);
        }*/

        try{
            //Arrays.stream(reflectionClass.getInterfaces()).map(Class::getSimpleName).forEach(System.out::println);

            Constructor<Reflection> ctor = reflectionClass.getDeclaredConstructor();
            Reflection reflection = ctor.newInstance();
            System.out.println(reflection);

            //if its private setting accessibility -> true;
            /*Constructor<Reflection> ctor = reflectionClass.getDeclaredConstructor();
            ctor.setAccessible(true);
            Reflection reflection = ctor.newInstance();*/


        } catch (NoSuchMethodException | IllegalAccessException | InvocationTargetException | InstantiationException ex){
            ex.printStackTrace();
        }




    }
}
