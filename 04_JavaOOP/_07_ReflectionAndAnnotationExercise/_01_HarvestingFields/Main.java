package _04_JavaOOP._07_ReflectionAndAnnotationExercise._01_HarvestingFields;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String input = scan.nextLine();

        Class<RichSoilLand> clazz = RichSoilLand.class;
        Field[] declaredFields = clazz.getDeclaredFields();

        while(!input.equals("HARVEST")){
            switch(input){
                case "public":
					/*
					Arrays.stream(declaredFields).filter(f -> Modifier.isPublic(f.getModifiers())).forEach(f -> {
					    System.out.printf("%s %s %s%n", Modifier.toString(f.getModifiers()), f.getType().getSimpleName(), f.getName());
					    });
					*/

                    for(Field field : declaredFields){
                        if(Modifier.isPublic(field.getModifiers())){
                            System.out.printf("%s %s %s%n", Modifier.toString(field.getModifiers()), field.getType().getSimpleName(), field.getName());
                        }
                    }

                    break;
                case "private":
                    for(Field field : declaredFields){
                        if(Modifier.isPrivate(field.getModifiers())){
                            System.out.printf("%s %s %s%n", Modifier.toString(field.getModifiers()), field.getType().getSimpleName(), field.getName());
                        }
                    }
                    
                    break;
                case "protected":
                    for(Field field : declaredFields){
                        if(Modifier.isProtected(field.getModifiers())){
                            System.out.printf("%s %s %s%n", Modifier.toString(field.getModifiers()), field.getType().getSimpleName(), field.getName());
                        }
                    }
                    
                    break;
                case "all":
                    Arrays.stream(declaredFields).forEach(f -> {System.out.printf("%s %s %s%n", Modifier.toString(f.getModifiers()), f.getType().getSimpleName(), f.getName());});
                    
                    break;
            }

            input = scan.nextLine();
        }

        scan.close();
    }
}
