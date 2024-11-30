using System;

public class _03_Harvest
{
    public static void Main(string[] args)
    {
        // Read the input values
        double yardSquareMeters = double.Parse(Console.ReadLine());
        double grapesPerSquareMeter = double.Parse(Console.ReadLine());
        double requiredLitersOfWine = double.Parse(Console.ReadLine());
        double numberOfWorkers = double.Parse(Console.ReadLine());

        // Calculate grape and wine production
        double grapeForWine = (yardSquareMeters * grapesPerSquareMeter) * 0.4;
        double litersOfWine = grapeForWine / 2.5;

        double wine = requiredLitersOfWine - litersOfWine;

        if (wine <= 0)
        {
            // Enough wine for everyone
            Console.WriteLine($"Good harvest this year! Total wine: {Math.Floor(litersOfWine):F0} liters.");
            Console.WriteLine($"{Math.Ceiling(Math.Abs(wine)):F0} liters left -> {Math.Ceiling(Math.Abs(wine) / numberOfWorkers):F0} liters per person.");
        }
        else
        {
            // Not enough wine
            Console.WriteLine($"It will be a tough winter! More {Math.Floor(Math.Abs(wine)):F0} liters wine needed.");
        }
    }
}
