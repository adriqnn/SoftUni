using System;

public class _07_FootballLeague
{
    public static void Main(string[] args)
    {
        // Read input values
        int stadiumCapacity = int.Parse(Console.ReadLine());
        double fansCount = double.Parse(Console.ReadLine());

        // Add variables
        double sectorA = 0;
        double sectorB = 0;
        double sectorV = 0;
        double sectorG = 0;

        // Process each fan's sector and calculate statistics
        for (int i = 0; i < fansCount; i++)
        {
            string sector = Console.ReadLine().ToLower();

            if (sector == "a")
            {
                sectorA++;
            }
            else if (sector == "b")
            {
                sectorB++;
            }
            else if (sector == "v")
            {
                sectorV++;
            }
            else if (sector == "g")
            {
                sectorG++;
            }
        }

        // Calculate and print the statistics
        Console.WriteLine("{0:F2}%", sectorA / fansCount * 100);
        Console.WriteLine("{0:F2}%", sectorB / fansCount * 100);
        Console.WriteLine("{0:F2}%", sectorV / fansCount * 100);
        Console.WriteLine("{0:F2}%", sectorG / fansCount * 100);
        Console.WriteLine("{0:F2}%", fansCount / stadiumCapacity * 100);
    }
}
