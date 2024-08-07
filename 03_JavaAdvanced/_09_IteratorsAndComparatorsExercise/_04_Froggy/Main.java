package _03_JavaAdvanced._09_IteratorsAndComparatorsExercise._04_Froggy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String[] stonesArray = scan.nextLine().split(", ");
        Lake lake = new Lake(Arrays.stream(stonesArray).map(Integer::parseInt).collect(Collectors.toList()));
        List<String> output = new ArrayList<>();

        for (Integer stone : lake) {
            output.add(stone + "");
        }

        /*Iterator<Integer> frog = lake.iterator();
        while(frog.hasNext()){
            System.out.println(frog.next());
        }*/

        System.out.println(String.join(", ",output));
        
        scan.close();
    }
}
