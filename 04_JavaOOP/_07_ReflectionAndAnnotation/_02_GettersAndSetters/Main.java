package _04_JavaOOP._07_ReflectionAndAnnotation._02_GettersAndSetters;

import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.Comparator;

public class Main {
    private static class MethodComparator implements Comparator<Method> {

        @Override
        public int compare(Method f, Method s) {
            boolean firstIsGetter = f.getName().startsWith("get");
            boolean secondIsGetter = s.getName().startsWith("get");

            if(firstIsGetter && secondIsGetter){
                return f.getName().compareTo(s.getName());
            }

            boolean firstIsSetter = f.getName().startsWith("set");
            boolean secondIsSetter = s.getName().startsWith("set");

            if(firstIsSetter && secondIsSetter){
                return f.getName().compareTo(s.getName());
            }

            return Boolean.compare(secondIsGetter,firstIsGetter);
        }
    }

    public static void main(String[] args) {
        Class<Reflection> clazz = Reflection.class;

        Method[] allMethods = clazz.getDeclaredMethods();

        Arrays.stream(allMethods).filter(m -> !m.getName().equals("toString")).sorted(new MethodComparator()).forEach(Main::printMethodInfo);

        /*Method[] methods = Reflection.class.getDeclaredMethods();
        Method[] getters = Arrays.stream(methods).filter(m -> m.getName().startsWith("get") && m.getParameterCount() == 0).sorted(Comparator.comparing(Method::getName)).toArray(Method[]::new);
        Arrays.stream(getters).forEach(m -> System.out.printf("%s will return class %s%n",m.getName(),m.getReturnType().getName()));*/
    }

    private static void printMethodInfo(Method m) {
        System.out.println(m.getName().startsWith("get")
                ? String.format("%s will return class %s",m.getName(),m.getReturnType().getName())
                : String.format("%s and will set field of class %s",m.getName(),m.getParameterTypes()[0].getName()));
    }
}
