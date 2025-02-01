using System;

public class _10_MultiplicationTable
{
    public static void Main(string[] args)
    {
        // Read input value 
        int n = int.Parse(Console.ReadLine());

        // Print multiplication table for a given nmber
        for (int i = 1; i <= 10; i++)
        {
            Console.WriteLine($"{n} X {i} = {n * i}");
        }
    }
}
