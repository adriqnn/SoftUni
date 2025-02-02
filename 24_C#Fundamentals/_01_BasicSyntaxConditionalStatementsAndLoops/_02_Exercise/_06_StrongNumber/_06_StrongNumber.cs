using System;

public class _06_StrongNumber
{
    public static void Main(string[] args)
    {
        // Read input values
        string console = Console.ReadLine();
        int n = int.Parse(console);

        // Add variable
        int sum = 0;

        // Sum values
        for (int i = 0; i < console.Length; i++)
        {
            char symbol = console[i];
            int num = (int) char.GetNumericValue(symbol);

            int factorial = 1;
            for (int j = 1; j <= num; j++)
            {
                factorial = factorial * j;

            }

            sum += factorial;
        }

        // Print result
        if (sum == n)
        {
            Console.WriteLine("yes");
        }
        else
        {
            Console.WriteLine("no");
        }
    }
}
