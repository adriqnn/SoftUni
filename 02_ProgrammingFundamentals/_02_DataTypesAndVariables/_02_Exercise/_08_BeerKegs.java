package _02_ProgrammingFundamentals._02_DataTypesAndVariables._02_Exercise;

import java.util.Scanner;

public class _08_BeerKegs {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Read input value
        int n = Integer.parseInt(scan.nextLine());

        // Add variable
        double volumeOfTheBiggestKeg = 0;
        String modelOfTheBiggestKeg = "";
        
        // Determine the volume
        for (int i = 0; i < n; i++) {
            String model = scan.nextLine();
            double radius = Double.parseDouble(scan.nextLine());
            int height = Integer.parseInt(scan.nextLine());
            
            double volume = Math.PI * radius * radius * height;
            
            if (volume > volumeOfTheBiggestKeg) {
                volumeOfTheBiggestKeg = volume;
                modelOfTheBiggestKeg = model;
            }
        }

        // Print result
        System.out.println(modelOfTheBiggestKeg);
        
        scan.close();
    }
}
