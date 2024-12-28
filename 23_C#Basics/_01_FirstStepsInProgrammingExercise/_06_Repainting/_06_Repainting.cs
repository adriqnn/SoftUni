using System;

public class _06_Repainting
{
    public static void Main(string[] args)
    {   
        // Read input data
        double coveringPlastic = double.Parse(Console.ReadLine());
        double paintInLiters = double.Parse(Console.ReadLine());
        double paintRemoverInLiters = double.Parse(Console.ReadLine());
        double hoursOfWork = double.Parse(Console.ReadLine());

        // Calculate prices for each material
        double coveringPlasticPrice = ((coveringPlastic + 2) * 1.50) + 0.40;
        double paintPrice = (paintInLiters * 1.1) * 14.50;
        double paintRemoverPrice = paintRemoverInLiters * 5.00;

        // Calculate total cost for materials
        double totalForMaterials = coveringPlasticPrice + paintPrice + paintRemoverPrice;

        // Calculate cost for labor
        double workPrice = totalForMaterials * 0.3 * hoursOfWork;

        // Calculate the final total cost
        double totalCost = totalForMaterials + workPrice;

        // Print the final total cost
        Console.WriteLine("{0:F2}", totalCost);
    }
}
