using System;
using System.Linq;

public class _05_KaminoFactory
{
    public static void Main(string[] args)
    {
        // Read input values
        int lengthOfSubsequence = int.Parse(Console.ReadLine());
        string console = Console.ReadLine();

        // Add variables
        int[] bestDNASample = new int[lengthOfSubsequence];
        int bestIndexDNA = int.MaxValue;
        int bestLengthDNA = 0;
        int bestSumDNA = 0;
        int bestPosition = 0;
        int position = 0;

        // Find best clones to make
        while (!console.Equals("Clone them!"))
        {
            position++;

            int[] currentDNA = console.Split("!", StringSplitOptions.RemoveEmptyEntries).Select(int.Parse).ToArray();

            int sumOfDNA = 0;
            int bestIndexOfCurrentDNA = 0;
            int indexOfCurrentDNA = 0;
            int lengthOfCurrentDNA = 0;
            int maxLengthOfCurrentDNA = 0;

            for (int i = 0; i < currentDNA.Length; i++)
            {
                if (currentDNA[i] == 1)
                {
                    sumOfDNA++;

                    if (lengthOfCurrentDNA == 0)
                    {
                        indexOfCurrentDNA = i;
                    }

                    lengthOfCurrentDNA++;
                }
                else
                {
                    lengthOfCurrentDNA = 0;
                }

                if (lengthOfCurrentDNA > maxLengthOfCurrentDNA)
                {
                    maxLengthOfCurrentDNA = lengthOfCurrentDNA;
                    bestIndexOfCurrentDNA = indexOfCurrentDNA;
                }
            }

            if ((maxLengthOfCurrentDNA > bestLengthDNA) || ((maxLengthOfCurrentDNA == bestLengthDNA) && (bestIndexOfCurrentDNA < bestIndexDNA))
                    || ((maxLengthOfCurrentDNA == bestLengthDNA) && (bestIndexOfCurrentDNA == bestIndexDNA) && sumOfDNA > bestSumDNA))
            {

                bestLengthDNA = maxLengthOfCurrentDNA;
                bestIndexDNA = bestIndexOfCurrentDNA;
                bestSumDNA = sumOfDNA;
                bestDNASample = currentDNA;
                bestPosition = position;
            }

            console = Console.ReadLine();
        }

        // Print result
        Console.WriteLine($"Best DNA sample {bestPosition} with sum: {bestSumDNA}.");
        Console.WriteLine(string.Join(" ", bestDNASample));
    }
}
