using System;

public class _04_PrintAndSum
{
    public static void Main(string[] args)
    {
        // Read input values
        int nStart = int.Parse(Console.ReadLine());
        int nEnd = int.Parse(Console.ReadLine());

        // Add variable
        int sum = 0;

        // Print numbers
        for (int i = nStart; i <= nEnd; i++)
        {
            Console.Write(i + " ");
            sum += i;
        }

        // Print result
        Console.WriteLine();
        Console.WriteLine($"Sum: {sum}");
    }
}
