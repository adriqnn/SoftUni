package _03_JavaAdvanced._08_GenericsExercise._11_Threeuple;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Test Threeuple, Item1, Item2 and Item3
        Scanner scan = new Scanner(System.in);

        String first = scan.nextLine();
        String second = scan.nextLine();
        String third = scan.nextLine();

        Item1<String> firstThreeupleA = new Item1<>(first.split("\\s+")[0] + " " + first.split("\\s+")[1]);
        Item2<String> firstThreeupleB = new Item2<>(first.split("\\s+")[2]);
        Item3<String> firstThreeupleC = new Item3<>(first.split("\\s+")[3]);
        
        Threeuple<String, String, String> firstThreeuple = new Threeuple<>(firstThreeupleA, firstThreeupleB, firstThreeupleC);
        System.out.println(firstThreeuple);
        

        Item1<String> secondThreeupleA = new Item1<>(second.split("\\s+")[0]);
        Item2<Integer> secondThreeupleB = new Item2<>(Integer.parseInt(second.split("\\s+")[1]));
        Item3<Boolean> secondThreeupleC = new Item3<>(second.split("\\s+")[2].equals("drunk"));
        
        Threeuple<String, Integer, Boolean> secondThreeuple = new Threeuple<>(secondThreeupleA, secondThreeupleB, secondThreeupleC);
        System.out.println(secondThreeuple);
        

        Item1<String> thirdThreeupleA = new Item1<>(third.split("\\s+")[0]);
        Item2<Double> thirdThreeupleB = new Item2<>(Double.parseDouble(third.split("\\s+")[1]));
        Item3<String> thirdThreeupleC = new Item3<>(third.split("\\s+")[2]);
        
        Threeuple<String, Double, String> thirdThreeuple = new Threeuple<>(thirdThreeupleA, thirdThreeupleB, thirdThreeupleC);
        System.out.println(thirdThreeuple);
        

        scan.close();
    }
}
