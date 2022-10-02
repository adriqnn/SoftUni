package _04_JavaOOP._01_WorkingWithAbstraction._04_HotelReservation;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] console = scan.nextLine().split("\\s+");
        double pricePerDay = Double.parseDouble(console[0]);
        int numberOfDays = Integer.parseInt(console[1]);
        Season season = Season.valueOf(console[2].toUpperCase());
        Discount discountType = Discount.valueOf(console[3]);

        PriceCalculator priceCalculator = new PriceCalculator(pricePerDay,numberOfDays,season,discountType);
        System.out.println(priceCalculator.returnPrice());
    }
}
