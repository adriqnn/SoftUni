using System;

public class _08_MagicSum
{
    public static void Main(string[] args)
    {
        // Read input values
        int[] numbersArray = Console.ReadLine().Split().Select(int.Parse).ToArray();
        int n = int.Parse(Console.ReadLine());

        // Print each pair that the sum of equals the number n
        for (int i = 0; i < numbersArray.Length; i++)
        {
            for (int j = i + 1; j < numbersArray.Length; j++)
            {
                if (numbersArray[i] + numbersArray[j] == n)
                {
                    Console.WriteLine(numbersArray[i] + " " + numbersArray[j]);
                }
            }
        }
    }
}
