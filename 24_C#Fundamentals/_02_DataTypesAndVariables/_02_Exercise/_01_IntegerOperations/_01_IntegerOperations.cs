using System;

public class _01_IntegerOperations
{
    public static void Main(string[] args)
    {
        // Read input values
        int n1 = int.Parse(Console.ReadLine()), n2 = int.Parse(Console.ReadLine()), n3 = int.Parse(Console.ReadLine()), n4 = int.Parse(Console.ReadLine());

        // Calculate result
        int result = ((n1 + n2) / n3) * n4;

        // Print result
        Console.WriteLine(result);
    }
}
