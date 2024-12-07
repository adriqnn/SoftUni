using System;

public class _02_SummerOutfit
{
    public static void Main(string[] args)
    {
        // Read input values
        int degrees = int.Parse(Console.ReadLine());
        string dayTime = Console.ReadLine();

        string outfit = "";
        string shoes = "";

        // Determine outfit and shoes based on temperature and part of the day
        if ("Morning".Equals(dayTime))
        {
            if (degrees >= 10 && degrees <= 18)
            {
                outfit = "Sweatshirt";
                shoes = "Sneakers";
            }
            else if (degrees > 18 && degrees <= 24)
            {
                outfit = "Shirt";
                shoes = "Moccasins";
            }
            else
            {
                outfit = "T-Shirt";
                shoes = "Sandals";
            }
        }
        else if ("Afternoon".Equals(dayTime))
        {
            if (degrees <= 18 && degrees >= 10)
            {
                outfit = "Shirt";
                shoes = "Moccasins";
            }
            else if (degrees <= 24 && degrees > 18)
            {
                outfit = "T-Shirt";
                shoes = "Sandals";
            }
            else
            {
                outfit = "Swim Suit";
                shoes = "Barefoot";
            }
        }
        else if ("Evening".Equals(dayTime))
        {
            if (degrees <= 18 && degrees >= 10)
            {
                outfit = "Shirt";
                shoes = "Moccasins";
            }
            else if (degrees <= 24 && degrees > 18)
            {
                outfit = "Shirt";
                shoes = "Moccasins";
            }
            else
            {
                outfit = "Shirt";
                shoes = "Moccasins";
            }
        }

        // Display the suggested outfit and shoes based on conditions
        Console.WriteLine($"It's {degrees} degrees, get your {outfit} and {shoes}.");
    }
}
