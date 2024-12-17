using System;

public class _04_Sequence2K1
{
    public static void Main(string[] args)
    {
        // Read input value
        int n = int.Parse(Console.ReadLine());

        // Staging
        int k = 1;

        // Use a while loop to generate and print the sequence
        while (k <= n)
        {
            Console.WriteLine(k);

            k = 2 * k + 1;
        }
    }
}
