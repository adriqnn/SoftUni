package _03_JavaAdvanced._08_GenericsExercise._10_Tuple;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Test Tuple, Item1 and Item2
        Scanner scan = new Scanner(System.in);

        String first = scan.nextLine();
        String second = scan.nextLine();
        String third = scan.nextLine();

        Item1<String> firstTupleA = new Item1<>(first.split("\\s+")[0] + " " + first.split("\\s+")[1]);
        Item2<String> firstTupleB = new Item2<>(first.split("\\s+")[2]);
        Tuple<String, String> firstTuple = new Tuple<>(firstTupleA, firstTupleB);
        
        System.out.println(firstTuple);

        Item1<String> secondTupleA = new Item1<>(second.split(" ")[0]);
        Item2<Integer> secondTupleB = new Item2<>(Integer.parseInt(second.split(" ")[1]));
        Tuple<String, Integer> secondTuple = new Tuple<>(secondTupleA, secondTupleB);
        
        System.out.println(secondTuple);

        Item1<Integer> thirdTupleA = new Item1<>(Integer.parseInt(third.split(" ")[0]));
        Item2<Double> thirdTupleB = new Item2<>(Double.parseDouble(third.split(" ")[1]));
        Tuple<Integer, Double> thirdTuple = new Tuple<>(thirdTupleA, thirdTupleB);
        
        System.out.println(thirdTuple);

        scan.close();
    }
}
