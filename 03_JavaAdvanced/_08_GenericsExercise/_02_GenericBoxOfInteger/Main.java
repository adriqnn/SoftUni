package _03_JavaAdvanced._08_GenericsExercise._02_GenericBoxOfInteger;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());

        Box<Integer> box = new Box();
        for (int i = 0; i < n; i++) {
            int value = Integer.parseInt(scan.nextLine());;
            box.add(value);
        }
        System.out.println(box);
    }
}
