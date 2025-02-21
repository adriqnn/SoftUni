using System;

public class _11_MathOperations
{
    public static void Main(string[] args)
    {
        // Read input values
        int n1 = int.Parse(Console.ReadLine());
        String operation = Console.ReadLine();
        int n2 = int.Parse(Console.ReadLine());

        // Create method for math operations
        mathOperations(n1, operation, n2);
    }

    private static void mathOperations(int n1, String operation, int n2)
    {
        double result = 0;

        if (operation.Equals("/"))
        {
            result = n1 / n2;
        }
        else if (operation.Equals("*"))
        {
            result = n1 * n2;
        }
        else if (operation.Equals("+"))
        {
            result = n1 + n2;
        }
        else if (operation.Equals("-"))
        {
            result = n1 - n2;
        }

        Console.WriteLine(result.ToString("0.##"));
    }
}
