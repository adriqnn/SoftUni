package _04_JavaOOP._01_WorkingWithAbstraction._02_PointInRectangle;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        int[] coordinates = readArray(scan);
        
        Point pointA = new Point(coordinates[0], coordinates[1]);
        Point pointB = new Point(coordinates[2], coordinates[3]);
        
        Rectangle rectangle = new Rectangle(pointA, pointB);
        
        int n = Integer.parseInt(scan.nextLine());
        
        while(n-- > 0){
            int[] tokens = readArray(scan);
            Point p = new Point(tokens[0], tokens[1]);
            boolean isInside = rectangle.contains(p);
            
            System.out.println(isInside);
        }
        
        scan.close();
    }
    
    public static int[] readArray(Scanner scan){
        return Arrays.stream(scan.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();
    }
}
