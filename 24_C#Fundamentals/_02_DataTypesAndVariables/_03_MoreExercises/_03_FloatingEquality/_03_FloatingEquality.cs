using System;

public class _03_FloatingEquality
{
    public static void Main(string[] args)
    {
        // Read input values
        double n1 = double.Parse(Console.ReadLine());
        double n2 = double.Parse(Console.ReadLine());

        // Add comparator value
        double epsilon = 0.000001;

        // Print result
        Console.WriteLine(Math.Abs(n1 - n2) <= epsilon ? "True" : "False");
    }
}
