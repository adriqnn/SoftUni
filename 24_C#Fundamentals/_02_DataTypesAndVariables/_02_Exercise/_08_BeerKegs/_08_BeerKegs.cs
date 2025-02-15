using System;

public class _08_BeerKegs
{
    public static void Main(string[] args)
    {
        // Read input value
        int n = int.Parse(Console.ReadLine());

        // Add variables
        double volumeOfTheBiggestKeg = 0;
        string modelOfTheBiggestKeg = "";

        // Determine the volume
        for (int i = 0; i < n; i++)
        {
            string model = Console.ReadLine();
            double radius = double.Parse(Console.ReadLine());
            int height = int.Parse(Console.ReadLine());

            double volume = Math.PI * radius * radius * height;

            if (volume > volumeOfTheBiggestKeg)
            {
                volumeOfTheBiggestKeg = volume;
                modelOfTheBiggestKeg = model;
            }
        }

        // Print result
        Console.WriteLine(modelOfTheBiggestKeg);
    }
}
