package _03_JavaAdvanced._05_FunctionalProgrammingExercise;

import java.util.*;

import java.util.stream.Collectors;

public class _08_CustomComparator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        // Read input values
        List<Integer> numbers = Arrays.stream(scan.nextLine().split("\\s+")).map(Integer::parseInt).collect(Collectors.toList());
        
        // Comparator - function that has 2 ints In
        // 0 -> int 1 = int 2 - doesn't swap elements
        // 1 -> int 1 > int 2 - swaps elements
        // -1 -> int 1 < int 2 - doesn't swap elements
        Comparator<Integer> comparator = ((first, second) ->{
            // even and odd;
            //odd and even;
            if(first % 2 == 0 && second % 2 != 0){
                return -1;
            }else if(first % 2 !=0 && second % 2 == 0){
                return 1;
            }else{
                return first.compareTo(second);
            }
        });
        
        // Print result
        numbers.stream().sorted(comparator).forEach(e -> System.out.print(e + " "));
        
        scan.close();
    }
}
