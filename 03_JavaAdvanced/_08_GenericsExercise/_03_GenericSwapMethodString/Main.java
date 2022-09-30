package _03_JavaAdvanced._08_GenericsExercise._03_GenericSwapMethodString;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());

        Box<String> box = new Box();
        for (int i = 0; i < n; i++) {
            String value = scan.nextLine();
            box.add(value);
        }
        String[] indexes = scan.nextLine().split("\\s+");
        int firstIndex = Integer.parseInt(indexes[0]);
        int secondIndex = Integer.parseInt(indexes[1]);
        box.swap(firstIndex,secondIndex);
        System.out.println(box);
    }
}
