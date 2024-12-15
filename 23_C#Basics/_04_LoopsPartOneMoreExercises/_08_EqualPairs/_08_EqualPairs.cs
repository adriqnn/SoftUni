using System;

public class _08_EqualPairs
{
    public static void Main(string[] args)
    {
        // Read input value
        int n = int.Parse(Console.ReadLine());

        // Add variables
        int initialSum = 0;
        bool sameValue = true;
        List<int> sums = new List<int>();

        // Process each pair of numbers and calculate sums
        for (int i = 0; i < n; i++)
        {
            int numberOne = int.Parse(Console.ReadLine());
            int numberTwo = int.Parse(Console.ReadLine());

            int currentSum = numberOne + numberTwo;
            sums.Add(currentSum);

            if (i == 0)
            {
                initialSum = currentSum;
            }
            else
            {
                if (initialSum != currentSum)
                {
                    sameValue = false;
                }
            }
        }

        // Print the result
        if (sameValue)
        {
            Console.WriteLine("Yes, value={0}", initialSum);
        }
        else
        {
            int bigNumber = Math.Max(sums[sums.Count - 1], sums[sums.Count - 2]);
            int smallNumber = Math.Min(sums[sums.Count - 1], sums[sums.Count - 2]);
            Console.WriteLine("No, maxdiff={0}", bigNumber - smallNumber);
        }
    }
}
