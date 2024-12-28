using System;

public class _07_FoodDelivery
{
    public static void Main(string[] args)
    {
        // Read input data
        int chickenMenus = int.Parse(Console.ReadLine());
        int fishMenus = int.Parse(Console.ReadLine());
        int vegetarianMenus = int.Parse(Console.ReadLine());

        // Calculate prices for each type of menu
        double priceForChickenMenus = chickenMenus * 10.35;
        double priceForFishMenus = fishMenus * 12.40;
        double priceForVegetarianMenus = vegetarianMenus * 8.15;

        // Calculate total price for menus
        double totalPriceForMenus = priceForChickenMenus + priceForFishMenus + priceForVegetarianMenus;

        // Calculate price for desserts (20%)
        double priceForDesserts = totalPriceForMenus * 0.20;

        // Calculate the final total price including delivery
        double totalPrice = totalPriceForMenus + priceForDesserts + 2.50;

        // Print the final total price
        Console.WriteLine("{0:F2}", totalPrice);
    }
}
