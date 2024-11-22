using System;

public class _07_HousePainting
{
    public static void Main(string[] args)
    {
        // Read input dimensions
        double houseHeight = double.Parse(Console.ReadLine());
        double houseLength = double.Parse(Console.ReadLine());
        double heightOfTheRoof = double.Parse(Console.ReadLine());

        // Calculate areas of walls and roof
        double wallsFrontAndBack = ((houseHeight * houseHeight) * 2) - (1.2 * 2);
        double wallsSide = ((houseHeight * houseLength) * 2) - ((1.5 * 1.5) * 2);

        double roofSides = (houseHeight * houseLength) * 2;
        double roofFronts = ((houseHeight * heightOfTheRoof) / 2) * 2;

        // Calculate required liters of green and red paint
        double litersGreenPaint = (wallsFrontAndBack + wallsSide) / 3.4;
        double litersRedPaint = (roofSides + roofFronts) / 4.3;

        // Print the required liters of green and red paint with two decimal places
        Console.WriteLine("{0:F2}", litersGreenPaint);
        Console.WriteLine("{0:F2}\n", litersRedPaint);
    }
}
