package _05_HackerRank._01_Java;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class _36_JavaGenericsV2 {
    public static void main( String args[] ) {
        Integer[] intArray = { 1, 2, 3 };
        String[] stringArray = {"Hello", "World"};
        printArray(Arrays.stream(intArray).collect(Collectors.toList()));
        printArray(Arrays.stream(stringArray).collect(Collectors.toList()));
    }

    private static void printArray(List<?> list){
        list.forEach(System.out::println);
    }
}
