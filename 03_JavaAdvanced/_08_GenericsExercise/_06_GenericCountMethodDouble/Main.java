package _03_JavaAdvanced._08_GenericsExercise._06_GenericCountMethodDouble;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());

        Box<Double> box = new Box();
        for (int i = 0; i < n; i++) {
            Double value = Double.parseDouble(scan.nextLine());
            box.add(value);
        }
        Double compareToThis = Double.parseDouble(scan.nextLine());
        System.out.println(box.countOfGreaterItems(compareToThis));
    }
}
