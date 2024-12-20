using System;

public class _02_MultiplicationTable
{
    public static void Main(string[] args)
    {
        // Print multiplication table from 1 to 10
        for (int i = 1; i <= 10; i++)
        {
            for (int j = 1; j <= 10; j++)
            {
                Console.WriteLine($"{i} * {j} = {i * j}");
            }
        }
    }
}
