using System;

public class _08_FactorialDivision
{
    public static void Main(string[] args)
    {
        // Read input values
        int n1 = int.Parse(Console.ReadLine());
        int n2 = int.Parse(Console.ReadLine());

        // Print result from the factorial division method
        Console.WriteLine($"{(1.00 * factorialDivision(n1)) / factorialDivision(n2):F2}");
    }
    private static long factorialDivision(int n)
    {
        long factorial = 1;

        for (int i = 2; i <= n; i++)
        {
            factorial = factorial * i;
        }

        return factorial;
    }
}
