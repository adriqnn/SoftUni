package _03_JavaAdvanced._05_FunctionalProgrammingExercise;

import java.util.Scanner;
import java.util.function.Consumer;

public class _01_ConsumerPrint {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Read input value
        String input = scan.nextLine();

        String[] names = input.split("\\s+");
        Consumer<String> printName = System.out::println;

        // Print input with the consumer
        for (String name : names) {
            printName.accept(name);
        }

        scan.close();

        // Other solution
//        Consumer<String[]> printNames = array -> {
//            for (String s : array) {
//                System.out.println(s);
//            }
//        };
        
//        printNames.accept(names);
    }
}
