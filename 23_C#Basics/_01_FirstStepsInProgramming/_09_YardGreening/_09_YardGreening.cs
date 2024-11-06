using System;

public class _09_YardGreening
{
    public static void Main(string[] args)
    {
        // Read input data
        double squareMetersPlot = double.Parse(Console.ReadLine());

        // Calculate initial cost of greening and discount
        double costOfGreening = squareMetersPlot * 7.61;
        double discount = costOfGreening * 0.18;

        // Calculate final cost with discount
        double costWithDiscount = costOfGreening - discount;

        // Print results
        // #1
        Console.WriteLine("The final price is: {0:F2} lv.", costWithDiscount);
        Console.WriteLine("The discount is: {0:F2} lv.", discount);

        // #2
        //Console.WriteLine($"The final price is: {costWithDiscount:F2} lv.");
        //Console.WriteLine($"The discount is: {discount:F2} lv.");
    }
}
