package _04_JavaOOP._07_ReflectionAndAnnotation._03_HigQualityMistakes;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        Class<Reflection> clazz = Reflection.class;

        //Modifier
        Arrays.stream(clazz.getDeclaredFields()).filter(f -> !Modifier.isPrivate(f.getModifiers())).sorted(Comparator.comparing(Field::getName)).forEach(e -> System.out.println(e.getName() + " must be private!"));

        Method[] declaredMethods = Arrays.stream(clazz.getDeclaredMethods()).filter(m -> !m.getName().equals("toString")).toArray(Method[]::new);

        //Getters
        Arrays.stream(declaredMethods).filter(m -> m.getReturnType() != void.class).filter(m -> !Modifier.isPublic(m.getModifiers()))
                .sorted(Comparator.comparing(Method::getName)).collect(Collectors.toList()).forEach(m -> System.out.println(m.getName() + " have to be public!"));

        //Setters
        //List<Method> setters = Arrays.stream(declaredMethods).filter(m -> m.getReturnType() == void.class).collect(Collectors.toList());
        Arrays.stream(declaredMethods).filter(m -> m.getReturnType() == void.class).filter(m -> !Modifier.isPrivate(m.getModifiers()))
                .sorted(Comparator.comparing(Method::getName)).collect(Collectors.toList()).forEach(m -> System.out.println(m.getName() + " have to be private!"));
    }
}
