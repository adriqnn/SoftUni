using System;

public class _05_SmallShop
{
    public static void Main(string[] args)
    {
        // Read input values from console
        string product = Console.ReadLine();
        string town = Console.ReadLine();
        double quantity = double.Parse(Console.ReadLine());

        // Prices in Sofia
        const double SOFIA_COFFEE_PRICE = 0.50;
        const double SOFIA_WATER_PRICE = 0.80;
        const double SOFIA_BEER_PRICE = 1.20;
        const double SOFIA_SWEETS_PRICE = 1.45;
        const double SOFIA_PEANUTS_PRICE = 1.60;

        // Prices in Plovdiv
        const double PLOVDIV_COFFEE_PRICE = 0.40;
        const double PLOVDIV_WATER_PRICE = 0.70;
        const double PLOVDIV_BEER_PRICE = 1.15;
        const double PLOVDIV_SWEETS_PRICE = 1.30;
        const double PLOVDIV_PEANUTS_PRICE = 1.50;

        // Prices in Varna
        const double VARNA_COFFEE_PRICE = 0.45;
        const double VARNA_WATER_PRICE = 0.70;
        const double VARNA_BEER_PRICE = 1.10;
        const double VARNA_SWEETS_PRICE = 1.35;
        const double VARNA_PEANUTS_PRICE = 1.55;

        double totalPrice = 0;

        // Calculate the profit based on town
        if (town.Equals("Sofia"))
        {
            switch (product)
            {
                case "coffee":
                    totalPrice = quantity * SOFIA_COFFEE_PRICE;
                    break;
                case "water":
                    totalPrice = quantity * SOFIA_WATER_PRICE;
                    break;
                case "beer":
                    totalPrice = quantity * SOFIA_BEER_PRICE;
                    break;
                case "sweets":
                    totalPrice = quantity * SOFIA_SWEETS_PRICE;
                    break;
                case "peanuts":
                    totalPrice = quantity * SOFIA_PEANUTS_PRICE;
                    break;
            }
        }
        else if (town.Equals("Plovdiv"))
        {
            switch (product)
            {
                case "coffee":
                    totalPrice = quantity * PLOVDIV_COFFEE_PRICE;
                    break;
                case "water":
                    totalPrice = quantity * PLOVDIV_WATER_PRICE;
                    break;
                case "beer":
                    totalPrice = quantity * PLOVDIV_BEER_PRICE;
                    break;
                case "sweets":
                    totalPrice = quantity * PLOVDIV_SWEETS_PRICE;
                    break;
                case "peanuts":
                    totalPrice = quantity * PLOVDIV_PEANUTS_PRICE;
                    break;
            }
        }
        else if (town.Equals("Varna"))
        {
            switch (product)
            {
                case "coffee":
                    totalPrice = quantity * VARNA_COFFEE_PRICE;
                    break;
                case "water":
                    totalPrice = quantity * VARNA_WATER_PRICE;
                    break;
                case "beer":
                    totalPrice = quantity * VARNA_BEER_PRICE;
                    break;
                case "sweets":
                    totalPrice = quantity * VARNA_SWEETS_PRICE;
                    break;
                case "peanuts":
                    totalPrice = quantity * VARNA_PEANUTS_PRICE;
                    break;
            }
        }

        // Print the result total price
        Console.WriteLine($"Total price: {totalPrice:F2}");
    }
}

