using System;
using System.Text;

public class _01_HelloSoftUni
{
    public static void Main(string[] args)
    {
        // Read input value
        string console = Console.ReadLine();

        // Add variable
        StringBuilder rebuild = new StringBuilder();

        // Reverse string
        for (int i = console.Length - 1; i >= 0; i--)
        {
            char symbol = console[i];
            rebuild.Append(symbol);
        }

        Console.WriteLine(rebuild.ToString());
    }
}
