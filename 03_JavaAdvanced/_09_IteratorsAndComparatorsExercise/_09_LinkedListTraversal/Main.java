package _03_JavaAdvanced._09_IteratorsAndComparatorsExercise._09_LinkedListTraversal;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int numberOfLine = Integer.parseInt(scan.nextLine());
        List<Integer> numbers = new ArrayList<>();

        for (int i = 0; i < numberOfLine; i++) {
            String[] information = scan.nextLine().split("\\s+");

            if(information[0].equals("Add")){
                numbers.add(Integer.parseInt(information[1]));
            }else{
                int num = Integer.parseInt(information[1]);
                for (int j = 0; j < numbers.size(); j++) {
                    if(num == numbers.get(j)){
                        numbers.remove(j);
                        break;
                    }
                }
            }
        }
        System.out.println(numbers.size());
        System.out.println(numbers.stream().map(String::valueOf).collect(Collectors.joining(" ")));
    }
}
