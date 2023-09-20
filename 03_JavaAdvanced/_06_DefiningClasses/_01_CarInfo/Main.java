package _03_JavaAdvanced._06_DefiningClasses._01_CarInfo;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        int n = Integer.parseInt(scan.nextLine());
        
        ArrayList<CarInfo> cars = new ArrayList<>();
        
        for (int i = 0; i < n; i++) {
            String[] carLine = scan.nextLine().split("\\s+");
            
            CarInfo car = new CarInfo(carLine[0], carLine[1], Integer.parseInt(carLine[2]));
            cars.add(car);
        }
        
        cars.forEach(System.out::println);
    }
}
