using System;

public class _04_WordFilter
{
    public static void Main(string[] args)
    {
        // Read input values
        string[] input = Console.ReadLine().Split(" ");
        string[] evenWords = input.Where(word => word.Length % 2 == 0).ToArray();

        // Print result
        foreach (string word in evenWords)
        {
            Console.WriteLine(word);
        }
    }
}
