using System;

public class _03_Logistics
{
    public static void Main(string[] args)
    {
        // Read input value
        int cargoCount = int.Parse(Console.ReadLine());

        // Add variables
        double totalCargoTransported = 0;
        double totalPrice = 0;
        double cargoByBus = 0;
        double cargoByTruck = 0;
        double cargoByTrain = 0;

        // Process each cargo and calculate statistics
        for (int i = 0; i < cargoCount; i++)
        {
            double cargoWeight = double.Parse(Console.ReadLine());

            if (cargoWeight <= 3)
            {
                cargoByBus += cargoWeight;
                totalPrice += cargoWeight * 200;
            }
            else if (cargoWeight <= 11)
            {
                cargoByTruck += cargoWeight;
                totalPrice += cargoWeight * 175;
            }
            else
            {
                cargoByTrain += cargoWeight;
                totalPrice += cargoWeight * 120;
            }

            totalCargoTransported += cargoWeight;
        }

        // Calculate and print the statistics
        Console.WriteLine("{0:F2}", totalPrice / totalCargoTransported);
        Console.WriteLine("{0:F2}%", cargoByBus / totalCargoTransported * 100);
        Console.WriteLine("{0:F2}%", cargoByTruck / totalCargoTransported * 100);
        Console.WriteLine("{0:F2}%", cargoByTrain / totalCargoTransported * 100);
    }
}

