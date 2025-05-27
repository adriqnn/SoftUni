using System;

public class _05_PrintPartOfASCIITable
{
    public static void Main(string[] args)
    {
        // Read input values
        int n1 = int.Parse(Console.ReadLine());
        int n2 = int.Parse(Console.ReadLine());

        // Print ASCII range
        for (int i = n1; i <= n2; i++)
        {
            char symbol = (char) i;
            Console.Write(symbol + " ");
        }
    }
}
