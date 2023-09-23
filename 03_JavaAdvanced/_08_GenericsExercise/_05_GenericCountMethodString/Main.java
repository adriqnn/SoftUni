package _03_JavaAdvanced._08_GenericsExercise._05_GenericCountMethodString;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Test Box
        Scanner scan = new Scanner(System.in);
        
        int n = Integer.parseInt(scan.nextLine());
        Box<String> box = new Box();
        
        for (int i = 0; i < n; i++) {
            String value = scan.nextLine();
            box.add(value);
        }
        
        String compareToThis = scan.nextLine();
        
        System.out.println(box.countOfGreaterItems(compareToThis));
        
        scan.close();
    }
}
