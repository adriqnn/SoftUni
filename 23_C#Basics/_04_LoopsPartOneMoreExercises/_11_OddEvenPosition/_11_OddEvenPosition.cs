using System;

public class _11_OddEvenPosition
{
    public static void Main(string[] args)
    {
        // Read input values
        int n = int.Parse(Console.ReadLine());

        // Add variables
        List<double> odds = new List<double>();
        double oddsSum = 0;
        List<double> evens = new List<double>();
        double evensSum = 0;

        // Read even and odd numbers for statistics
        for (int i = 0; i < n; i++)
        {
            double number = double.Parse(Console.ReadLine());

            if (i % 2 == 0)
            {
                odds.Add(number);
                oddsSum += number;
            }
            else
            {
                evens.Add(number);
                evensSum += number;
            }
        }

        // Calculate statistics for odd numbers and for even numbers based on the input values
        if (n == 0)
        {
            Console.WriteLine("OddSum=0.00,\n OddMin=No,\n OddMax=No,\n EvenSum=0.00,\n EvenMin=No,\n EvenMax=No");
        }
        else if (n == 1)
        {
            double bigNumberOdd = odds.Count > 0 ? odds.Max() : 0;
            double smallNumberOdd = odds.Count > 0 ? odds.Min() : 0;
            Console.WriteLine($"OddSum={oddsSum:F2},\n OddMin={smallNumberOdd:F2},\n OddMax={bigNumberOdd:F2},\n EvenSum=0.00,\n EvenMin=No,\n EvenMax=No");
        }
        else
        {
            double bigNumberOdd = odds.Max();
            double smallNumberOdd = odds.Min();
            double bigNumberEven = evens.Count > 0 ? evens.Max() : 0;
            double smallNumberEven = evens.Count > 0 ? evens.Min() : 0;
            Console.WriteLine($"OddSum={oddsSum:F2},\n OddMin={smallNumberOdd:F2},\n OddMax={bigNumberOdd:F2},\n EvenSum={evensSum:F2},\n EvenMin={smallNumberEven:F2},\n EvenMax={bigNumberEven:F2}");
        }
    }
}
