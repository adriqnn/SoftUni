using System;

public class _03_OddOccurrences
{
    public static void Main(string[] args)
    {
        // Read input values
        string[] words = Console.ReadLine().Split(" ");

        // Add variable
        Dictionary<string, int> counts = new Dictionary<string, int>();

        // Extract the elements that occur odd times
        foreach (string word in words)
        {
            string wordInLowerCase = word.ToLower();

            if (counts.ContainsKey(wordInLowerCase))
            {
                counts[wordInLowerCase]++;
            }
            else
            {
                counts[wordInLowerCase] = 1;
            }
        }

        List<string> odds = new List<string>();

        foreach (KeyValuePair<string, int> entry in counts)
        {
            if (entry.Value % 2 == 1)
            {
                odds.Add(entry.Key);
            }
        }

        // Print result
        for (int i = 0; i < odds.Count; i++)
        {
            Console.Write(odds[i].ToString() + " ");
        }
    }
}
